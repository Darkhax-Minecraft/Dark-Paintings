package net.darkhax.darkpaintings;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DarkPaintings implements ModInitializer {
	
	@Override
	public void onInitialize() {

		// Darkhax
        this.createPainting("in_the_air", 32, 16);
        this.createPainting("skyblock", 16, 16);
		this.createPainting("tetromino", 16, 32);
		this.createPainting("daybreak", 32, 16);
        this.createPainting("mr_moon", 16, 16);
        
        // mmg28rtt
        this.createPainting("planets", 32, 16);
        
        // furydev
        this.createPainting("village", 64, 32);
        
        // vydax
        this.createPainting("the_wheel", 32, 32);
        
        // axeonlotl
        this.createPainting("oceanic_view", 32, 16);
        this.createPainting("watching_the_sunset", 32, 16);
        this.createPainting("enderman", 32, 16);
		this.createPainting("crimson_taiga", 32, 16);
        this.createPainting("afternoon_volcano", 16, 32);
		
        // wouter
        this.createPainting("lumberjack", 64, 32);
        this.createPainting("summer_heat", 32, 16);
        this.createPainting("the_tower", 16, 32);
        this.createPainting("bubbles", 16, 16);
		this.createPainting("a_distant_light", 32, 16);
		
		// absolem
		this.createPainting("whale_dream", 32, 32);
		this.createPainting("cottage_by_the_river", 16, 16);
		this.createPainting("seavibe", 16, 16);
		this.createPainting("antler_maze", 16, 32);
		this.createPainting("turkey", 16, 16);
		this.createPainting("kerstball", 16, 16);
		this.createPainting("snowman_scenery", 32, 16);
		this.createPainting("santa_moon", 32, 32);
		
		// punpudle
		this.createPainting("the_secret_neighborhood", 32, 32);
		this.createPainting("last_dreams_at_candyland", 32, 16);
		this.createPainting("the_most_sweet_candy", 16, 16);
	    this.createPainting("sir_ramfrez_yarn_paradise", 16, 16);	
	}
    
    private PaintingMotive createPainting (String id, int width, int height) {
        
        final PaintingMotive type = new PaintingMotive(width, height);
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("darkpaintings", id), type);
        return type;
    }
}