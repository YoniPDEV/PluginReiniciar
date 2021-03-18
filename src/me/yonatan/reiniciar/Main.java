package me.yonatan.reiniciar;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§6-=-=-=-=-=-=-=-");
		Bukkit.getConsoleSender().sendMessage("§fPlugin: §aReiniciarYoni");
		Bukkit.getConsoleSender().sendMessage("§fVersão: §a1.0");
		Bukkit.getConsoleSender().sendMessage("§6-=-=-=-=-=-=-=-");
		Bukkit.getPluginCommand("reiniciar").setExecutor(new ComandoReiniciar());
		
		Bukkit.getPluginManager().registerEvents(new EventosReiniciar(), this);
		
		new AutoStart(this);
	}
}
