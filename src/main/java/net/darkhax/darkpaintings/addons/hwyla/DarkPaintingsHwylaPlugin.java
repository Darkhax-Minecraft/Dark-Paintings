package net.darkhax.darkpaintings.addons.hwyla;

import mcp.mobius.waila.api.IEntityComponentProvider;
import mcp.mobius.waila.api.IRegistrar;
import mcp.mobius.waila.api.IWailaPlugin;
import mcp.mobius.waila.api.TooltipPosition;
import mcp.mobius.waila.api.WailaPlugin;
import net.darkhax.darkpaintings.DarkPaintings;
import net.minecraft.entity.item.PaintingEntity;
import net.minecraft.util.ResourceLocation;

@WailaPlugin
public class DarkPaintingsHwylaPlugin implements IWailaPlugin {

	public static final ResourceLocation SHOW_TITLE = new ResourceLocation(DarkPaintings.MOD_ID, "show_title");
	public static final ResourceLocation SHOW_ARTIST = new ResourceLocation(DarkPaintings.MOD_ID, "show_artist");
	public static final ResourceLocation SHOW_ID = new ResourceLocation(DarkPaintings.MOD_ID, "show_id");

	@Override
	public void register(IRegistrar registry) {

		registry.addConfig(SHOW_TITLE, true);
		registry.addConfig(SHOW_ARTIST, true);
		registry.addConfig(SHOW_ID, false);

		final IEntityComponentProvider component = new DarkPaintingsComponentProvider();
		registry.registerComponentProvider(component, TooltipPosition.HEAD, PaintingEntity.class);
		registry.registerComponentProvider(component, TooltipPosition.BODY, PaintingEntity.class);
	}
}