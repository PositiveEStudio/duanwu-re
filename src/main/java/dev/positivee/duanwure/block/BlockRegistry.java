package dev.positivee.duanwure.block;

import dev.positivee.duanwure.DuanWuRE;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry
{
	public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, DuanWuRE.MODID);

	public static final RegistryObject<Block> RICE = BLOCK.register("rice", BlockRice::new);
	public static final RegistryObject<Block> REED = BLOCK.register("reed", BlockReed::new);
}
