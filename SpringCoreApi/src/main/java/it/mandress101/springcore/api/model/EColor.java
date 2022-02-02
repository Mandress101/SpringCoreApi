package it.mandress101.springcore.api.model;

import org.bukkit.ChatColor;

public enum EColor {

    DARK_RED("Dark Red", "&4", ChatColor.DARK_RED),
    RED("Red", "&c", ChatColor.RED),
    GOLD("Gold", "&6", ChatColor.GOLD),
    YELLOW("Yellow", "&e", ChatColor.YELLOW),
    GREEN("Green", "&a", ChatColor.GREEN),
    DARK_GREEN("Dark Green", "&2", ChatColor.DARK_GREEN),
    CYAN("Cyan", "&b", ChatColor.AQUA),
    BLUE("Blue", "&9", ChatColor.BLUE),
    DARK_BLUE("Dark Blue", "&1", ChatColor.DARK_BLUE),
    DARK_PURPLE("Dark Purple", "&5", ChatColor.DARK_PURPLE),
    PURPLE("Purple", "&d", ChatColor.LIGHT_PURPLE),

    HEX_RED("Hex Red", "&#FB0000", ChatColor.valueOf("#FB0000"));

    String name;
    String color_code;
    ChatColor colorClass;

    EColor(String name, String color, ChatColor colorClass) {
        this.name = name;
        this.color_code = color;
        this.colorClass = colorClass;
    }

    public String getName() {
        return name;
    }

    public String getColorCode() {
        return color_code;
    }

    public ChatColor getColorClass() {
        return colorClass;
    }
}
