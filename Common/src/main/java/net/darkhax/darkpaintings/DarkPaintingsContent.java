package net.darkhax.darkpaintings;

import net.darkhax.bookshelf.api.Services;
import net.darkhax.bookshelf.api.registry.RegistryDataProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.item.Items;

public final class DarkPaintingsContent extends RegistryDataProvider {

    public static void init() {

        Services.REGISTRIES.loadContent(new DarkPaintingsContent());
    }

    private DarkPaintingsContent() {

        super(Constants.MOD_ID);

        final Component authorDarkhax = this.createAuthorName("darkhax");
        this.painting("in_the_air", 32, 16, authorDarkhax);
        this.painting("skyblock", 16, 16, authorDarkhax);
        this.painting("mr_moon", 16, 16, authorDarkhax);
        this.painting("tetromino", 16, 32, authorDarkhax);
        this.painting("daybreak", 32, 16, authorDarkhax);

        final Component authormmg28rtt = this.createAuthorName("mmg28rtt");
        this.painting("planets", 32, 16, authormmg28rtt);

        final Component authorFuryDev = this.createAuthorName("furydev");
        this.painting("village", 64, 32, authorFuryDev);

        final Component authorAxeonlotl = this.createAuthorName("axeonlotl");
        this.painting("oceanic_view", 32, 16, authorAxeonlotl);
        this.painting("watching_the_sunset", 32, 16, authorAxeonlotl);
        this.painting("enderman", 32, 16, authorAxeonlotl);
        this.painting("afternoon_volcano", 16, 32, authorAxeonlotl);
        this.painting("crimson_taiga", 32, 16, authorAxeonlotl);

        final Component authorWouter = this.createAuthorName("wouter");
        this.painting("lumberjack", 64, 32, authorWouter);
        this.painting("summer_heat", 32, 16, authorWouter);
        this.painting("the_tower", 16, 32, authorWouter);
        this.painting("bubbles", 16, 16, authorWouter);
        this.painting("a_distant_light", 32, 16, authorWouter);

        final Component authorVydax = this.createAuthorName("vydax");
        this.painting("the_wheel", 32, 32, authorVydax);

        final Component authorAbsolem = this.createAuthorName("absolem");
        this.painting("whale_dream", 32, 32, authorAbsolem);
        this.painting("cottage_by_the_river", 16, 16, authorAbsolem);
        this.painting("seavibe", 16, 16, authorAbsolem);
        this.painting("antler_maze", 16, 32, authorAbsolem);
        this.painting("turkey", 16, 16, authorAbsolem);
        this.painting("kerstball", 16, 16, authorAbsolem);
        this.painting("snowman_scenery", 32, 16, authorAbsolem);
        this.painting("santa_moon", 32, 32, authorAbsolem);

        final Component authorPunpudle = this.createAuthorName("punpudle");
        this.painting("the_secret_neighborhood", 32, 32, authorPunpudle);
        this.painting("last_dreams_at_candyland", 32, 16, authorPunpudle);
        this.painting("the_most_sweet_candy", 16, 16, authorPunpudle);
        this.painting("sir_ramfrez_yarn_paradise", 16, 16, authorPunpudle);

        Items.PAINTING
    }

    private Component createAuthorName(String name) {

        return Component.translatable("darkpaintings.author." + name);
    }

    private void painting(String id, int width, int height, Component author) {

        this.paintings.add(() -> new PaintingVariant(width, height), id);
    }
}