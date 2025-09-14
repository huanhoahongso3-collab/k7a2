
package net.mcreator.k7a2.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.k7a2.init.K7a2ModItems;
import net.mcreator.k7a2.init.K7a2ModEntities;

public class TruongNgocDiepEntity extends Villager {
	public TruongNgocDiepEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(K7a2ModEntities.TRUONG_NGOC_DIEP.get(), world);
	}

	public TruongNgocDiepEntity(EntityType<TruongNgocDiepEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected Component getTypeName() {
		return this.getType().getDescription();
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
		this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(3, new FloatGoal(this));
		this.goalSelector.addGoal(4, new LeapAtTargetGoal(this, (float) 0.5));
		this.goalSelector.addGoal(5, new BreakDoorGoal(this, e -> true));
		this.goalSelector.addGoal(6, new OpenDoorGoal(this, false));
		this.goalSelector.addGoal(7, new OpenDoorGoal(this, true));
		this.goalSelector.addGoal(8, new MoveBackToVillageGoal(this, 0.6, false));
		this.goalSelector.addGoal(9, new AvoidEntityGoal<>(this, PhamMyAnEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(10, new AvoidEntityGoal<>(this, NguyenPhamMinhChauEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(11, new AvoidEntityGoal<>(this, TranKhanhGiangEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(12, new AvoidEntityGoal<>(this, NguyenTungLamEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(13, new AvoidEntityGoal<>(this, TranHaLinhEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(14, new AvoidEntityGoal<>(this, NguyenHaMinhEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(15, new AvoidEntityGoal<>(this, VuKhanhNganEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(16, new AvoidEntityGoal<>(this, VuThanhThaoEntity.class, (float) 6, 1, 1.2));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(K7a2ModItems.K_7_A_2_NUGGET.get()));
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("k7a2:diep"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.bass")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	public static void init() {
		SpawnPlacements.register(K7a2ModEntities.TRUONG_NGOC_DIEP.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}
