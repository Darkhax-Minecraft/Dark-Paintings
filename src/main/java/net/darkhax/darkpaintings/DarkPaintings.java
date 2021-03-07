package net.darkhax.darkpaintings;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DarkPaintings implements ModInitializer {
	
	@Override
	public void onInitialize() {

        this.createPainting("in_the_air", 32, 16);
        this.createPainting("skyblock", 16, 16);
        this.createPainting("planets", 32, 16);
        this.createPainting("village", 64, 32);
        this.createPainting("oceanic_view", 32, 16);
        this.createPainting("watching_the_sunset", 32, 16);
        this.createPainting("enderman", 32, 16);
        this.createPainting("lumberjack", 64, 32);
        this.createPainting("summer_heat", 32, 16);
        this.createPainting("the_tower", 16, 32);
        this.createPainting("bubbles", 16, 16);
        this.createPainting("afternoon_volcano", 16, 32);
        this.createPainting("the_wheel", 32, 32);
        this.createPainting("mr_moon", 16, 16);
        this.createPainting("a_distant_light", 32, 16);
	}
    
    private PaintingMotive createPainting (String id, int width, int height) {
        
        final PaintingMotive type = new PaintingMotive(width, height);
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("darkpaintings", id), type);
        return type;
    }
}