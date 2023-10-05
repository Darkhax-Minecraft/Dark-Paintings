package net.darkhax.darkpaintings;

import net.darkhax.bookshelf.api.Services;
import net.darkhax.bookshelf.api.registry.RegistryDataProvider;
import net.minecraft.world.entity.decoration.PaintingVariant;

public final class DarkPaintingsContent extends RegistryDataProvider {

    public static void init() {

        Services.REGISTRIES.loadContent(new DarkPaintingsContent());
    }

    private DarkPaintingsContent() {

        super(Constants.MOD_ID);

        // Darkhax
        this.painting("in_the_air", 32, 16);
        this.painting("skyblock", 16, 16);
        this.painting("mr_moon", 16, 16);
        this.painting("scarlet_moon", 16, 16);
        this.painting("tetromino", 16, 32);
        this.painting("daybreak", 32, 16);

        // mmg28rtt
        this.painting("planets", 32, 16);

        // furydev
        this.painting("village", 64, 32);

        // axeonlotl
        this.painting("oceanic_view", 32, 16);
        this.painting("watching_the_sunset", 32, 16);
        this.painting("enderman", 32, 16);
        this.painting("afternoon_volcano", 16, 32);
        this.painting("crimson_taiga", 32, 16);

        // wouter
        this.painting("lumberjack", 64, 32);
        this.painting("summer_heat", 32, 16);
        this.painting("the_tower", 16, 32);
        this.painting("bubbles", 16, 16);
        this.painting("a_distant_light", 32, 16);

        // vydax
        this.painting("the_wheel", 32, 32);

        // absolem
        this.painting("whale_dream", 32, 32);
        this.painting("cottage_by_the_river", 16, 16);
        this.painting("seavibe", 16, 16);
        this.painting("antler_maze", 16, 32);
        this.painting("turkey", 16, 16);
        this.painting("kerstball", 16, 16);
        this.painting("snowman_scenery", 32, 16);
        this.painting("santa_moon", 32, 32);

        // punpudle
        this.painting("the_secret_neighborhood", 32, 32);
        this.painting("last_dreams_at_candyland", 32, 16);
        this.painting("the_most_sweet_candy", 16, 16);
        this.painting("sir_ramfrez_yarn_paradise", 16, 16);
    }

    private void painting(String id, int width, int height) {

        this.paintings.add(() -> new PaintingVariant(width, height), id);
    }
}