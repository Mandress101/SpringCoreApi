package it.mandress101.springcore.api.abstracts;

import it.mandress101.springcore.database.centraldata.MongoStorage;
import it.mandress101.springcore.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;
import java.util.Arrays;

public abstract class SpringCoreRankRservedCommand extends BukkitCommand {

    private String rankRequested;

    public SpringCoreRankRservedCommand(@NotNull String commandName, String[] aliases, String description, String permission, String permission_message, String rankRquested) {
        super(commandName);
        this.setAliases(Arrays.asList(aliases));
        this.setDescription(description);
        this.setPermissionMessage(permission_message);
        this.rankRequested = rankRquested;
        try {
            Field field = Bukkit.getServer().getClass().getDeclaredField("commandMap");
            field.setAccessible(true);
            CommandMap map = (CommandMap) field.get(Bukkit.getScheduler());
            map.register(commandName, this);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {
        if(MongoStorage.playerHasRank(sender.getName(), this.rankRequested)) {
            execute(sender, args);
        } else {
            sender.sendMessage(Utils.translate(""));
        }
        return false;
    }

    public abstract void execute(CommandSender sender, String[] args);
}
