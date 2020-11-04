package net.darkhax.darkpaintings;

import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("darkpaintings")
public class DarkPaintings {
    
    public DarkPaintings() {

        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(PaintingType.class, this::registerPaintings);
    }
    
    private void registerPaintings (Register<PaintingType> event) {
        
        final IForgeRegistry<PaintingType> registry = event.getRegistry();
        
        registry.register(this.createPainting("in_the_air", 32, 16));
        registry.register(this.createPainting("skyblock", 16, 16));
        registry.register(this.createPainting("planets", 32, 16));
        registry.register(this.createPainting("village", 64, 32));
        registry.register(this.createPainting("oceanic_view", 32, 16));
        registry.register(this.createPainting("watching_the_sunset", 32, 16));
        registry.register(this.createPainting("enderman", 32, 16));
        registry.register(this.createPainting("lumberjack", 64, 32));
        registry.register(this.createPainting("summer_heat", 32, 16));
        registry.register(this.createPainting("the_tower", 16, 32));
        registry.register(this.createPainting("bubbles", 16, 16));
        registry.register(this.createPainting("afternoon_volcano", 16, 32));
        registry.register(this.createPainting("the_wheel", 32, 32));
        registry.register(this.createPainting("mr_moon", 16, 16));
    }
    
    private PaintingType createPainting (String id, int width, int height) {
        
        final PaintingType type = new PaintingType(width, height);
        type.setRegistryName("darkpaintings", id);
        return type;
    }
}