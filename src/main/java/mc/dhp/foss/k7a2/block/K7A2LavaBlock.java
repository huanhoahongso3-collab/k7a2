package mc.dhp.foss.k7a2.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import mc.dhp.foss.k7a2.init.K7a2ModFluids;

public class K7A2LavaBlock extends LiquidBlock {
	public K7A2LavaBlock() {
		super(() -> K7a2ModFluids.K_7_A_2_LAVA.get(), BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}