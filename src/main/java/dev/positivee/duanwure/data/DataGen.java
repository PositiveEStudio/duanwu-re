package dev.positivee.duanwure.data;

import dev.positivee.duanwure.DuanWuRE;
import dev.positivee.duanwure.data.lang.DataLangProvENUS;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DataGen
{
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event)
	{
		net.minecraft.data.DataGenerator generator = event.getGenerator();
		PackOutput output = generator.getPackOutput();
		ExistingFileHelper helper = event.getExistingFileHelper();

		generator.addProvider(event.includeClient(), new DataLangProvENUS(output, DuanWuRE.MODID));
	}
}
