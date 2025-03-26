
package net.mcreator.srv.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.srv.entity.LeroyBaldmanEntity;

public class LeroyBaldmanRenderer extends HumanoidMobRenderer<LeroyBaldmanEntity, HumanoidModel<LeroyBaldmanEntity>> {
	public LeroyBaldmanRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<LeroyBaldmanEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(LeroyBaldmanEntity entity) {
		return new ResourceLocation("funnies:textures/entities/ab980cea01610338.png");
	}
}
