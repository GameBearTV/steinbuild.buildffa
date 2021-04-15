package de.steinbuild.buildffa.main;

import de.steinbuild.buildffa.events.ProtectionEvents;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Java15Compat;

public class Main extends JavaPlugin {
    public static Main plugin;
    @Override
    public void onEnable() {
        plugin =this;
        registerCommands();
        registerEvents();

    }

    private void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new ProtectionEvents(),this);

    }

    private void registerCommands() {

    }

    public static Main getPlugin() {
        return plugin;
    }
}
