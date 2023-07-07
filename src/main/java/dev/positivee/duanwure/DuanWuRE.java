package dev.positivee.duanwure;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DuanWuRE.MODID)
public class DuanWuRE
{
    public static final String MODID = "duanwure";
    private static final Logger LOGGER = LogUtils.getLogger();
    public DuanWuRE()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
