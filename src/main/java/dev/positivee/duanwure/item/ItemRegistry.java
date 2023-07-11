package dev.positivee.duanwure.item;

import dev.positivee.duanwure.DuanWuRE;
import dev.positivee.duanwure.block.BlockRegistry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry
{
	public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, DuanWuRE.MODID);

	public static final RegistryObject<Item> RICE_SEED = ITEM.register("rice_seed", () -> new BlockItem(BlockRegistry.RICE.get(), new Item.Properties()));
}
