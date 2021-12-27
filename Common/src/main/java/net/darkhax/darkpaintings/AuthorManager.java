package net.darkhax.darkpaintings;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.decoration.Motive;

import java.util.HashMap;
import java.util.Map;

public class AuthorManager {

    private final Map<Motive, Component> authorNames = new HashMap<>();

    public AuthorManager() {

        final Component authorKristoffer = makeAuthor("kristoffer");
        registerAuthor(Motive.KEBAB, authorKristoffer);
        registerAuthor(Motive.AZTEC, authorKristoffer);
        registerAuthor(Motive.ALBAN, authorKristoffer);
        registerAuthor(Motive.AZTEC2, authorKristoffer);
        registerAuthor(Motive.BOMB, authorKristoffer);
        registerAuthor(Motive.PLANT, authorKristoffer);
        registerAuthor(Motive.WASTELAND, authorKristoffer);
        registerAuthor(Motive.POOL, authorKristoffer);
        registerAuthor(Motive.COURBET, authorKristoffer);
        registerAuthor(Motive.SEA, authorKristoffer);
        registerAuthor(Motive.SUNSET, authorKristoffer);
        registerAuthor(Motive.CREEBET, authorKristoffer);
        registerAuthor(Motive.WANDERER, authorKristoffer);
        registerAuthor(Motive.GRAHAM, authorKristoffer);
        registerAuthor(Motive.MATCH, authorKristoffer);
        registerAuthor(Motive.BUST, authorKristoffer);
        registerAuthor(Motive.STAGE, authorKristoffer);
        registerAuthor(Motive.VOID, authorKristoffer);
        registerAuthor(Motive.SKULL_AND_ROSES, authorKristoffer);
        registerAuthor(Motive.FIGHTERS, authorKristoffer);
        registerAuthor(Motive.POINTER, authorKristoffer);
        registerAuthor(Motive.PIGSCENE, authorKristoffer);
        registerAuthor(Motive.BURNING_SKULL, authorKristoffer);
        registerAuthor(Motive.SKELETON, authorKristoffer);
        registerAuthor(Motive.DONKEY_KONG, authorKristoffer);

        final Component authorUnknown = makeAuthor("unknown");
        registerAuthor(Motive.WITHER, authorUnknown);
    }

    public void registerAuthor(Motive motive, Component author) {

        authorNames.put(motive, author);
    }

    public Component makeAuthor(String author) {

        return new TranslatableComponent("darkpaintings.author." + author);
    }
}
