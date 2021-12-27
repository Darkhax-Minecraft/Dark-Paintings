package net.darkhax.darkpaintings;

import net.minecraft.network.chat.Component;

public class DarkPaintingsCommon {

    private final AuthorManager authors = new AuthorManager();

    public void registerPaintings(IMotiveRegistrar registrar) {

        final Component authorDarkhax = authors.makeAuthor("darkhax");
        registrar.register("in_the_air", 32, 16, authorDarkhax);
        registrar.register("skyblock", 16, 16, authorDarkhax);
        registrar.register("mr_moon", 16, 16, authorDarkhax);
        registrar.register("tetromino", 16, 32, authorDarkhax);
        registrar.register("daybreak", 32, 16, authorDarkhax);

        final Component authormmg28rtt = authors.makeAuthor("mmg28rtt");
        registrar.register("planets", 32, 16, authormmg28rtt);

        final Component authorFuryDev = authors.makeAuthor("furydev");
        registrar.register("village", 64, 32, authorFuryDev);

        final Component authorAxeonlotl = authors.makeAuthor("axeonlotl");
        registrar.register("oceanic_view", 32, 16, authorAxeonlotl);
        registrar.register("watching_the_sunset", 32, 16, authorAxeonlotl);
        registrar.register("enderman", 32, 16, authorAxeonlotl);
        registrar.register("afternoon_volcano", 16, 32, authorAxeonlotl);
        registrar.register("crimson_taiga", 32, 16, authorAxeonlotl);

        final Component authorWouter = authors.makeAuthor("wouter");
        registrar.register("lumberjack", 64, 32, authorWouter);
        registrar.register("summer_heat", 32, 16, authorWouter);
        registrar.register("the_tower", 16, 32, authorWouter);
        registrar.register("bubbles", 16, 16, authorWouter);
        registrar.register("a_distant_light", 32, 16, authorWouter);

        final Component authorVydax = authors.makeAuthor("vydax");
        registrar.register("the_wheel", 32, 32, authorVydax);

        final Component authorAbsolem = authors.makeAuthor("absolem");
        registrar.register("whale_dream", 32, 32, authorAbsolem);
        registrar.register("cottage_by_the_river", 16, 16, authorAbsolem);
        registrar.register("seavibe", 16, 16, authorAbsolem);
        registrar.register("antler_maze", 16, 32, authorAbsolem);
        registrar.register("turkey", 16, 16, authorAbsolem);
        registrar.register("kerstball", 16, 16, authorAbsolem);
        registrar.register("snowman_scenery", 32, 16, authorAbsolem);
        registrar.register("santa_moon", 32, 32, authorAbsolem);

        final Component authorPunpudle = authors.makeAuthor("punpudle");
        registrar.register("the_secret_neighborhood", 32, 32, authorPunpudle);
        registrar.register("last_dreams_at_candyland", 32, 16, authorPunpudle);
        registrar.register("the_most_sweet_candy", 16, 16, authorPunpudle);
        registrar.register("sir_ramfrez_yarn_paradise", 16, 16, authorPunpudle);
    }

    public AuthorManager getAuthorManager() {

        return this.authors;
    }
}