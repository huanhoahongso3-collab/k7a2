package mc.dhp.foss.k7a2.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import mc.dhp.foss.k7a2.init.K7a2ModItems;

public class K7A2SwordItem extends SwordItem {
	public K7A2SwordItem() {
		super(new Tier() {
			public int getUses() {
				return 5610;
			}

			public float getSpeed() {
				return 56201f;
			}

			public float getAttackDamageBonus() {
				return 6.5f;
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
		}, 3, -2.25f, new Item.Properties());
	}
}