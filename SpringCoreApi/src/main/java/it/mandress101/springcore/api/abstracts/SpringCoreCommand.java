package it.mandress101.springcore.api.abstracts;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public abstract class SpringCoreCommand extends BukkitCommand {

    public SpringCoreCommand(@NotNull String commandName, String[] aliases, String description, String permission, String permission_message) {
        super(commandName);
        this.setAliases(Arrays.asList(aliases));
        this.setDescription(description);
        this.setPermissionMessage(permission_message);
        try {
            Field field = Bukkit.getServer().getClass().getDeclaredField("commandMap");
            field.setAccessible(true);
            CommandMap map = (CommandMap) field.get(Bukkit.getServer());
            map.register(commandName, this);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {
        execute(sender, args);
        return false;
    }

    public abstract void execute(CommandSender sender, String[] args);

    @NotNull
    @Override
    public List<String> tabComplete(@NotNull CommandSender sender, @NotNull String alias, @NotNull String[] args) throws IllegalArgumentException {
        return onTabComplete(sender, args);
    }

    public abstract List<String> onTabComplete(CommandSender sender, String[] args);

}
