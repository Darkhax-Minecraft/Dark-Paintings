package net.darkhax.darkpaintings;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class DarkPaintingsForge {

    public DarkPaintingsForge() {

        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Motive.class, this::registerPaintings);
    }

    private void registerPaintings(RegistryEvent.Register<Motive> registry) {

        final DarkPaintingsCommon common = new DarkPaintingsCommon();

        common.registerPaintings((id, width, height, author) -> {

            final Motive motive = new Motive(width, height);
            motive.setRegistryName(new ResourceLocation(Constants.MOD_ID, id));
            registry.getRegistry().register(motive);
            common.getAuthorManager().registerAuthor(motive, author);
            return motive;
        });
    }
}