package Tamaized.CosmicReality.handler;

import java.io.File;
import java.io.IOException;

import Tamaized.CosmicReality.CosmicReality;
import Tamaized.TamModized.TamModBase;
import Tamaized.TamModized.config.AbstractConfigHandler;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigHandler extends AbstractConfigHandler {

	public ConfigHandler(TamModBase instance, File file, Configuration c) {
		super(instance, file, c);
	}

	@Override
	protected void init() {

	}

	@Override
	protected void loadData(boolean firstLoad) {

	}

	@Override
	protected void cleanup() throws IOException {

	}

}
