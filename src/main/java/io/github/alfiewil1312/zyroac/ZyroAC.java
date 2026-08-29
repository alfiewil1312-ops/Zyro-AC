package io.github.alfiewil1312.zyroac;

import org.bukkit.plugin.java.JavaPlugin;

public class ZyroAC extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ZyroAC enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ZyroAC disabled!");
    }
}
