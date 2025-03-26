// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelt34_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "t34_converted"), "main");
	private final ModelPart group;

	public Modelt34_Converted(ModelPart root) {
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition group = partdefinition.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-30.0F, 19.0F, -7.0F, 32.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-27.0615F, 14.391F, -7.0F, 26.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-25.2426F, 20.0711F, 9.0F, 26.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-30.0F, 15.0F, 9.0F, 35.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-30.0F, 15.0F, -14.0F, 35.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-25.2426F, 20.0711F, -14.0F, 26.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-3.2137F, 7.1564F, 0.0F, 19.2137F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-3.2137F, 6.1564F, -1.0F, 2.2137F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-28.0F, 13.0F, -7.0F, 27.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-17.0F, 11.0F, -5.0F, 15.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-18.0F, 11.0F, -6.0F, 17.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-15.0F, 5.0F, -3.0F, 11.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(0.0F, 17.0F, 12.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-27.0F, 17.0F, 12.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(0.0F, 17.0F, -12.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-27.0F, 17.0F, -12.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 2.0F, -1.0F));

		PartDefinition cube_r1 = group.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(-2.0F, -2.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-2.0F, -2.0F, -24.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 19.0F, 12.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r2 = group.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(-2.0F, -2.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-2.0F, -2.0F, -24.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 19.0F, 12.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r3 = group.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(-2.0F, -2.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-2.0F, -2.0F, -24.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, 19.0F, 12.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r4 = group.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(-2.0F, -2.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-2.0F, -2.0F, -24.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.0F, 19.0F, 12.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r5 = group.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(-2.0F, -2.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-2.0F, -2.0F, -24.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.0F, 19.0F, 12.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r6 = group.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 6).addBox(-10.0F, -2.0F, -2.0F, 27.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.0F, 15.6131F, 10.0824F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r7 = group.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 6).addBox(-10.0F, -2.0F, -2.0F, 26.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.0F, 16.3785F, -9.9301F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r8 = group.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 11).addBox(-4.0F, -5.0F, 0.0F, 11.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.2137F, 11.1564F, 7.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r9 = group.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 11).addBox(-4.0F, -5.0F, 0.0F, 11.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.2137F, 10.1564F, -6.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r10 = group.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, -5.0F, -4.0F, 2.0F, 6.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2137F, 10.1564F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r11 = group.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, -5.0F, -4.0F, 2.0F, 6.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.2137F, 11.1564F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r12 = group.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -8.0F, -7.0F, 3.0F, 8.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-29.2137F, 21.1564F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r13 = group.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 7).addBox(22.0F, -2.0F, -7.0F, 8.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-46.9706F, 0.8579F, -7.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r14 = group.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -7.0F, -2.0F, 2.0F, 8.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4645F, 21.364F, -12.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r15 = group.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -6.0F, -2.0F, 2.0F, 8.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1716F, 20.6568F, 11.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r16 = group.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F, -9.0F, -7.0F, 3.0F, 9.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 19.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r17 = group.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 7).addBox(23.0F, -2.0F, -7.0F, 8.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-47.6777F, 0.1508F, 16.0F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}