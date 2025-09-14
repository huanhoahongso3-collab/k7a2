package mc.dhp.foss.k7a2.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import mc.dhp.foss.k7a2.init.K7a2ModItems;

public class K7A2AxeItem extends AxeItem {
	public K7A2AxeItem() {
		super(new Tier() {
			public int getUses() {
				return 5610;
			}

			public float getSpeed() {
				return 56201f;
			}

			public float getAttackDamageBonus() {
				return 8.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(K7a2ModItems.SUPER_K_7_A_2_INGOT.get()));
			}
		}, 1, -2.75f, new Item.Properties());
	}
}