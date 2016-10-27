package fr.klemms.halloweengame;

import org.bukkit.plugin.java.JavaPlugin;

import fr.klemms.halloweeninvasion.api.InvasionAPI;
import fr.klemms.halloweeninvasion.api.InvasionMatchListener;
import fr.klemms.halloweeninvasion.api.MatchEndEvent;
import fr.klemms.halloweeninvasion.api.MatchStartEvent;

public class HalloweenGame extends JavaPlugin {

	@Override
	public void onEnable() {
		InvasionAPI.resetMatch(true, true, 6);
		
		InvasionAPI.registerListener(new InvasionMatchListener() {
			@Override
			public void onMatchEnd(MatchEndEvent event) {
				// Here do stuff when a match end !
				// Like recording statistics for each player
				// event.getDifficulty()
				// event.getDoorHealth()
				// event.getResult()
				// event.getPlayers()
				InvasionAPI.resetMatch(true, true, 6);
			}

			@Override
			public void onMatchStart(MatchStartEvent event) {
				// Here do stuff when a match start !
				// event.getDifficulty()
				// event.getPlayers()
			}
		});
	}

	@Override
	public void onDisable() {
		
	}
}
