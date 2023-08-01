package dev.positivee.duanwure.datagen.lang;

import dev.positivee.duanwure.block.BlockRegistry;
import dev.positivee.duanwure.item.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class DataLangProvENUS extends LanguageProvider
{

	public DataLangProvENUS(PackOutput output, String modid)
	{
		super(output, modid, "en_us");
	}

	@Override
	protected void addTranslations()
	{
		this.add("itemGroup.duanwure", "Duanwu RE");

		this.add(BlockRegistry.REED.get(), "Reed Seed");
		this.add(BlockRegistry.RICE.get(), "Rice Seed");

		this.add(ItemRegistry.RICE.get(), "Rice");
//		this.add(ItemRegistry.RICE_SEED.get(), "Rice Seed");
//		this.add(ItemRegistry.REED_SEED.get(), "Reed Seed");
		this.add(ItemRegistry.REED_LEAF.get(), "Reed Leaf");
		this.add(ItemRegistry.PADDY.get(), "Paddy");
	}
}
