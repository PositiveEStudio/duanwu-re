package dev.positivee.duanwure.datagen.model;

import dev.positivee.duanwure.DuanWuRE;
import dev.positivee.duanwure.item.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DataItemModelProv extends ItemModelProvider
{
	public DataItemModelProv(PackOutput output, String modid, ExistingFileHelper existingFileHelper)
	{
		super(output, DuanWuRE.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels()
	{
		this.basicItem(ItemRegistry.RICE.get());
		this.basicItem(ItemRegistry.REED_SEED.get());
		this.basicItem(ItemRegistry.RICE_SEED.get());
		this.basicItem(ItemRegistry.REED_LEAF.get());
		this.basicItem(ItemRegistry.PADDY.get());
		this.basicItem(ItemRegistry.NORMAL_ZONGZI.get());
	}
}
