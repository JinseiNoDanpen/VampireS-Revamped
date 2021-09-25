package org.shinodanpen.vampiresrevamped;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class ActionListener implements Listener {

    private Plugin plugin;

    public ActionListener(Plugin plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
    }
}
