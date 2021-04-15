package de.steinbuild.buildffa.main;

import de.steinbuild.buildffa.events.ProtectionEvents;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Java15Compat;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        //Events
        Bukkit.getPluginManager().registerEvents(new ProtectionEvents(),this);
        //Commands
    }

}
