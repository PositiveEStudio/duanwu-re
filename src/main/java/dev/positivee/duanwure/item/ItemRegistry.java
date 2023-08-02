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
	public static final RegistryObject<Item> REED_SEED = ITEM.register("reed_seed", () -> new BlockItem(BlockRegistry.REED.get(), new Item.Properties()));

	public static final RegistryObject<Item> RICE = ITEM.register("rice", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> REED_LEAF = ITEM.register("reed_leaf", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> PADDY = ITEM.register("paddy", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> NORMAL_ZONGZI = ITEM.register("normal_zongzi", () -> new ItemZongZi(new Item.Properties().food(FoodRegistry.NORMAL_ZONGZI)));
	public static final RegistryObject<Item> SUGER_ZONGZI = ITEM.register("suger_zongzi", () -> new ItemZongZi(new Item.Properties().food(FoodRegistry.SUGER_ZONGZI)));
	public static final RegistryObject<Item> MEAT_ZONGZI = ITEM.register("meat_zongzi", () -> new ItemZongZi(new Item.Properties().food(FoodRegistry.MEAT_ZONGZI)));

}
