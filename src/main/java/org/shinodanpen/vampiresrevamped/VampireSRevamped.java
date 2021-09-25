package org.shinodanpen.vampiresrevamped;

import org.bukkit.plugin.java.JavaPlugin;

public class VampireSRevamped extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("[VampireS Revamped] PLUGIN ENABLED.");
    }

    @Override
    public void onDisable() {
        getLogger().info("[VampireS Revamped] PLUGIN DISABLED.");
    }
}
