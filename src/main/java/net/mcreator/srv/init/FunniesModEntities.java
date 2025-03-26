
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.srv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.srv.entity.NJ256Entity;
import net.mcreator.srv.entity.MikeEntity;
import net.mcreator.srv.entity.LeroyBaldmanEntity;
import net.mcreator.srv.entity.Hedgehawk11Entity;
import net.mcreator.srv.entity.AltMikeEntity;
import net.mcreator.srv.FunniesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FunniesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FunniesMod.MODID);
	public static final RegistryObject<EntityType<Hedgehawk11Entity>> HEDGEHAWK_11 = register("hedgehawk_11",
			EntityType.Builder.<Hedgehawk11Entity>of(Hedgehawk11Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Hedgehawk11Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MikeEntity>> MIKE = register("mike",
			EntityType.Builder.<MikeEntity>of(MikeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MikeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LeroyBaldmanEntity>> LEROY_BALDMAN = register("leroy_baldman",
			EntityType.Builder.<LeroyBaldmanEntity>of(LeroyBaldmanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LeroyBaldmanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NJ256Entity>> NJ_256 = register("nj_256",
			EntityType.Builder.<NJ256Entity>of(NJ256Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NJ256Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AltMikeEntity>> ALT_MIKE = register("alt_mike",
			EntityType.Builder.<AltMikeEntity>of(AltMikeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AltMikeEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Hedgehawk11Entity.init();
			MikeEntity.init();
			LeroyBaldmanEntity.init();
			NJ256Entity.init();
			AltMikeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(HEDGEHAWK_11.get(), Hedgehawk11Entity.createAttributes().build());
		event.put(MIKE.get(), MikeEntity.createAttributes().build());
		event.put(LEROY_BALDMAN.get(), LeroyBaldmanEntity.createAttributes().build());
		event.put(NJ_256.get(), NJ256Entity.createAttributes().build());
		event.put(ALT_MIKE.get(), AltMikeEntity.createAttributes().build());
	}
}
