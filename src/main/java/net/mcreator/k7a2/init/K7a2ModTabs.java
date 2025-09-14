
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.k7a2.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.k7a2.K7a2Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class K7a2ModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, K7a2Mod.MODID);
	public static final RegistryObject<CreativeModeTab> K_7_A_2 = REGISTRY.register("k_7_a_2",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.k7a2.k_7_a_2")).icon(() -> new ItemStack(K7a2ModItems.K_7_A_2INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(K7a2ModItems.K_7_A_2_NUGGET.get());
				tabData.accept(K7a2ModItems.K_7_A_2_STICK.get());
				tabData.accept(K7a2ModItems.RAW_K_7_A_2_ENCHANTED_APPLE.get());
				tabData.accept(K7a2ModItems.K_7_A_2INGOT.get());
				tabData.accept(K7a2ModItems.K_7_A_2_SHEARS.get());
				tabData.accept(K7a2ModBlocks.BLOCKOF_K_7_A_2.get().asItem());
				tabData.accept(K7a2ModItems.SUPER_K_7_A_2_INGOT.get());
				tabData.accept(K7a2ModItems.K_7_A_2_ARMOR_HELMET.get());
				tabData.accept(K7a2ModItems.K_7_A_2_ARMOR_CHESTPLATE.get());
				tabData.accept(K7a2ModItems.K_7_A_2_ARMOR_LEGGINGS.get());
				tabData.accept(K7a2ModItems.K_7_A_2_ARMOR_BOOTS.get());
				tabData.accept(K7a2ModItems.K_7_A_2_PICKAXE.get());
				tabData.accept(K7a2ModItems.K_7_A_2_AXE.get());
				tabData.accept(K7a2ModItems.K_7_A_2_SHOVEL.get());
				tabData.accept(K7a2ModItems.K_7_A_2_HOE.get());
				tabData.accept(K7a2ModItems.K_7_A_2_SWORD.get());
				tabData.accept(K7a2ModItems.OLD_NETHERITE_SPAMMABLE_SWORD.get());
				tabData.accept(K7a2ModItems.BATTLE_GOLDEN_AXE.get());
				tabData.accept(K7a2ModItems.HANH_KHUC_CBH.get());
				tabData.accept(K7a2ModItems.MA_GAMING_RAP.get());
				tabData.accept(K7a2ModItems.FLORENTINO.get());
				tabData.accept(K7a2ModItems.THIEN_LY_OI.get());
				tabData.accept(K7a2ModItems.IF_I_AM_WITH_YOU.get());
				tabData.accept(K7a2ModItems.SMURFCAT.get());
				tabData.accept(K7a2ModItems.K_7A_2MIXEDDISC.get());
				tabData.accept(K7a2ModBlocks.K_7_A_2_WOOD_WOOD.get().asItem());
				tabData.accept(K7a2ModBlocks.K_7_A_2_WOOD_LOG.get().asItem());
				tabData.accept(K7a2ModBlocks.K_7_A_2_WOOD_PLANKS.get().asItem());
				tabData.accept(K7a2ModBlocks.K_7_A_2_WOOD_LEAVES.get().asItem());
				tabData.accept(K7a2ModBlocks.K_7_A_2_WOOD_STAIRS.get().asItem());
				tabData.accept(K7a2ModBlocks.K_7_A_2_WOOD_SLAB.get().asItem());
				tabData.accept(K7a2ModBlocks.K_7_A_2_WOOD_FENCE.get().asItem());
				tabData.accept(K7a2ModBlocks.K_7_A_2_WOOD_FENCE_GATE.get().asItem());
				tabData.accept(K7a2ModItems.K_7_A_2_DIM.get());
				tabData.accept(K7a2ModBlocks.K_7_A_2_PORTAL_BLOCK.get().asItem());
				tabData.accept(K7a2ModBlocks.DH_PHUC_WOOD.get().asItem());
				tabData.accept(K7a2ModBlocks.DH_PHUC_LOG.get().asItem());
				tabData.accept(K7a2ModBlocks.DH_PHUC_PLANKS.get().asItem());
				tabData.accept(K7a2ModBlocks.DH_PHUC_LEAVES.get().asItem());
				tabData.accept(K7a2ModBlocks.DH_PHUC_STAIRS.get().asItem());
				tabData.accept(K7a2ModBlocks.DH_PHUC_SLAB.get().asItem());
				tabData.accept(K7a2ModBlocks.DH_PHUC_FENCE.get().asItem());
				tabData.accept(K7a2ModBlocks.DH_PHUC_FENCE_GATE.get().asItem());
				tabData.accept(K7a2ModItems.AETHER.get());
				tabData.accept(K7a2ModItems.ENDERMAN_HACK_WINDOWS_10_S.get());
				tabData.accept(K7a2ModItems.ENDERMAN_SECRET.get());
				tabData.accept(K7a2ModItems.BEDROCK_INSTANT_MINE_PICKAXE.get());
				tabData.accept(K7a2ModItems.K_7_A_2_TOOL_GETTING_BLOCK.get());
				tabData.accept(K7a2ModItems.K_7_A_2_APPLE.get());
				tabData.accept(K7a2ModItems.K_7_A_2_ENCHANTED_APPLE.get());
				tabData.accept(K7a2ModItems.K_7_A_2_CARROT.get());
				tabData.accept(K7a2ModItems.K_7_A_2_LAVA_BUCKET.get());
				tabData.accept(K7a2ModBlocks.K_7_A_2_FLOWER.get().asItem());
				tabData.accept(K7a2ModItems.BUON_HAY_VUI.get());
				tabData.accept(K7a2ModBlocks.K_7_A_2_RAINBOW_BLOCK.get().asItem());
				tabData.accept(K7a2ModBlocks.K_7_A_2_RAINBOW_DECORATION_BLOCK.get().asItem());
				tabData.accept(K7a2ModItems.TNT_ARROW.get());
				tabData.accept(K7a2ModItems.TNT_CHARGE.get());
				tabData.accept(K7a2ModItems.NIGHT_CHANGE.get());
				tabData.accept(K7a2ModItems.OP_BOW.get());
				tabData.accept(K7a2ModItems.TNT_BOW.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> K_7_A_2_BUILDING_BLOCK = REGISTRY.register("k_7_a_2_building_block",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.k7a2.k_7_a_2_building_block")).icon(() -> new ItemStack(K7a2ModBlocks.BLOCKOF_K_7_A_2.get())).displayItems((parameters, tabData) -> {
				tabData.accept(K7a2ModBlocks.BLOCK_OF_CHAU.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_DANG_MINH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_DANH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_DAT.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_DIEP.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_DUC_ANH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_DUONG.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_DUONG_MINH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_GIANG.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_HAI.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCKOF_HA_MINH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_HOAI_AN.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_KHANH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_KHANHS.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_KIEU_THAO.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_LAM.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_MY_AN.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_NGAN.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_NGOC_ANH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_NGUYEN_LINH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_NGUYEN_MINH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_NGUYEN_PHUC.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_NHAT_MINH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_PHUONG.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_QUYNH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_TAI.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_THAI.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_THANH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_THLINH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_TPLINH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_TRUC.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_UYEN.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_VHLINH.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_VU_THAO.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_NGUYEN.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_DHP.get().asItem());
				tabData.accept(K7a2ModBlocks.BLOCK_OF_CO_TOAN.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(K7a2ModItems.TOAN_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.TRAN_HOAI_AN_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.PHAM_MY_AN_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.NGUYEN_THI_NGOC_ANH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.DINH_DIEP_ANH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.PHAM_DUC_ANH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.NGUYEN_PHAM_MINH_CHAU_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.TRUONG_NGOC_DIEP_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.DINH_HOANG_DUONG_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.LUONG_HUU_DAT_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.TRAN_KHANH_GIANG_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.HOANG_DUC_HAI_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.NGUYEN_LE_KHANH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.NGUYEN_NAM_KHANH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.NGUYEN_TUNG_LAM_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.TRAN_HA_LINH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.TRAN_PHUONG_LINH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.NGUYEN_PHUONG_LINH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.VU_HA_LINH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.NGUYEN_TUAN_MINH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.DUONG_TIEN_MINH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.DANG_TUAN_MINH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.NGUYEN_HA_MINH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.TRAN_NHAT_MINH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.VU_KHANH_NGAN_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.NGUYEN_KHOI_NGUYEN_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.NGUYEN_LAP_HONG_PHUC_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.TRAN_MAI_PHUONG_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.TRAN_NHU_QUYNH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.DO_DUC_ANH_TAI_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.TRAN_QUY_HOANG_THAI_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.NGUYEN_TUAN_THANH_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.VU_THANH_THAO_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.KIEU_PHUONG_THAO_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.NGUYEN_THANH_TRUC_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.NGUYEN_TU_UYEN_SPAWN_EGG.get());
			tabData.accept(K7a2ModItems.PHAN_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(K7a2ModBlocks.BLOCK_OF_THLINH_2.get().asItem());
			tabData.accept(K7a2ModBlocks.K_7_A_2_SECRET_DECORATION.get().asItem());
		}
	}
}
