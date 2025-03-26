
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.srv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.srv.item.WaitingMusicItem;
import net.mcreator.srv.item.TANKnewItem;
import net.mcreator.srv.item.T34ShootsItem;
import net.mcreator.srv.item.KazooUSAItem;
import net.mcreator.srv.item.DMVWAITMUSICFORTHEPOORItem;
import net.mcreator.srv.item.DMVThemeMusicItem;
import net.mcreator.srv.item.DMVTHEMEFORTHEPOORItem;
import net.mcreator.srv.item.DMVItem;
import net.mcreator.srv.item.BanHammerItem;
import net.mcreator.srv.item.AmericanTankItem;
import net.mcreator.srv.FunniesMod;

public class FunniesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FunniesMod.MODID);
	public static final RegistryObject<Item> BAN_HAMMER = REGISTRY.register("ban_hammer", () -> new BanHammerItem());
	public static final RegistryObject<Item> HEDGEHAWK_11_SPAWN_EGG = REGISTRY.register("hedgehawk_11_spawn_egg", () -> new ForgeSpawnEggItem(FunniesModEntities.HEDGEHAWK_11, -16711936, -16711681, new Item.Properties()));
	public static final RegistryObject<Item> MIKE_SPAWN_EGG = REGISTRY.register("mike_spawn_egg", () -> new ForgeSpawnEggItem(FunniesModEntities.MIKE, -16776961, -16777013, new Item.Properties()));
	public static final RegistryObject<Item> LEROY_BALDMAN_SPAWN_EGG = REGISTRY.register("leroy_baldman_spawn_egg", () -> new ForgeSpawnEggItem(FunniesModEntities.LEROY_BALDMAN, -16776961, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> NJ_256_SPAWN_EGG = REGISTRY.register("nj_256_spawn_egg", () -> new ForgeSpawnEggItem(FunniesModEntities.NJ_256, -65281, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> DMV = REGISTRY.register("dmv", () -> new DMVItem());
	public static final RegistryObject<Item> ALT_MIKE_SPAWN_EGG = REGISTRY.register("alt_mike_spawn_egg", () -> new ForgeSpawnEggItem(FunniesModEntities.ALT_MIKE, -16776961, -16777080, new Item.Properties()));
	public static final RegistryObject<Item> AMERICAN_TANK = REGISTRY.register("american_tank", () -> new AmericanTankItem());
	public static final RegistryObject<Item> TAN_KNEW = REGISTRY.register("tan_knew", () -> new TANKnewItem());
	public static final RegistryObject<Item> T_34_SHOOTS = REGISTRY.register("t_34_shoots", () -> new T34ShootsItem());
	public static final RegistryObject<Item> WAITING_MUSIC = REGISTRY.register("waiting_music", () -> new WaitingMusicItem());
	public static final RegistryObject<Item> DMV_THEME_MUSIC = REGISTRY.register("dmv_theme_music", () -> new DMVThemeMusicItem());
	public static final RegistryObject<Item> DMVTHEMEFORTHEPOOR = REGISTRY.register("dmvthemeforthepoor", () -> new DMVTHEMEFORTHEPOORItem());
	public static final RegistryObject<Item> DMVWAITMUSICFORTHEPOOR = REGISTRY.register("dmvwaitmusicforthepoor", () -> new DMVWAITMUSICFORTHEPOORItem());
	public static final RegistryObject<Item> KAZOO_USA = REGISTRY.register("kazoo_usa", () -> new KazooUSAItem());
	// Start of user code block custom items
	// End of user code block custom items
}
