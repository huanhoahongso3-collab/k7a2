package mc.dhp.foss.k7a2.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import mc.dhp.foss.k7a2.entity.PhanEntity;

public class PhanRenderer extends HumanoidMobRenderer<PhanEntity, HumanoidModel<PhanEntity>> {
	public PhanRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<PhanEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(PhanEntity entity) {
		return ResourceLocation.parse("k7a2:textures/entities/phan.png");
	}
}