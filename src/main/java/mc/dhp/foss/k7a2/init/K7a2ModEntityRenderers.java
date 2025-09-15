
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import mc.dhp.foss.k7a2.client.renderer.VuThanhThaoRenderer;
import mc.dhp.foss.k7a2.client.renderer.VuKhanhNganRenderer;
import mc.dhp.foss.k7a2.client.renderer.VuHaLinhRenderer;
import mc.dhp.foss.k7a2.client.renderer.TruongNgocDiepRenderer;
import mc.dhp.foss.k7a2.client.renderer.TranQuyHoangThaiRenderer;
import mc.dhp.foss.k7a2.client.renderer.TranPhuongLinhRenderer;
import mc.dhp.foss.k7a2.client.renderer.TranNhuQuynhRenderer;
import mc.dhp.foss.k7a2.client.renderer.TranNhatMinhRenderer;
import mc.dhp.foss.k7a2.client.renderer.TranMaiPhuongRenderer;
import mc.dhp.foss.k7a2.client.renderer.TranKhanhGiangRenderer;
import mc.dhp.foss.k7a2.client.renderer.TranHoaiAnRenderer;
import mc.dhp.foss.k7a2.client.renderer.TranHaLinhRenderer;
import mc.dhp.foss.k7a2.client.renderer.ToanRenderer;
import mc.dhp.foss.k7a2.client.renderer.PhanRenderer;
import mc.dhp.foss.k7a2.client.renderer.PhamMyAnRenderer;
import mc.dhp.foss.k7a2.client.renderer.PhamDucAnhRenderer;
import mc.dhp.foss.k7a2.client.renderer.NguyenTungLamRenderer;
import mc.dhp.foss.k7a2.client.renderer.NguyenTuanThanhRenderer;
import mc.dhp.foss.k7a2.client.renderer.NguyenTuanMinhRenderer;
import mc.dhp.foss.k7a2.client.renderer.NguyenTuUyenRenderer;
import mc.dhp.foss.k7a2.client.renderer.NguyenThiNgocAnhRenderer;
import mc.dhp.foss.k7a2.client.renderer.NguyenThanhTrucRenderer;
import mc.dhp.foss.k7a2.client.renderer.NguyenPhuongLinhRenderer;
import mc.dhp.foss.k7a2.client.renderer.NguyenPhamMinhChauRenderer;
import mc.dhp.foss.k7a2.client.renderer.NguyenNamKhanhRenderer;
import mc.dhp.foss.k7a2.client.renderer.NguyenLeKhanhRenderer;
import mc.dhp.foss.k7a2.client.renderer.NguyenLapHongPhucRenderer;
import mc.dhp.foss.k7a2.client.renderer.NguyenKhoiNguyenRenderer;
import mc.dhp.foss.k7a2.client.renderer.NguyenHaMinhRenderer;
import mc.dhp.foss.k7a2.client.renderer.LuongHuuDatRenderer;
import mc.dhp.foss.k7a2.client.renderer.KieuPhuongThaoRenderer;
import mc.dhp.foss.k7a2.client.renderer.HoangDucHaiRenderer;
import mc.dhp.foss.k7a2.client.renderer.DuongTienMinhRenderer;
import mc.dhp.foss.k7a2.client.renderer.DoDucAnhTaiRenderer;
import mc.dhp.foss.k7a2.client.renderer.DinhHoangDuongRenderer;
import mc.dhp.foss.k7a2.client.renderer.DinhDiepAnhRenderer;
import mc.dhp.foss.k7a2.client.renderer.DaoHongPhucRenderer;
import mc.dhp.foss.k7a2.client.renderer.DangTuanMinhRenderer;

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
