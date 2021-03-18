package me.yonatan.reiniciar;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class ComandoReiniciar implements CommandExecutor {

	public static boolean reiniciando = false;
	public static boolean retirar = false;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (reiniciando == false) {
			sender.sendMessage("§eServidor será reiniciado.");
			reiniciando = true;
			new BukkitRunnable() {
				int chamadas = 10;

				@Override
				public void run() {
					if (chamadas == 30 || chamadas == 25 || chamadas == 20 || chamadas == 15 || chamadas == 10
							|| chamadas == 5 || chamadas == 3 || chamadas == 2 || chamadas == 1) {
						for (Player p : Bukkit.getOnlinePlayers()) {
							p.sendMessage("");
							p.sendMessage("§e§l[AVISO]: §eO SERVIDOR SERÁ REINICIADO AUTOMATICAMENTE EM§E " + chamadas
									+ " §eMINUTOS.");
							p.sendMessage("");
						}

					}
					if (chamadas == 3) {
						retirar = true;
					}
					chamadas--;
					if (chamadas == 0) {

						cancel();
						for (Player p : Bukkit.getOnlinePlayers()) {
							p.kickPlayer("§cSERVIDOR REINICIANDO!");
						}
						new BukkitRunnable() {

							@Override
							public void run() {
								Bukkit.shutdown();
							}
						}.runTaskLater(Main.getPlugin(Main.class), 20);

					}
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 1200, 1200);
		} else {
			sender.sendMessage("§cServidor já está reiniciando.");
		}

		return false;
	}

}
