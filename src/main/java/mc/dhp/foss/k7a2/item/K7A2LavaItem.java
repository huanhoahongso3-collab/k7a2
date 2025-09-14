package mc.dhp.foss.k7a2.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import mc.dhp.foss.k7a2.init.K7a2ModFluids;

public class K7A2LavaItem extends BucketItem {
	public K7A2LavaItem() {
		super(K7a2ModFluids.K_7_A_2_LAVA, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}