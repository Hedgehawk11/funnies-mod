
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.srv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.srv.world.inventory.TheGUIMenu;
import net.mcreator.srv.FunniesMod;

public class FunniesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FunniesMod.MODID);
	public static final RegistryObject<MenuType<TheGUIMenu>> THE_GUI = REGISTRY.register("the_gui", () -> IForgeMenuType.create(TheGUIMenu::new));
}
