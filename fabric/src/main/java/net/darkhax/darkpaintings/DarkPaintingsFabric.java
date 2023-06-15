package net.darkhax.darkpaintings;

import net.fabricmc.api.ModInitializer;

public class DarkPaintingsFabric implements ModInitializer {

    @Override
    public void onInitialize() {

        DarkPaintingsContent.init();
    }
}