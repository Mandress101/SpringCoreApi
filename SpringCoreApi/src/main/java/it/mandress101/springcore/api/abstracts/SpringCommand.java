package it.mandress101.springcore.api.abstracts;

import it.mandress101.springcore.SpringCore;
import it.mandress101.springcore.api.commands.CommandArguments;
import it.mandress101.springcore.utils.Configurations;
import it.mandress101.springcore.utils.Tasks;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.defaults.BukkitCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class SpringCommand {

    public SpringCore plugin;
    private CommandExecutor executor;
    private CommandsArgs assigned;

    public void register() {
        this.assigned = Arrays.stream(this.getClass().getMethods()).filter(method -> method.getAnnotation(CommandsArgs.class) != null).map(method -> method.getAnnotation(CommandsArgs.class)).findFirst().orElse(null);

        if (assigned != null) {
            this.executor = new CommandExecutor(assigned.name(), assigned);
            //this.plugin.getCommandHandler().registerCommand(this, executor);
        }
    }

    public abstract void execute(CommandArguments command);

    public List<String> onTabComplete(CommandArguments command) {
        return new ArrayList<>();
    }

    public List<String> getDefaultTabComplete(CommandArguments command) {
        List<String> completors = new ArrayList<>();

        List<String> values = SpringCore.getAllPlayersName();

        String[] args = command.getArgs();

        if (args.length == 0) return new ArrayList<>();

        if (!args[args.length - 1].equalsIgnoreCase("")) {
            values.forEach(value -> {
                if (value.toLowerCase().startsWith(args[args.length - 1].toLowerCase())) {
                    completors.add(value);
                }
            });
        } else {
            completors.addAll(values);
        }
        return completors;
    }

    public class CommandExecutor extends BukkitCommand {

        private boolean inGameOnly, async;
        private CommandArguments executeArguments;

        public CommandExecutor(String name, CommandsArgs assigned) {
            super(name);
            this.setAliases(Arrays.asList(assigned.aliases()));
            this.setPermission(assigned.permission());
            this.inGameOnly = assigned.inGameOnly();
            this.async = assigned.async();
        }

        @Override
        public boolean execute(CommandSender sender, String label, String[] args) {
            if (this.inGameOnly && sender instanceof ConsoleCommandSender) {
                sender.sendMessage(ChatColor.RED + "This is for player use only!");
                return false;
            }
            if (this.getPermission().length() > 0 && !sender.hasPermission(this.getPermission())) {
                sender.sendMessage(Configurations.getMessage("messages.no-permission"));
                return false;
            }

            this.executeArguments = new CommandArguments(sender, label, args);

            if (this.async) {
                Tasks.runAsync(plugin, () -> SpringCommand.this.execute(executeArguments));
            } else {
                SpringCommand.this.execute(executeArguments);
            }
            return false;
        }

        @Override
        public List<String> tabComplete(CommandSender sender, String alias, String[] args) throws IllegalArgumentException {
            List<String> completors = onTabComplete(new CommandArguments(sender, null, args));

            if (completors.isEmpty()) {
                completors.addAll(getDefaultTabComplete(new CommandArguments(sender, null, args)));
            }
            return completors;
        }
    }

    public CommandsArgs getAssigned() {
        return assigned;
    }

}
