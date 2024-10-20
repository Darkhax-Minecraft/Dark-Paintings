package net.darkhax.darkpaintings.common.impl;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DarkPaintingsMod {

    public static final String MOD_ID = "darkpaintings";
    public static final String MOD_NAME = "DarkPaintings";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static ResourceLocation id(String path) {
        return ResourceLocation.tryBuild(MOD_ID, path);
    }
}