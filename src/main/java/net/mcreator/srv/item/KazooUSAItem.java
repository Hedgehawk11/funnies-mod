
package net.mcreator.srv.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class KazooUSAItem extends RecordItem {
	public KazooUSAItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("funnies:srv.music.kazoo")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 1560);
	}
}
