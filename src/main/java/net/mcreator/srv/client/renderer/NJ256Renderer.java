
package net.mcreator.srv.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.srv.entity.NJ256Entity;

public class NJ256Renderer extends HumanoidMobRenderer<NJ256Entity, HumanoidModel<NJ256Entity>> {
	public NJ256Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<NJ256Entity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(NJ256Entity entity) {
		return new ResourceLocation("funnies:textures/entities/082397742938370b.png");
	}
}
