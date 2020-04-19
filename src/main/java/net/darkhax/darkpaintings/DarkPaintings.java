package net.darkhax.darkpaintings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.darkhax.bookshelf.registry.RegistryHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("darkpaintings")
public class DarkPaintings {
    
    public static final Logger LOGGER = LogManager.getLogger("Dark Paintings");
    private final RegistryHelper registry = new RegistryHelper("darkpaintings", LOGGER, null);
    
    public DarkPaintings() {
        
    	registry.registerPainting("in_the_air", 32, 16);
    	registry.registerPainting("skyblock", 16, 16);
    	registry.registerPainting("planets", 32, 16);
    	registry.registerPainting("village", 64, 32);
    	registry.registerPainting("oceanic_view", 32, 16);
    	registry.registerPainting("watching_the_sunset", 32, 16);
    	registry.registerPainting("enderman", 32, 16);
    	
        this.registry.initialize(FMLJavaModLoadingContext.get().getModEventBus());
    }
}