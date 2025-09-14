package mc.dhp.foss.k7a2.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import mc.dhp.foss.k7a2.init.K7a2ModItems;
import mc.dhp.foss.k7a2.init.K7a2ModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class PhanEntityProjectile extends AbstractArrow implements ItemSupplier {
	public PhanEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(K7a2ModEntities.PHAN_PROJECTILE.get(), world);
	}

	public PhanEntityProjectile(EntityType<? extends PhanEntityProjectile> type, Level world) {
		super(type, world);
	}

	public PhanEntityProjectile(EntityType<? extends PhanEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public PhanEntityProjectile(EntityType<? extends PhanEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(K7a2ModItems.TNT_BOW.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(K7a2ModItems.TNT_BOW.get());
	}
}