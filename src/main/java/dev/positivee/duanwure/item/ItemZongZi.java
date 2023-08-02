package dev.positivee.duanwure.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemZongZi extends Item
{
	public ItemZongZi(Properties pProperties)
	{
		super(pProperties);
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced)
	{//TODO:添加展示食用效果的tooltip
		super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
	}
}
