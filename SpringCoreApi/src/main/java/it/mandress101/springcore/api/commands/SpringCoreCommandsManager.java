package it.mandress101.springcore.api.commands;

import it.mandress101.springcore.SpringCore;
import it.mandress101.springcore.api.abstracts.SpringCoreCommand;
import it.mandress101.springcore.api.abstracts.SpringCoreSubCommand;
import it.mandress101.springcore.utils.Utils;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SpringCoreCommandsManager extends SpringCoreCommand {

    private String mainCommandName;
    private String usage;
    private String description;
    private String[] aliases;
    private String permission;
    private String permissionMessage;
    private ArrayList<SpringCoreSubCommand> subCommands = new ArrayList<>();
    private SpringCore plugin = SpringCore.getInstance();

    public SpringCoreCommandsManager(@NotNull String commandName, String usage, String[] aliases, String description, String permission, String permission_message) {
        super(commandName, aliases, description, permission, permission_message);
        this.mainCommandName = mainCommandName;
        this.description = description;
        this.aliases = aliases;
        this.permission = permission;
        this.permissionMessage = permissionMessage;
        this.usage = usageMessage;
    }

    public void setup() {
        plugin.addNewCommand(this);
        this.subCommands.add(null);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if(args.length == 0) {
            Utils.sendGenericMessage(sender, this.usage);
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] artgs) {
        return null;
    }
}
