
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.srv.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.srv.client.renderer.NJ256Renderer;
import net.mcreator.srv.client.renderer.MikeRenderer;
import net.mcreator.srv.client.renderer.LeroyBaldmanRenderer;
import net.mcreator.srv.client.renderer.Hedgehawk11Renderer;
import net.mcreator.srv.client.renderer.AltMikeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FunniesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FunniesModEntities.HEDGEHAWK_11.get(), Hedgehawk11Renderer::new);
		event.registerEntityRenderer(FunniesModEntities.MIKE.get(), MikeRenderer::new);
		event.registerEntityRenderer(FunniesModEntities.LEROY_BALDMAN.get(), LeroyBaldmanRenderer::new);
		event.registerEntityRenderer(FunniesModEntities.NJ_256.get(), NJ256Renderer::new);
		event.registerEntityRenderer(FunniesModEntities.ALT_MIKE.get(), AltMikeRenderer::new);
	}
}
