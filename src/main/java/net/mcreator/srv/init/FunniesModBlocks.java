
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.srv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.srv.block.DMVPortalBlock;
import net.mcreator.srv.FunniesMod;

public class FunniesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FunniesMod.MODID);
	public static final RegistryObject<Block> DMV_PORTAL = REGISTRY.register("dmv_portal", () -> new DMVPortalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
