package net.mcreator.srv.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;

import net.mcreator.srv.init.FunniesModItems;

import java.util.Map;

public class EvilProcedure {
	public static void execute(LevelAccessor world) {
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(new ItemStack(FunniesModItems.AMERICAN_TANK.get()));
			if (_enchantments.containsKey(Enchantments.MENDING)) {
				_enchantments.remove(Enchantments.MENDING);
				EnchantmentHelper.setEnchantments(_enchantments, new ItemStack(FunniesModItems.AMERICAN_TANK.get()));
			}
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(new ItemStack(FunniesModItems.AMERICAN_TANK.get()));
			if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
				_enchantments.remove(Enchantments.SHARPNESS);
				EnchantmentHelper.setEnchantments(_enchantments, new ItemStack(FunniesModItems.AMERICAN_TANK.get()));
			}
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(new ItemStack(FunniesModItems.TAN_KNEW.get()));
			if (_enchantments.containsKey(Enchantments.MENDING)) {
				_enchantments.remove(Enchantments.MENDING);
				EnchantmentHelper.setEnchantments(_enchantments, new ItemStack(FunniesModItems.TAN_KNEW.get()));
			}
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(new ItemStack(FunniesModItems.TAN_KNEW.get()));
			if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
				_enchantments.remove(Enchantments.SHARPNESS);
				EnchantmentHelper.setEnchantments(_enchantments, new ItemStack(FunniesModItems.TAN_KNEW.get()));
			}
		}
	}
}
