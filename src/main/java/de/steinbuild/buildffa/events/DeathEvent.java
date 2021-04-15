package de.steinbuild.buildffa.events;

import de.steinbuild.buildffa.utils.data;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathEvent implements Listener {
    @EventHandler
    public void ondeath(PlayerDeathEvent deathevent){
        deathevent.setDeathMessage(null);
        deathevent.getDrops().clear();

        Player killer = deathevent.getEntity().getKiller();
        Player killed = deathevent.getEntity().getPlayer();

        killer.setMaxHealth(20);
        killer.setHealth(20);
        killer.sendMessage(data.getPrefix()+"Du hast §a§l"+killed.getName()+"§r§7getötet");

        killed.sendMessage(data.getPrefix()+"Du wurdest von §a§l"+killer.getName()+"§r§7getötet");
    }
}
