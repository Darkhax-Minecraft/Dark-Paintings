package net.darkhax.darkpaintings;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.Motive;

public class DarkPaintingsFabric implements ModInitializer {

    @Override
    public void onInitialize() {

        final DarkPaintingsCommon common = new DarkPaintingsCommon();

        common.registerPaintings((id, width, height, author) -> {

            final Motive motive = new Motive(width, height);
            Registry.register(Registry.MOTIVE, new ResourceLocation(Constants.MOD_ID, id), motive);
            common.getAuthorManager().registerAuthor(motive, author);
            return motive;
        });
    }
}