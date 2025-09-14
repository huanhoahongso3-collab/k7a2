
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.k7a2.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.k7a2.client.renderer.VuThanhThaoRenderer;
import net.mcreator.k7a2.client.renderer.VuKhanhNganRenderer;
import net.mcreator.k7a2.client.renderer.VuHaLinhRenderer;
import net.mcreator.k7a2.client.renderer.TruongNgocDiepRenderer;
import net.mcreator.k7a2.client.renderer.TranQuyHoangThaiRenderer;
import net.mcreator.k7a2.client.renderer.TranPhuongLinhRenderer;
import net.mcreator.k7a2.client.renderer.TranNhuQuynhRenderer;
import net.mcreator.k7a2.client.renderer.TranNhatMinhRenderer;
import net.mcreator.k7a2.client.renderer.TranMaiPhuongRenderer;
import net.mcreator.k7a2.client.renderer.TranKhanhGiangRenderer;
import net.mcreator.k7a2.client.renderer.TranHoaiAnRenderer;
import net.mcreator.k7a2.client.renderer.TranHaLinhRenderer;
import net.mcreator.k7a2.client.renderer.ToanRenderer;
import net.mcreator.k7a2.client.renderer.PhanRenderer;
import net.mcreator.k7a2.client.renderer.PhamMyAnRenderer;
import net.mcreator.k7a2.client.renderer.PhamDucAnhRenderer;
import net.mcreator.k7a2.client.renderer.NguyenTungLamRenderer;
import net.mcreator.k7a2.client.renderer.NguyenTuanThanhRenderer;
import net.mcreator.k7a2.client.renderer.NguyenTuanMinhRenderer;
import net.mcreator.k7a2.client.renderer.NguyenTuUyenRenderer;
import net.mcreator.k7a2.client.renderer.NguyenThiNgocAnhRenderer;
import net.mcreator.k7a2.client.renderer.NguyenThanhTrucRenderer;
import net.mcreator.k7a2.client.renderer.NguyenPhuongLinhRenderer;
import net.mcreator.k7a2.client.renderer.NguyenPhamMinhChauRenderer;
import net.mcreator.k7a2.client.renderer.NguyenNamKhanhRenderer;
import net.mcreator.k7a2.client.renderer.NguyenLeKhanhRenderer;
import net.mcreator.k7a2.client.renderer.NguyenLapHongPhucRenderer;
import net.mcreator.k7a2.client.renderer.NguyenKhoiNguyenRenderer;
import net.mcreator.k7a2.client.renderer.NguyenHaMinhRenderer;
import net.mcreator.k7a2.client.renderer.LuongHuuDatRenderer;
import net.mcreator.k7a2.client.renderer.KieuPhuongThaoRenderer;
import net.mcreator.k7a2.client.renderer.HoangDucHaiRenderer;
import net.mcreator.k7a2.client.renderer.DuongTienMinhRenderer;
import net.mcreator.k7a2.client.renderer.DoDucAnhTaiRenderer;
import net.mcreator.k7a2.client.renderer.DinhHoangDuongRenderer;
import net.mcreator.k7a2.client.renderer.DinhDiepAnhRenderer;
import net.mcreator.k7a2.client.renderer.DaoHongPhucRenderer;
import net.mcreator.k7a2.client.renderer.DangTuanMinhRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class K7a2ModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(K7a2ModEntities.TOAN.get(), ToanRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.TRAN_HOAI_AN.get(), TranHoaiAnRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.PHAM_MY_AN.get(), PhamMyAnRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.NGUYEN_THI_NGOC_ANH.get(), NguyenThiNgocAnhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.DINH_DIEP_ANH.get(), DinhDiepAnhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.PHAM_DUC_ANH.get(), PhamDucAnhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.NGUYEN_PHAM_MINH_CHAU.get(), NguyenPhamMinhChauRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.TRUONG_NGOC_DIEP.get(), TruongNgocDiepRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.DINH_HOANG_DUONG.get(), DinhHoangDuongRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.LUONG_HUU_DAT.get(), LuongHuuDatRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.TRAN_KHANH_GIANG.get(), TranKhanhGiangRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.HOANG_DUC_HAI.get(), HoangDucHaiRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.NGUYEN_LE_KHANH.get(), NguyenLeKhanhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.NGUYEN_NAM_KHANH.get(), NguyenNamKhanhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.NGUYEN_TUNG_LAM.get(), NguyenTungLamRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.TRAN_HA_LINH.get(), TranHaLinhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.TRAN_PHUONG_LINH.get(), TranPhuongLinhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.NGUYEN_PHUONG_LINH.get(), NguyenPhuongLinhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.VU_HA_LINH.get(), VuHaLinhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.NGUYEN_TUAN_MINH.get(), NguyenTuanMinhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.DUONG_TIEN_MINH.get(), DuongTienMinhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.DANG_TUAN_MINH.get(), DangTuanMinhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.NGUYEN_HA_MINH.get(), NguyenHaMinhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.TRAN_NHAT_MINH.get(), TranNhatMinhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.VU_KHANH_NGAN.get(), VuKhanhNganRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.NGUYEN_KHOI_NGUYEN.get(), NguyenKhoiNguyenRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.NGUYEN_LAP_HONG_PHUC.get(), NguyenLapHongPhucRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.TRAN_MAI_PHUONG.get(), TranMaiPhuongRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.TRAN_NHU_QUYNH.get(), TranNhuQuynhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.DO_DUC_ANH_TAI.get(), DoDucAnhTaiRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.TRAN_QUY_HOANG_THAI.get(), TranQuyHoangThaiRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.NGUYEN_TUAN_THANH.get(), NguyenTuanThanhRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.VU_THANH_THAO.get(), VuThanhThaoRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.KIEU_PHUONG_THAO.get(), KieuPhuongThaoRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.NGUYEN_THANH_TRUC.get(), NguyenThanhTrucRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.NGUYEN_TU_UYEN.get(), NguyenTuUyenRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.DAO_HONG_PHUC.get(), DaoHongPhucRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.PHAN.get(), PhanRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.DEADLY_BOW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.OP_BOW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(K7a2ModEntities.TNT_BOW_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
