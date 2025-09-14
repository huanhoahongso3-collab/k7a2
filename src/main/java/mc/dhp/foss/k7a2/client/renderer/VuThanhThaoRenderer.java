package mc.dhp.foss.k7a2.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import mc.dhp.foss.k7a2.entity.VuThanhThaoEntity;

public class VuThanhThaoRenderer extends HumanoidMobRenderer<VuThanhThaoEntity, HumanoidModel<VuThanhThaoEntity>> {
	public VuThanhThaoRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<VuThanhThaoEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(VuThanhThaoEntity entity) {
		return ResourceLocation.parse("k7a2:textures/entities/vuthao.png");
	}
}