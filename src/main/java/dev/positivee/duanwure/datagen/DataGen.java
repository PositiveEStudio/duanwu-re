package dev.positivee.duanwure.datagen;

import dev.positivee.duanwure.DuanWuRE;
import dev.positivee.duanwure.datagen.blockstate.DataBlockStateProv;
import dev.positivee.duanwure.datagen.lang.DataLangProvENUS;
import dev.positivee.duanwure.datagen.lang.DataLangProvZHCN;
import dev.positivee.duanwure.datagen.model.DataBlockModelProv;
import dev.positivee.duanwure.datagen.model.DataItemModelProv;
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
		generator.addProvider(event.includeClient(), new DataLangProvZHCN(output, DuanWuRE.MODID));

		generator.addProvider(event.includeClient(), new DataItemModelProv(output, DuanWuRE.MODID, helper));
		generator.addProvider(event.includeClient(), new DataBlockModelProv(output, DuanWuRE.MODID, helper));
		generator.addProvider(event.includeClient(), new DataBlockStateProv(output, DuanWuRE.MODID, helper));
	}
}
