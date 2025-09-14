
package net.mcreator.k7a2.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.network.chat.Component;

import net.mcreator.k7a2.init.K7a2ModItems;

import java.util.List;

public class K7A2HoeItem extends HoeItem {
	public K7A2HoeItem() {
		super(new Tier() {
			public int getUses() {
				return 5610;
			}

			public float getSpeed() {
				return 56201f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 7;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get()));
			}
		}, 0, 6f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
