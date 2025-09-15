
package mc.dhp.foss.k7a2.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.network.chat.Component;

import mc.dhp.foss.k7a2.init.K7a2ModItems;

import java.util.List;

public class BattleGoldenAxeItem extends AxeItem {
	public BattleGoldenAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 5500;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 18.5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get()));
			}
		}, 1, -2.75f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
