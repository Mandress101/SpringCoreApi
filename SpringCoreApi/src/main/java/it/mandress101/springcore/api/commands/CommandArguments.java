package it.mandress101.springcore.api.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandArguments {

    private final CommandSender sender;
    private final String label;
    private final String[] args;

    public CommandArguments(CommandSender sender, String label, String[] args) {
        this.sender = sender;
        this.label = label;
        this.args = args;
    }

    public int length() {
        return this.args.length;
    }

    public Player getPlayer() {
        if (!(sender instanceof Player)) return null;
        return (Player) sender;
    }

    public CommandSender getSender() {
        return sender;
    }

    public String getLabel() {
        return label;
    }

    public String[] getArgs() {
        return args;
    }
}
