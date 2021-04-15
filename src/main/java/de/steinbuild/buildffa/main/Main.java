package de.steinbuild.buildffa.main;


import de.steinbuild.buildffa.events.Events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static Main plugin;
    @Override
    public void onEnable() {
        plugin =this;
        registerCommands();
        registerEvents();

    }

    private void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new Events(),this);

    }

    private void registerCommands() {

    }

    public static Main getPlugin() {
        return plugin;
    }
}
