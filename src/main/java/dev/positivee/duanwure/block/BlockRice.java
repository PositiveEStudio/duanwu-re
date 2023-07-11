package dev.positivee.duanwure.block;


import dev.positivee.duanwure.item.ItemRegistry;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class BlockRice extends CropBlock
{
	public BlockRice()
	{
		super(Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP).pushReaction(PushReaction.DESTROY));
	}

	@Override
	protected ItemLike getBaseSeedId()
	{
		return ItemRegistry.RICE_SEED.get();
	}
}
