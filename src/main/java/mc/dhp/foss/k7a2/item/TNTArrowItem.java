package mc.dhp.foss.k7a2.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TNTArrowItem extends Item {
	public TNTArrowItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}