
package mc.dhp.foss.k7a2.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import mc.dhp.foss.k7a2.entity.DaoHongPhucEntity;

public class DaoHongPhucRenderer extends MobRenderer<DaoHongPhucEntity, ChickenModel<DaoHongPhucEntity>> {
	public DaoHongPhucRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DaoHongPhucEntity entity) {
		return new ResourceLocation("k7a2:textures/entities/chicken2.png");
	}
}
