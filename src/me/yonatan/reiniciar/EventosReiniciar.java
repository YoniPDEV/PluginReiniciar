package me.yonatan.reiniciar;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class EventosReiniciar implements Listener{
	
	@EventHandler
	public void SemPVPAoReiniciar(EntityDamageEvent e) {
		if(ComandoReiniciar.retirar == true) {
			Player p = (Player) e.getEntity();
			e.setCancelled(true);
			p.sendMessage("§cAlgumas funções foram desativadas por causa do reinicio.");
		}
	}
	@EventHandler
	public void SemConstruir(BlockPlaceEvent e) {
		if(ComandoReiniciar.retirar == true) {
			Player p = (Player) e.getPlayer();
			e.setCancelled(true);
			p.sendMessage("§cAlgumas funções foram desativadas por causa do reinicio.");
		}
	}
	@EventHandler
	public void SemColocarBloco(BlockBreakEvent e) {
		if(ComandoReiniciar.retirar == true) {
			Player p = (Player) e.getPlayer();
			e.setCancelled(true);
			p.sendMessage("§cAlgumas funções foram desativadas por causa do reinicio.");
		}
	}
	@EventHandler
	public void SemComando(PlayerCommandPreprocessEvent e) {
		if(ComandoReiniciar.retirar == true) {
			Player p = (Player) e.getPlayer();
			e.setCancelled(true);
			p.sendMessage("§cAlgumas funções foram desativadas por causa do reinicio.");
		}
	}

}
