
package net.mcreator.srv.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DMVWAITMUSICFORTHEPOORItem extends RecordItem {
	public DMVWAITMUSICFORTHEPOORItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("funnies:srv.music.screwyou")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 3480);
	}
}
