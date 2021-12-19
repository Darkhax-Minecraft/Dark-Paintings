package net.darkhax.darkpaintings.authors;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.item.PaintingType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class AuthorManager {

	private static final Map<PaintingType, TextComponent> authorNames = new HashMap<>();
	
	static {
		
		final TextComponent authorKristoffer = makeAuthor("kristoffer");
		registerAuthor(PaintingType.KEBAB, authorKristoffer);
		registerAuthor(PaintingType.AZTEC, authorKristoffer);
		registerAuthor(PaintingType.ALBAN, authorKristoffer);
		registerAuthor(PaintingType.AZTEC2, authorKristoffer);
		registerAuthor(PaintingType.BOMB, authorKristoffer);
		registerAuthor(PaintingType.PLANT, authorKristoffer);
		registerAuthor(PaintingType.WASTELAND, authorKristoffer);
		registerAuthor(PaintingType.POOL, authorKristoffer);
		registerAuthor(PaintingType.COURBET, authorKristoffer);
		registerAuthor(PaintingType.SEA, authorKristoffer);
		registerAuthor(PaintingType.SUNSET, authorKristoffer);
		registerAuthor(PaintingType.CREEBET, authorKristoffer);
		registerAuthor(PaintingType.WANDERER, authorKristoffer);
		registerAuthor(PaintingType.GRAHAM, authorKristoffer);
		registerAuthor(PaintingType.MATCH, authorKristoffer);
		registerAuthor(PaintingType.BUST, authorKristoffer);
		registerAuthor(PaintingType.STAGE, authorKristoffer);
		registerAuthor(PaintingType.VOID, authorKristoffer);
		registerAuthor(PaintingType.SKULL_AND_ROSES, authorKristoffer);
		registerAuthor(PaintingType.FIGHTERS, authorKristoffer);
		registerAuthor(PaintingType.POINTER, authorKristoffer);
		registerAuthor(PaintingType.PIGSCENE, authorKristoffer);
		registerAuthor(PaintingType.BURNING_SKULL, authorKristoffer);
		registerAuthor(PaintingType.SKELETON, authorKristoffer);
		registerAuthor(PaintingType.DONKEY_KONG, authorKristoffer);
		
		final TextComponent authorUnknown = makeAuthor("unknown");
		registerAuthor(PaintingType.WITHER, authorUnknown);
	}
	
	public static void registerAuthor(PaintingType painting, TextComponent author) {
		
		authorNames.put(painting, author);
	}
	
	public static TextComponent getAuthor(PaintingType painting) {
		
		return authorNames.computeIfAbsent(painting, p -> {
			
			final ResourceLocation id = p.getRegistryName();
			final String artistKey = "painting." + id.getNamespace() + "." + id.getPath() + ".artist";
			return I18n.exists(artistKey) ? new TranslationTextComponent("tooltip.darkpaintings.artist", new TranslationTextComponent(artistKey)) : null;
		});
	}
	
	public static TextComponent makeAuthor(String author) {
		
		return new TranslationTextComponent("darkpaintings.author." + author);
	}
}
