package org.example;

import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;

public class ExampleModule extends ToggleableModule {

	public ExampleModule() {
		super("HDisabler", "Disables horizontal movement checks", ModuleCategory.CLIENT);
	}

	@Subscribe
	private void onSync(EventPlayerUpdate event){
		event.setYaw(1.0E10f);
	}

}
