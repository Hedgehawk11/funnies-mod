
package net.mcreator.srv.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.srv.entity.MikeEntity;

public class MikeRenderer extends HumanoidMobRenderer<MikeEntity, HumanoidModel<MikeEntity>> {
	public MikeRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<MikeEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(MikeEntity entity) {
		return new ResourceLocation("funnies:textures/entities/740d3196969670b1.png");
	}
}
