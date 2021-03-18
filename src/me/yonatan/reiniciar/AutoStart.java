package me.yonatan.reiniciar;

import java.util.Calendar;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class AutoStart extends BukkitRunnable{
	
	public AutoStart(JavaPlugin plugin) {
		runTaskTimerAsynchronously(plugin, 20, 20);
	}

	public static int diaDaSemana = 5;
	public static int horarioDoDia = 10;
	public static int minutoDaHora = 30;
	
	public static void start() {
		// Introduzir ação aqui.
	}
	
	@Override
	public void run() {
		
		Calendar calendar = Calendar.getInstance();
		
		if(calendar.get(Calendar.DAY_OF_WEEK) != diaDaSemana)return;
		if(calendar.get(Calendar.HOUR_OF_DAY) != horarioDoDia)return;
		if(calendar.get(Calendar.MINUTE) != minutoDaHora)return;
		
		start();
	}

}
