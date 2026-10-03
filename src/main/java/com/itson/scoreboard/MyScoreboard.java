package com.itson.scoreboard;

import org.bukkit.plugin.java.JavaPlugin;

public class MyScoreboard extends JavaPlugin {

  @Override
  public void onEnable() {
    getLogger().info("MyScoreboard v" + getPluginMeta().getDescription() + " has been enabled.");
  }

  @Override
  public void onDisable() {
    getLogger().info("MyScoreboard has been disabled.");
  }
}
