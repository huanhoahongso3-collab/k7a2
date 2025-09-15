
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package mc.dhp.foss.k7a2.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class K7a2ModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8),

					new ItemStack(Items.IRON_NUGGET), 100, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2INGOT.get()),

					new ItemStack(Blocks.EMERALD_BLOCK, 2), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(K7a2ModBlocks.BLOCKOF_K_7_A_2.get()),

					new ItemStack(Items.DIAMOND, 4), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(K7a2ModBlocks.BLOCKOF_K_7_A_2.get()),

					new ItemStack(Items.NETHERITE_INGOT), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64),

					new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(Items.DIAMOND), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32),

					new ItemStack(Items.NETHERITE_INGOT), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get()),

					new ItemStack(Blocks.EMERALD_BLOCK, 4), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get()),

					new ItemStack(Items.DIAMOND, 12), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get()),

					new ItemStack(Items.NETHERITE_INGOT, 2), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Blocks.DIAMOND_BLOCK, 8),

					new ItemStack(K7a2ModItems.K_7_A_2_PICKAXE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Blocks.DIAMOND_BLOCK, 8),

					new ItemStack(K7a2ModItems.K_7_A_2_AXE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Blocks.DIAMOND_BLOCK, 8),

					new ItemStack(K7a2ModItems.K_7_A_2_SHOVEL.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Blocks.DIAMOND_BLOCK, 8),

					new ItemStack(K7a2ModItems.K_7_A_2_SWORD.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.NETHERITE_BLOCK, 12),

					new ItemStack(K7a2ModItems.K_7_A_2_ARMOR_HELMET.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.NETHERITE_BLOCK, 12),

					new ItemStack(K7a2ModItems.K_7_A_2_ARMOR_CHESTPLATE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.NETHERITE_BLOCK, 12),

					new ItemStack(K7a2ModItems.K_7_A_2_ARMOR_LEGGINGS.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.NETHERITE_BLOCK, 12),

					new ItemStack(K7a2ModItems.K_7_A_2_ARMOR_BOOTS.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32),

					new ItemStack(K7a2ModItems.OLD_NETHERITE_SPAMMABLE_SWORD.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.NETHERITE_INGOT, 64),

					new ItemStack(K7a2ModItems.BATTLE_GOLDEN_AXE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get()),

					new ItemStack(K7a2ModItems.BEDROCK_INSTANT_MINE_PICKAXE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2_NUGGET.get()),

					new ItemStack(Items.IRON_INGOT), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2_NUGGET.get()),

					new ItemStack(Items.GOLD_INGOT), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2_NUGGET.get()),

					new ItemStack(Blocks.REDSTONE_BLOCK), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2_NUGGET.get()),

					new ItemStack(Blocks.LAPIS_BLOCK), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT),

					new ItemStack(K7a2ModItems.K_7_A_2_NUGGET.get(), 2), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.GOLD_INGOT),

					new ItemStack(K7a2ModItems.K_7_A_2_NUGGET.get(), 2), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.REDSTONE_BLOCK),

					new ItemStack(K7a2ModItems.K_7_A_2_NUGGET.get(), 2), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.LAPIS_BLOCK),

					new ItemStack(K7a2ModItems.K_7_A_2_NUGGET.get(), 2), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2INGOT.get()),

					new ItemStack(K7a2ModBlocks.BLOCK_OF_THLINH_2.get(), 64), 9999, 0, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get(), 2),

					new ItemStack(K7a2ModItems.DEATH_NOTE.get()), 1, 0, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2_STICK.get()),

					new ItemStack(Blocks.CACTUS), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.STICK),

					new ItemStack(Blocks.BELL), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2INGOT.get()),

					new ItemStack(Items.ENDER_PEARL), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(K7a2ModBlocks.BLOCKOF_K_7_A_2.get(), 2),

					new ItemStack(Items.WITHER_SKELETON_SKULL), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get()),

					new ItemStack(Items.ZOMBIE_HEAD), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2INGOT.get()),

					new ItemStack(K7a2ModBlocks.K_7_A_2_SECRET_DECORATION.get()), 64, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.HIDDEN_VILLAGER_PRO.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2INGOT.get()),

					new ItemStack(K7a2ModItems.DEADLY_BOW.get()), 1, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_MUSIC.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2INGOT.get()),

					new ItemStack(K7a2ModItems.MA_GAMING_RAP.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_MUSIC.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2INGOT.get()),

					new ItemStack(K7a2ModItems.FLORENTINO.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_MUSIC.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2INGOT.get()),

					new ItemStack(K7a2ModItems.THIEN_LY_OI.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_MUSIC.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2INGOT.get()),

					new ItemStack(K7a2ModItems.IF_I_AM_WITH_YOU.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_MUSIC.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get()),

					new ItemStack(K7a2ModItems.SMURFCAT.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_MUSIC.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get()),

					new ItemStack(K7a2ModItems.BUON_HAY_VUI.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get()),

					new ItemStack(K7a2ModItems.NIGHT_CHANGE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_OP.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2INGOT.get()),

					new ItemStack(K7a2ModBlocks.K_7_A_2_RAINBOW_BLOCK.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_OP.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(K7a2ModBlocks.BLOCKOF_K_7_A_2.get()),

					new ItemStack(K7a2ModItems.K_7_A_2_LAVA_BUCKET.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_OP.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get(), 16),

					new ItemStack(K7a2ModItems.PHAN_SPAWN_EGG.get()), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(K7a2ModItems.TNT_BOW.get()), new ItemStack(K7a2ModItems.K_7_A_2INGOT.get()), new ItemStack(K7a2ModItems.TNT_BOW.get(), 2), 10, 5, 0.05f));
		}
		if (event.getType() == K7a2ModVillagerProfessions.K_7_A_2_PRO.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(K7a2ModItems.K_7_A_2INGOT.get()),

					new ItemStack(K7a2ModItems.TNT_ARROW.get(), 4), 10, 5, 0.05f));
		}
	}
}
