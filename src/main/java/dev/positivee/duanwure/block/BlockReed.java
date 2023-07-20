package dev.positivee.duanwure.block;

import dev.positivee.duanwure.item.ItemRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockReed extends CropBlock
{//TODO:重写芦苇
	private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 20.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 24.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 28.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 32.0D, 16.0D)};

	public BlockReed()
	{
		super(Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP).pushReaction(PushReaction.DESTROY));
	}

	@Override
	protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos)
	{
//		return super.mayPlaceOn(pState, pLevel, pPos) || (pState.is(BlockRegistry.REED.get()) && pState.getValue(AGE) >= 5);
		return super.mayPlaceOn(pState, pLevel, pPos);
	}

	/*@Override
	public boolean isBonemealSuccess(Level pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState)
	{
		return this.isValidBonemealTarget(pLevel, pPos, pState, false);
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader pLevel, BlockPos pPos, BlockState pState, boolean pIsClient)
	{
		int age = pState.getValue(AGE);
		BlockState belowState = pLevel.getBlockState(pPos.below());
		BlockState aboveState = pLevel.getBlockState(pPos.above());

		if (belowState.is(Blocks.FARMLAND))
		{
			return (age < 5) || (age < 7 && aboveState.is(BlockRegistry.REED.get()) && aboveState.getValue(AGE) > 3);
		}

		if (belowState.is(BlockRegistry.REED.get()))
		{
			return age < 5;
		}

		return super.isValidBonemealTarget(pLevel, pPos, pState, pIsClient);
	}

	@Override
	public void growCrops(Level pLevel, BlockPos pPos, BlockState pState)
	{
		BlockState belowState = pLevel.getBlockState(pPos.below());
		int age = this.getAge(pState);
		boolean isUpper = belowState.is(BlockRegistry.REED.get());

	}*/

	@Override
	protected ItemLike getBaseSeedId()
	{
		return ItemRegistry.REED_SEED.get();
	}

	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext)
	{
		return SHAPE_BY_AGE[this.getAge(pState)];
	}
}
