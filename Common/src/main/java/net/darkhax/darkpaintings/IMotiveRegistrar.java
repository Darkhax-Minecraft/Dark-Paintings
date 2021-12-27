package net.darkhax.darkpaintings;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.decoration.Motive;

@FunctionalInterface
public interface IMotiveRegistrar {

    Motive register(String id, int width, int height, Component author);
}
