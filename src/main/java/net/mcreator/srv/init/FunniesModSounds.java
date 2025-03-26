
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.srv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.srv.FunniesMod;

public class FunniesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FunniesMod.MODID);
	public static final RegistryObject<SoundEvent> SRV_BANHAMMER_BAN = REGISTRY.register("srv.banhammer.ban", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.banhammer.ban")));
	public static final RegistryObject<SoundEvent> SRV_FULLWIZARD_SKILLISSUE = REGISTRY.register("srv.fullwizard.skillissue", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.fullwizard.skillissue")));
	public static final RegistryObject<SoundEvent> SRV_FULLWIZARD_COPYRIGHTCLAIM = REGISTRY.register("srv.fullwizard.copyrightclaim", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.fullwizard.copyrightclaim")));
	public static final RegistryObject<SoundEvent> SRV_HEDGEHAWK11_MORON = REGISTRY.register("srv.hedgehawk11.moron", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.hedgehawk11.moron")));
	public static final RegistryObject<SoundEvent> SRV_MIKE_SHOOTSGUN = REGISTRY.register("srv.mike.shootsgun", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.mike.shootsgun")));
	public static final RegistryObject<SoundEvent> SRV_HEDGEHAWK11_HURT = REGISTRY.register("srv.hedgehawk11.hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.hedgehawk11.hurt")));
	public static final RegistryObject<SoundEvent> SRV_MIKE_MOVING = REGISTRY.register("srv.mike.moving", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.mike.moving")));
	public static final RegistryObject<SoundEvent> SRV_GUI_CLICK = REGISTRY.register("srv.gui.click", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.gui.click")));
	public static final RegistryObject<SoundEvent> SRV_GUI_MENUOPEN = REGISTRY.register("srv.gui.menuopen", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.gui.menuopen")));
	public static final RegistryObject<SoundEvent> SRV_T34_SHOOT = REGISTRY.register("srv.t34.shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.t34.shoot")));
	public static final RegistryObject<SoundEvent> SRV_MIKE_WALK = REGISTRY.register("srv.mike.walk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.mike.walk")));
	public static final RegistryObject<SoundEvent> SRV_T34_LIVING = REGISTRY.register("srv.t34.living", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.t34.living")));
	public static final RegistryObject<SoundEvent> SRV_MUSIC_SCREWYOU = REGISTRY.register("srv.music.screwyou", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.music.screwyou")));
	public static final RegistryObject<SoundEvent> SRV_MUSIC_DMVTHEME = REGISTRY.register("srv.music.dmvtheme", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.music.dmvtheme")));
	public static final RegistryObject<SoundEvent> SRV_SUSSYFLAG_MUSIC = REGISTRY.register("srv.sussyflag.music", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.sussyflag.music")));
	public static final RegistryObject<SoundEvent> SRV_MUSIC_KAZOO = REGISTRY.register("srv.music.kazoo", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("funnies", "srv.music.kazoo")));
}
