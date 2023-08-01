package dev.positivee.duanwure.datagen.lang;

import dev.positivee.duanwure.block.BlockRegistry;
import dev.positivee.duanwure.item.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class DataLangProvZHCN extends LanguageProvider
{
	public DataLangProvZHCN(PackOutput output, String modid)
	{
		super(output, modid, "zh_cn");
	}

	@Override
	protected void addTranslations()
	{
		this.add("itemGroup.duanwure", "端午复兴");

		this.add(BlockRegistry.REED.get(), "芦苇种子");
		this.add(BlockRegistry.RICE.get(), "稻种子");

		this.add(ItemRegistry.RICE.get(), "米");
//		this.add(ItemRegistry.RICE_SEED.get(), "Rice Seed");
//		this.add(ItemRegistry.REED_SEED.get(), "Reed Seed");
		this.add(ItemRegistry.REED_LEAF.get(), "芦苇叶");
		this.add(ItemRegistry.PADDY.get(), "水稻");
	}
}
