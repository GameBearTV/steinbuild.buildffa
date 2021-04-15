package de.steinbuild.buildffa.events;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;


public class Events implements Listener {
    @EventHandler
    public void onbreak(BlockBreakEvent breakevent) {

        if(breakevent.getPlayer().getGameMode()== GameMode.SURVIVAL){
            breakevent.setCancelled(true);
        }
    }
    public void onhunger(FoodLevelChangeEvent foodevent){
        foodevent.setCancelled(true);
    }

}

