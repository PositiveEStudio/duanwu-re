package dev.positivee.duanwure.creative;

import dev.positivee.duanwure.DuanWuRE;
import dev.positivee.duanwure.item.ItemRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabRegistry
{
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DuanWuRE.MODID);

	public static final RegistryObject<CreativeModeTab> DUANWURE = CREATIVE_MODE_TAB.register("duanwure", () -> CreativeModeTab.builder()
			.title(Component.translatable("itemGroup.duanwure"))
			.icon(() -> ItemRegistry.NORMAL_ZONGZI.get().getDefaultInstance())
			.withTabsBefore(new ResourceLocation("minecraft:spawn_eggs"))
			.displayItems((parameter, output) ->
			{
				output.accept(ItemRegistry.NORMAL_ZONGZI.get());
				output.accept(ItemRegistry.SUGER_ZONGZI.get());
				output.accept(ItemRegistry.MEAT_ZONGZI.get());
				output.accept(ItemRegistry.RICE_SEED.get());
				output.accept(ItemRegistry.REED_SEED.get());
				output.accept(ItemRegistry.REED_LEAF.get());
				output.accept(ItemRegistry.RICE.get());
				output.accept(ItemRegistry.PADDY.get());
			})
			.build()
	);
}
