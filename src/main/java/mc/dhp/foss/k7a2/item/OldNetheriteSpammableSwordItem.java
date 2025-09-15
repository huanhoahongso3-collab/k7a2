
package mc.dhp.foss.k7a2.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import mc.dhp.foss.k7a2.init.K7a2ModItems;

import java.util.List;

public class OldNetheriteSpammableSwordItem extends SwordItem {
	public OldNetheriteSpammableSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 10500;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(K7a2ModItems.K_7_A_2INGOT.get()));
			}
		}, 3, 96f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Spammable?"));
	}
}
