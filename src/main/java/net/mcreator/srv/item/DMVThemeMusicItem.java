
package net.mcreator.srv.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.srv.procedures.WaitingMusicItemInInventoryTickProcedure;

public class DMVThemeMusicItem extends RecordItem {
	public DMVThemeMusicItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("funnies:srv.music.dmvtheme")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 2040);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		WaitingMusicItemInInventoryTickProcedure.execute(world, entity);
	}
}
