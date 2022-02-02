package it.mandress101.springcore.api.abstracts;

import org.bukkit.command.CommandSender;

public abstract class SpringCoreSubCommand {

    public SpringCoreSubCommand() {

    }

    public abstract void onCommand(CommandSender sender, String[] args);

    public abstract String commandName();

    public abstract String commandDescription();

    public abstract String[] commandAliases();

}
