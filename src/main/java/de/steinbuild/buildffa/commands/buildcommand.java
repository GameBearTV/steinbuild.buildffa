package de.steinbuild.buildffa.commands;

import de.steinbuild.buildffa.utils.data;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class buildcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        if(command.getName().equalsIgnoreCase("build")) {
            if (player.hasPermission("BuildFFA.*")) {
                if (player.getGameMode() == GameMode.SURVIVAL) {
                    player.setGameMode(GameMode.CREATIVE);
                } else if (player.getGameMode() == GameMode.CREATIVE) {
                    player.setGameMode(GameMode.SURVIVAL);
                }
            } else
                player.sendMessage(data.getNoperms());
        }else player.sendMessage(data.getPrefix()+"Du hast den Command /build nicht richtig benutzt. Schreibe: /build");
        return false;
    }
}
