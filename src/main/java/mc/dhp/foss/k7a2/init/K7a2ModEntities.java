/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import mc.dhp.foss.k7a2.entity.VuThanhThaoEntity;
import mc.dhp.foss.k7a2.entity.VuKhanhNganEntity;
import mc.dhp.foss.k7a2.entity.VuHaLinhEntity;
import mc.dhp.foss.k7a2.entity.TruongNgocDiepEntity;
import mc.dhp.foss.k7a2.entity.TranQuyHoangThaiEntity;
import mc.dhp.foss.k7a2.entity.TranPhuongLinhEntity;
import mc.dhp.foss.k7a2.entity.TranNhuQuynhEntity;
import mc.dhp.foss.k7a2.entity.TranNhatMinhEntity;
import mc.dhp.foss.k7a2.entity.TranMaiPhuongEntity;
import mc.dhp.foss.k7a2.entity.TranKhanhGiangEntity;
import mc.dhp.foss.k7a2.entity.TranHoaiAnEntity;
import mc.dhp.foss.k7a2.entity.TranHaLinhEntity;
import mc.dhp.foss.k7a2.entity.ToanEntity;
import mc.dhp.foss.k7a2.entity.TNTBowProjectileEntity;
import mc.dhp.foss.k7a2.entity.PhanEntityProjectile;
import mc.dhp.foss.k7a2.entity.PhanEntity;
import mc.dhp.foss.k7a2.entity.PhamMyAnEntity;
import mc.dhp.foss.k7a2.entity.PhamDucAnhEntity;
import mc.dhp.foss.k7a2.entity.OPBowProjectileEntity;
import mc.dhp.foss.k7a2.entity.NguyenTungLamEntity;
import mc.dhp.foss.k7a2.entity.NguyenTuanThanhEntity;
import mc.dhp.foss.k7a2.entity.NguyenTuanMinhEntity;
import mc.dhp.foss.k7a2.entity.NguyenTuUyenEntity;
import mc.dhp.foss.k7a2.entity.NguyenThiNgocAnhEntity;
import mc.dhp.foss.k7a2.entity.NguyenThanhTrucEntity;
import mc.dhp.foss.k7a2.entity.NguyenPhuongLinhEntity;
import mc.dhp.foss.k7a2.entity.NguyenPhamMinhChauEntity;
import mc.dhp.foss.k7a2.entity.NguyenNamKhanhEntity;
import mc.dhp.foss.k7a2.entity.NguyenLeKhanhEntity;
import mc.dhp.foss.k7a2.entity.NguyenLapHongPhucEntity;
import mc.dhp.foss.k7a2.entity.NguyenKhoiNguyenEntity;
import mc.dhp.foss.k7a2.entity.NguyenHaMinhEntity;
import mc.dhp.foss.k7a2.entity.LuongHuuDatEntity;
import mc.dhp.foss.k7a2.entity.KieuPhuongThaoEntity;
import mc.dhp.foss.k7a2.entity.HoangDucHaiEntity;
import mc.dhp.foss.k7a2.entity.DuongTienMinhEntity;
import mc.dhp.foss.k7a2.entity.DoDucAnhTaiEntity;
import mc.dhp.foss.k7a2.entity.DinhHoangDuongEntity;
import mc.dhp.foss.k7a2.entity.DinhDiepAnhEntity;
import mc.dhp.foss.k7a2.entity.DeadlyBowProjectileEntity;
import mc.dhp.foss.k7a2.entity.DaoHongPhucEntity;
import mc.dhp.foss.k7a2.entity.DangTuanMinhEntity;
import mc.dhp.foss.k7a2.K7a2Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class K7a2ModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, K7a2Mod.MODID);
	public static final RegistryObject<EntityType<TranHoaiAnEntity>> TRAN_HOAI_AN = register("tran_hoai_an", EntityType.Builder.<TranHoaiAnEntity>of(TranHoaiAnEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TranHoaiAnEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PhamMyAnEntity>> PHAM_MY_AN = register("pham_my_an",
			EntityType.Builder.<PhamMyAnEntity>of(PhamMyAnEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhamMyAnEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NguyenThiNgocAnhEntity>> NGUYEN_THI_NGOC_ANH = register("nguyen_thi_ngoc_anh",
			EntityType.Builder.<NguyenThiNgocAnhEntity>of(NguyenThiNgocAnhEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NguyenThiNgocAnhEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DinhDiepAnhEntity>> DINH_DIEP_ANH = register("dinh_diep_anh",
			EntityType.Builder.<DinhDiepAnhEntity>of(DinhDiepAnhEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DinhDiepAnhEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PhamDucAnhEntity>> PHAM_DUC_ANH = register("pham_duc_anh", EntityType.Builder.<PhamDucAnhEntity>of(PhamDucAnhEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhamDucAnhEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NguyenPhamMinhChauEntity>> NGUYEN_PHAM_MINH_CHAU = register("nguyen_pham_minh_chau",
			EntityType.Builder.<NguyenPhamMinhChauEntity>of(NguyenPhamMinhChauEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NguyenPhamMinhChauEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TruongNgocDiepEntity>> TRUONG_NGOC_DIEP = register("truong_ngoc_diep",
			EntityType.Builder.<TruongNgocDiepEntity>of(TruongNgocDiepEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TruongNgocDiepEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DinhHoangDuongEntity>> DINH_HOANG_DUONG = register("dinh_hoang_duong", EntityType.Builder.<DinhHoangDuongEntity>of(DinhHoangDuongEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DinhHoangDuongEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LuongHuuDatEntity>> LUONG_HUU_DAT = register("luong_huu_dat", EntityType.Builder.<LuongHuuDatEntity>of(LuongHuuDatEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LuongHuuDatEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TranKhanhGiangEntity>> TRAN_KHANH_GIANG = register("tran_khanh_giang",
			EntityType.Builder.<TranKhanhGiangEntity>of(TranKhanhGiangEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TranKhanhGiangEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HoangDucHaiEntity>> HOANG_DUC_HAI = register("hoang_duc_hai", EntityType.Builder.<HoangDucHaiEntity>of(HoangDucHaiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HoangDucHaiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NguyenLeKhanhEntity>> NGUYEN_LE_KHANH = register("nguyen_le_khanh",
			EntityType.Builder.<NguyenLeKhanhEntity>of(NguyenLeKhanhEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NguyenLeKhanhEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NguyenNamKhanhEntity>> NGUYEN_NAM_KHANH = register("nguyen_nam_khanh", EntityType.Builder.<NguyenNamKhanhEntity>of(NguyenNamKhanhEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NguyenNamKhanhEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NguyenTungLamEntity>> NGUYEN_TUNG_LAM = register("nguyen_tung_lam",
			EntityType.Builder.<NguyenTungLamEntity>of(NguyenTungLamEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NguyenTungLamEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TranHaLinhEntity>> TRAN_HA_LINH = register("tran_ha_linh",
			EntityType.Builder.<TranHaLinhEntity>of(TranHaLinhEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TranHaLinhEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TranPhuongLinhEntity>> TRAN_PHUONG_LINH = register("tran_phuong_linh", EntityType.Builder.<TranPhuongLinhEntity>of(TranPhuongLinhEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TranPhuongLinhEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NguyenPhuongLinhEntity>> NGUYEN_PHUONG_LINH = register("nguyen_phuong_linh", EntityType.Builder.<NguyenPhuongLinhEntity>of(NguyenPhuongLinhEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NguyenPhuongLinhEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VuHaLinhEntity>> VU_HA_LINH = register("vu_ha_linh",
			EntityType.Builder.<VuHaLinhEntity>of(VuHaLinhEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VuHaLinhEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NguyenTuanMinhEntity>> NGUYEN_TUAN_MINH = register("nguyen_tuan_minh", EntityType.Builder.<NguyenTuanMinhEntity>of(NguyenTuanMinhEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NguyenTuanMinhEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DuongTienMinhEntity>> DUONG_TIEN_MINH = register("duong_tien_minh",
			EntityType.Builder.<DuongTienMinhEntity>of(DuongTienMinhEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DuongTienMinhEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DangTuanMinhEntity>> DANG_TUAN_MINH = register("dang_tuan_minh", EntityType.Builder.<DangTuanMinhEntity>of(DangTuanMinhEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DangTuanMinhEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NguyenHaMinhEntity>> NGUYEN_HA_MINH = register("nguyen_ha_minh",
			EntityType.Builder.<NguyenHaMinhEntity>of(NguyenHaMinhEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NguyenHaMinhEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TranNhatMinhEntity>> TRAN_NHAT_MINH = register("tran_nhat_minh", EntityType.Builder.<TranNhatMinhEntity>of(TranNhatMinhEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TranNhatMinhEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VuKhanhNganEntity>> VU_KHANH_NGAN = register("vu_khanh_ngan",
			EntityType.Builder.<VuKhanhNganEntity>of(VuKhanhNganEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VuKhanhNganEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NguyenKhoiNguyenEntity>> NGUYEN_KHOI_NGUYEN = register("nguyen_khoi_nguyen",
			EntityType.Builder.<NguyenKhoiNguyenEntity>of(NguyenKhoiNguyenEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NguyenKhoiNguyenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NguyenLapHongPhucEntity>> NGUYEN_LAP_HONG_PHUC = register("nguyen_lap_hong_phuc", EntityType.Builder.<NguyenLapHongPhucEntity>of(NguyenLapHongPhucEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NguyenLapHongPhucEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TranMaiPhuongEntity>> TRAN_MAI_PHUONG = register("tran_mai_phuong", EntityType.Builder.<TranMaiPhuongEntity>of(TranMaiPhuongEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TranMaiPhuongEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TranNhuQuynhEntity>> TRAN_NHU_QUYNH = register("tran_nhu_quynh", EntityType.Builder.<TranNhuQuynhEntity>of(TranNhuQuynhEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TranNhuQuynhEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DoDucAnhTaiEntity>> DO_DUC_ANH_TAI = register("do_duc_anh_tai",
			EntityType.Builder.<DoDucAnhTaiEntity>of(DoDucAnhTaiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DoDucAnhTaiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TranQuyHoangThaiEntity>> TRAN_QUY_HOANG_THAI = register("tran_quy_hoang_thai", EntityType.Builder.<TranQuyHoangThaiEntity>of(TranQuyHoangThaiEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TranQuyHoangThaiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NguyenTuanThanhEntity>> NGUYEN_TUAN_THANH = register("nguyen_tuan_thanh",
			EntityType.Builder.<NguyenTuanThanhEntity>of(NguyenTuanThanhEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NguyenTuanThanhEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VuThanhThaoEntity>> VU_THANH_THAO = register("vu_thanh_thao",
			EntityType.Builder.<VuThanhThaoEntity>of(VuThanhThaoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VuThanhThaoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KieuPhuongThaoEntity>> KIEU_PHUONG_THAO = register("kieu_phuong_thao", EntityType.Builder.<KieuPhuongThaoEntity>of(KieuPhuongThaoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KieuPhuongThaoEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NguyenThanhTrucEntity>> NGUYEN_THANH_TRUC = register("nguyen_thanh_truc",
			EntityType.Builder.<NguyenThanhTrucEntity>of(NguyenThanhTrucEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NguyenThanhTrucEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NguyenTuUyenEntity>> NGUYEN_TU_UYEN = register("nguyen_tu_uyen",
			EntityType.Builder.<NguyenTuUyenEntity>of(NguyenTuUyenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NguyenTuUyenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DaoHongPhucEntity>> DAO_HONG_PHUC = register("dao_hong_phuc", EntityType.Builder.<DaoHongPhucEntity>of(DaoHongPhucEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DaoHongPhucEntity::new).fireImmune().sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<ToanEntity>> TOAN = register("toan",
			EntityType.Builder.<ToanEntity>of(ToanEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(2).setUpdateInterval(3).setCustomClientFactory(ToanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PhanEntity>> PHAN = register("phan",
			EntityType.Builder.<PhanEntity>of(PhanEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PhanEntityProjectile>> PHAN_PROJECTILE = register("projectile_phan",
			EntityType.Builder.<PhanEntityProjectile>of(PhanEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(PhanEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<OPBowProjectileEntity>> OP_BOW_PROJECTILE = register("op_bow_projectile", EntityType.Builder.<OPBowProjectileEntity>of(OPBowProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(OPBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DeadlyBowProjectileEntity>> DEADLY_BOW_PROJECTILE = register("deadly_bow_projectile", EntityType.Builder.<DeadlyBowProjectileEntity>of(DeadlyBowProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DeadlyBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TNTBowProjectileEntity>> TNT_BOW_PROJECTILE = register("tnt_bow_projectile", EntityType.Builder.<TNTBowProjectileEntity>of(TNTBowProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(TNTBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TranHoaiAnEntity.init();
			PhamMyAnEntity.init();
			NguyenThiNgocAnhEntity.init();
			DinhDiepAnhEntity.init();
			PhamDucAnhEntity.init();
			NguyenPhamMinhChauEntity.init();
			TruongNgocDiepEntity.init();
			DinhHoangDuongEntity.init();
			LuongHuuDatEntity.init();
			TranKhanhGiangEntity.init();
			HoangDucHaiEntity.init();
			NguyenLeKhanhEntity.init();
			NguyenNamKhanhEntity.init();
			NguyenTungLamEntity.init();
			TranHaLinhEntity.init();
			TranPhuongLinhEntity.init();
			NguyenPhuongLinhEntity.init();
			VuHaLinhEntity.init();
			NguyenTuanMinhEntity.init();
			DuongTienMinhEntity.init();
			DangTuanMinhEntity.init();
			NguyenHaMinhEntity.init();
			TranNhatMinhEntity.init();
			VuKhanhNganEntity.init();
			NguyenKhoiNguyenEntity.init();
			NguyenLapHongPhucEntity.init();
			TranMaiPhuongEntity.init();
			TranNhuQuynhEntity.init();
			DoDucAnhTaiEntity.init();
			TranQuyHoangThaiEntity.init();
			NguyenTuanThanhEntity.init();
			VuThanhThaoEntity.init();
			KieuPhuongThaoEntity.init();
			NguyenThanhTrucEntity.init();
			NguyenTuUyenEntity.init();
			DaoHongPhucEntity.init();
			ToanEntity.init();
			PhanEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TRAN_HOAI_AN.get(), TranHoaiAnEntity.createAttributes().build());
		event.put(PHAM_MY_AN.get(), PhamMyAnEntity.createAttributes().build());
		event.put(NGUYEN_THI_NGOC_ANH.get(), NguyenThiNgocAnhEntity.createAttributes().build());
		event.put(DINH_DIEP_ANH.get(), DinhDiepAnhEntity.createAttributes().build());
		event.put(PHAM_DUC_ANH.get(), PhamDucAnhEntity.createAttributes().build());
		event.put(NGUYEN_PHAM_MINH_CHAU.get(), NguyenPhamMinhChauEntity.createAttributes().build());
		event.put(TRUONG_NGOC_DIEP.get(), TruongNgocDiepEntity.createAttributes().build());
		event.put(DINH_HOANG_DUONG.get(), DinhHoangDuongEntity.createAttributes().build());
		event.put(LUONG_HUU_DAT.get(), LuongHuuDatEntity.createAttributes().build());
		event.put(TRAN_KHANH_GIANG.get(), TranKhanhGiangEntity.createAttributes().build());
		event.put(HOANG_DUC_HAI.get(), HoangDucHaiEntity.createAttributes().build());
		event.put(NGUYEN_LE_KHANH.get(), NguyenLeKhanhEntity.createAttributes().build());
		event.put(NGUYEN_NAM_KHANH.get(), NguyenNamKhanhEntity.createAttributes().build());
		event.put(NGUYEN_TUNG_LAM.get(), NguyenTungLamEntity.createAttributes().build());
		event.put(TRAN_HA_LINH.get(), TranHaLinhEntity.createAttributes().build());
		event.put(TRAN_PHUONG_LINH.get(), TranPhuongLinhEntity.createAttributes().build());
		event.put(NGUYEN_PHUONG_LINH.get(), NguyenPhuongLinhEntity.createAttributes().build());
		event.put(VU_HA_LINH.get(), VuHaLinhEntity.createAttributes().build());
		event.put(NGUYEN_TUAN_MINH.get(), NguyenTuanMinhEntity.createAttributes().build());
		event.put(DUONG_TIEN_MINH.get(), DuongTienMinhEntity.createAttributes().build());
		event.put(DANG_TUAN_MINH.get(), DangTuanMinhEntity.createAttributes().build());
		event.put(NGUYEN_HA_MINH.get(), NguyenHaMinhEntity.createAttributes().build());
		event.put(TRAN_NHAT_MINH.get(), TranNhatMinhEntity.createAttributes().build());
		event.put(VU_KHANH_NGAN.get(), VuKhanhNganEntity.createAttributes().build());
		event.put(NGUYEN_KHOI_NGUYEN.get(), NguyenKhoiNguyenEntity.createAttributes().build());
		event.put(NGUYEN_LAP_HONG_PHUC.get(), NguyenLapHongPhucEntity.createAttributes().build());
		event.put(TRAN_MAI_PHUONG.get(), TranMaiPhuongEntity.createAttributes().build());
		event.put(TRAN_NHU_QUYNH.get(), TranNhuQuynhEntity.createAttributes().build());
		event.put(DO_DUC_ANH_TAI.get(), DoDucAnhTaiEntity.createAttributes().build());
		event.put(TRAN_QUY_HOANG_THAI.get(), TranQuyHoangThaiEntity.createAttributes().build());
		event.put(NGUYEN_TUAN_THANH.get(), NguyenTuanThanhEntity.createAttributes().build());
		event.put(VU_THANH_THAO.get(), VuThanhThaoEntity.createAttributes().build());
		event.put(KIEU_PHUONG_THAO.get(), KieuPhuongThaoEntity.createAttributes().build());
		event.put(NGUYEN_THANH_TRUC.get(), NguyenThanhTrucEntity.createAttributes().build());
		event.put(NGUYEN_TU_UYEN.get(), NguyenTuUyenEntity.createAttributes().build());
		event.put(DAO_HONG_PHUC.get(), DaoHongPhucEntity.createAttributes().build());
		event.put(TOAN.get(), ToanEntity.createAttributes().build());
		event.put(PHAN.get(), PhanEntity.createAttributes().build());
	}
}