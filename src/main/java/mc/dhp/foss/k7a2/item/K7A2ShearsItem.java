
package mc.dhp.foss.k7a2.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class K7A2ShearsItem extends ShearsItem {
	public K7A2ShearsItem() {
		super(new Item.Properties().durability(56210));
	}

	@Override
	public int getEnchantmentValue() {
		return 25;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 56201f;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
