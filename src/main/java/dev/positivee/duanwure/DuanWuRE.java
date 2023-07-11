package dev.positivee.duanwure;

import com.mojang.logging.LogUtils;
import dev.positivee.duanwure.block.BlockRegistry;
import dev.positivee.duanwure.creative.CreativeTabRegistry;
import dev.positivee.duanwure.item.ItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(DuanWuRE.MODID)
public class DuanWuRE
{
	public static final String MODID = "duanwure";
	private static final Logger LOGGER = LogUtils.getLogger();

	public DuanWuRE()
	{
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		MinecraftForge.EVENT_BUS.register(this);

		ItemRegistry.ITEM.register(modEventBus);
		BlockRegistry.BLOCK.register(modEventBus);
		CreativeTabRegistry.CREATIVE_MODE_TAB.register(modEventBus);
	}
}
