package net.darkhax.darkpaintings.addons.hwyla;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import mcp.mobius.waila.api.IEntityAccessor;
import mcp.mobius.waila.api.IEntityComponentProvider;
import mcp.mobius.waila.api.IPluginConfig;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.item.PaintingEntity;
import net.minecraft.entity.item.PaintingType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DarkPaintingsComponentProvider implements IEntityComponentProvider {

	private static final Map<PaintingType, ITextComponent> titles = new HashMap<>();
	private static final Map<PaintingType, ITextComponent> artists = new HashMap<>();

	@Nullable
	public static ITextComponent getTitle(PaintingType painting) {

		return titles.computeIfAbsent(painting, p -> {

			final ResourceLocation id = p.getRegistryName();
			final String titleKey = "painting." + id.getNamespace() + "." + id.getPath() + ".title";
			return I18n.exists(titleKey) ? new TranslationTextComponent(titleKey).withStyle(TextFormatting.WHITE)
					: null;
		});
	}

	@Nullable
	public static ITextComponent getArtist(PaintingType painting) {

		return artists.computeIfAbsent(painting, p -> {

			final ResourceLocation id = p.getRegistryName();
			final String artistKey = "painting." + id.getNamespace() + "." + id.getPath() + ".artist";
			return I18n.exists(artistKey)
					? new TranslationTextComponent("tooltip.darkpaintings.artist",
							new TranslationTextComponent(artistKey))
					: null;
		});
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHead(List<ITextComponent> tooltip, IEntityAccessor accessor, IPluginConfig config) {

		if (accessor.getEntity() instanceof PaintingEntity) {

			final PaintingEntity painting = (PaintingEntity) accessor.getEntity();
			final ITextComponent title = getTitle(painting.motive);

			if (title != null && config.get(DarkPaintingsHwylaPlugin.SHOW_TITLE)) {

				tooltip.set(0, new TranslationTextComponent("tooltip.darkpaintings.title",
						accessor.getEntity().getDisplayName(), title));
			}
		}
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendBody(List<ITextComponent> tooltip, IEntityAccessor accessor, IPluginConfig config) {

		if (accessor.getEntity() instanceof PaintingEntity) {

			final PaintingEntity painting = (PaintingEntity) accessor.getEntity();
			final ITextComponent artist = getArtist(painting.motive);

			if (artist != null && config.get(DarkPaintingsHwylaPlugin.SHOW_ARTIST)) {

				tooltip.add(artist);
			}

			if (config.get(DarkPaintingsHwylaPlugin.SHOW_ID)) {

				tooltip.add(
						new TranslationTextComponent("tooltip.darkpaintings.id", painting.motive.getRegistryName()));
			}
		}
	}
}