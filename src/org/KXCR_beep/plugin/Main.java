package org.KXCR_beep.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Plugin Enable");
    }
    @Override
    public void onDisable() {
        getLogger().info("Plugin Disable");
    }
}
