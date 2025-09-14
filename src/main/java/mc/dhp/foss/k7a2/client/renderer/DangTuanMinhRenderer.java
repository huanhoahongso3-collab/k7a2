package mc.dhp.foss.k7a2.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import mc.dhp.foss.k7a2.entity.DangTuanMinhEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class DangTuanMinhRenderer extends HumanoidMobRenderer<DangTuanMinhEntity, HumanoidModel<DangTuanMinhEntity>> {
	public DangTuanMinhRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<DangTuanMinhEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	protected void scale(DangTuanMinhEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(DangTuanMinhEntity entity) {
		return ResourceLocation.parse("k7a2:textures/entities/dangminh.png");
	}
}