package mc.dhp.foss.k7a2.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class K7a2mixeddiscItem extends RecordItem {
	public K7a2mixeddiscItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("k7a2:k7a2_mixed_voice")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1500);
	}
}