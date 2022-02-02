package it.mandress101.springcore.api;

import it.mandress101.springcore.SpringCore;
import it.mandress101.springcore.commands.SpyCommandsCommand;
import it.mandress101.springcore.commands.VanishCommand;
import it.mandress101.springcore.events.JoinEventPlayer;
import it.mandress101.springcore.manager.SHAKeyManager;
import org.bukkit.entity.Player;

import java.util.UUID;

public class BooleansMethods {

	public static boolean cmdSpyEnable(Player player) {
		return SpyCommandsCommand.SpyStaffList.contains(player);
	}
	
	public static boolean hasAllPerms(Player player) {
		return JoinEventPlayer.AllPermsPlayerList.contains(player);
	}
	
	public static boolean isPluginOwner(String player_name) {
		return SpringCore.PluginOwner.contains(player_name);
	}
	
	public static boolean isKeyInDatabase(String SHA_key) {
		return SHAKeyManager.KeyList.contains(SHA_key);
	}

	public static boolean isVanished(Player player) {
		return VanishCommand.VanishedList.contains(player);
	}

	public static boolean isUUIDVanished(UUID uuid) {
		return VanishCommand.uuidVanishedList.contains(uuid);
	}
}
