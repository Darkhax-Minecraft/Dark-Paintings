package net.darkhax.darkpaintings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.darkhax.darkpaintings.authors.AuthorManager;
import net.minecraft.entity.item.PaintingType;
import net.minecraft.util.text.TextComponent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(DarkPaintings.MOD_ID)
public class DarkPaintings {

	public static final String MOD_ID = "darkpaintings";
	public static final Logger LOG = LogManager.getLogger("Dark Paintings");

	public DarkPaintings() {

		final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
		modBus.addGenericListener(PaintingType.class, this::registerPaintings);
	}

	private void registerPaintings(Register<PaintingType> event) {

		final IForgeRegistry<PaintingType> registry = event.getRegistry();

		final TextComponent authorDarkhax = AuthorManager.makeAuthor("darkhax");		
		this.createPainting(registry, "in_the_air", 32, 16, authorDarkhax);
		this.createPainting(registry, "skyblock", 16, 16, authorDarkhax);
		this.createPainting(registry, "mr_moon", 16, 16, authorDarkhax);
		this.createPainting(registry, "tetromino", 16, 32, authorDarkhax);
		this.createPainting(registry, "daybreak", 32, 16, authorDarkhax);	
		
		final TextComponent authormmg28rtt = AuthorManager.makeAuthor("mmg28rtt");
		this.createPainting(registry, "planets", 32, 16, authormmg28rtt);
		
		final TextComponent authorFuryDev = AuthorManager.makeAuthor("furydev");
		this.createPainting(registry, "village", 64, 32, authorFuryDev);
		
		final TextComponent authorAxeonlotl = AuthorManager.makeAuthor("axeonlotl");
		this.createPainting(registry, "oceanic_view", 32, 16, authorAxeonlotl);
		this.createPainting(registry, "watching_the_sunset", 32, 16, authorAxeonlotl);
		this.createPainting(registry, "enderman", 32, 16, authorAxeonlotl);
		this.createPainting(registry, "afternoon_volcano", 16, 32, authorAxeonlotl);
		this.createPainting(registry, "crimson_taiga", 32, 16, authorAxeonlotl);	
		
		final TextComponent authorWouter = AuthorManager.makeAuthor("wouter");
		this.createPainting(registry, "lumberjack", 64, 32, authorWouter);
		this.createPainting(registry, "summer_heat", 32, 16, authorWouter);
		this.createPainting(registry, "the_tower", 16, 32, authorWouter);
		this.createPainting(registry, "bubbles", 16, 16, authorWouter);
		this.createPainting(registry, "a_distant_light", 32, 16, authorWouter);
		
		final TextComponent authorVydax = AuthorManager.makeAuthor("vydax");
		this.createPainting(registry, "the_wheel", 32, 32, authorVydax);
		
		final TextComponent authorAbsolem = AuthorManager.makeAuthor("absolem");
		this.createPainting(registry, "whale_dream", 32, 32, authorAbsolem);
		this.createPainting(registry, "cottage_by_the_river", 16, 16, authorAbsolem);
		this.createPainting(registry, "seavibe", 16, 16, authorAbsolem);
		this.createPainting(registry, "antler_maze", 16, 32, authorAbsolem);
		
		final TextComponent authorPunpudle = AuthorManager.makeAuthor("punpudle");
		this.createPainting(registry, "the_secret_neighborhood", 32, 32, authorPunpudle);
		this.createPainting(registry, "last_dreams_at_candyland", 32, 16, authorPunpudle);
		this.createPainting(registry, "the_most_sweet_candy", 16, 16, authorPunpudle);
	    this.createPainting(registry, "sir_ramfrez_yarn_paradise", 16, 16, authorPunpudle);		
	}

	private PaintingType createPainting(IForgeRegistry<PaintingType> registry, String id, int width, int height, TextComponent author) {

		final PaintingType type = new PaintingType(width, height);
		type.setRegistryName(MOD_ID, id);
		registry.register(type);
		AuthorManager.registerAuthor(type, author);
		return type;
	}
}