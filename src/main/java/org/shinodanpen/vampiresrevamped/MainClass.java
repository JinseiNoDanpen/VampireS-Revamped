package org.shinodanpen.vampiresrevamped;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Plugin(name = "VampireS Revamped", version = "1.0")
@Description(value = "VampireS remake for 1.17")
@Author(value = "shinodanpen")
@ApiVersion(ApiVersion.Target.v1_17)
public class MainClass extends JavaPlugin {

    public String plPrefix = "&7&l[&c&lVampireS&7&l] &8> ";
    private List<UUID> vampires = new ArrayList<>();
    private List<UUID> gods = new ArrayList<>();
    private List<UUID> noCooldown = new ArrayList<>();

    private File customConfigFile;
    private FileConfiguration customConfig;

    private static MainClass plugin;

    public MainClass() {
        plugin = this;
    }

    public static MainClass getInstance() {
        return plugin;
    }


    @Override
    public void onLoad() {
        plugin = this;
        getLogger().info("[VampireS Revamped] PLUGIN INITIALIZING.");
    }

    @Override
    public void onEnable() {

        getLogger().info("[VampireS Revamped] PLUGIN ENABLED.");
    }

    @Override
    public void onDisable() {
        getLogger().info("[VampireS Revamped] PLUGIN DISABLED.");
    }

    public static org.bukkit.plugin.Plugin getPlugin(){
        return plugin;
    }
}
