package dev.positivee.duanwure.datagen.model;

import dev.positivee.duanwure.DuanWuRE;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DataBlockModelProv extends BlockModelProvider
{
	public DataBlockModelProv(PackOutput output, String modid, ExistingFileHelper existingFileHelper)
	{
		super(output, modid, existingFileHelper);
	}

	@Override
	protected void registerModels()
	{
		for (int i = 0; i <= 7; i++)
		{
			this.crop("rice_stage" + String.valueOf(i),
					new ResourceLocation(DuanWuRE.MODID, "block/rice/rice_stage" + String.valueOf(i))).renderType("cutout");
		}
	}
}
