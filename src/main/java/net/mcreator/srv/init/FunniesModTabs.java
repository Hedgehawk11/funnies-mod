
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.srv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.srv.FunniesMod;

public class FunniesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FunniesMod.MODID);
	public static final RegistryObject<CreativeModeTab> SRV = REGISTRY.register("srv",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.funnies.srv")).icon(() -> new ItemStack(Blocks.DIRT_PATH)).displayItems((parameters, tabData) -> {
				tabData.accept(FunniesModItems.HEDGEHAWK_11_SPAWN_EGG.get());
				tabData.accept(FunniesModItems.MIKE_SPAWN_EGG.get());
				tabData.accept(FunniesModItems.LEROY_BALDMAN_SPAWN_EGG.get());
				tabData.accept(FunniesModItems.NJ_256_SPAWN_EGG.get());
				tabData.accept(FunniesModItems.ALT_MIKE_SPAWN_EGG.get());
				tabData.accept(FunniesModItems.DMV.get());
				tabData.accept(FunniesModItems.DMVTHEMEFORTHEPOOR.get());
				tabData.accept(FunniesModItems.DMVWAITMUSICFORTHEPOOR.get());
				tabData.accept(FunniesModItems.AMERICAN_TANK.get());
				tabData.accept(FunniesModItems.TAN_KNEW.get());
				tabData.accept(FunniesModItems.T_34_SHOOTS.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> SRV_ADMIN = REGISTRY.register("srv_admin",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.funnies.srv_admin")).icon(() -> new ItemStack(Blocks.REDSTONE_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(FunniesModItems.BAN_HAMMER.get());
				tabData.accept(FunniesModItems.WAITING_MUSIC.get());
				tabData.accept(FunniesModItems.DMV_THEME_MUSIC.get());
			}).withTabsBefore(SRV.getId()).build());
}
