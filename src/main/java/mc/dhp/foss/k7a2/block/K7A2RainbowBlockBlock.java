package mc.dhp.foss.k7a2.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class K7A2RainbowBlockBlock extends Block {
	public K7A2RainbowBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(5f, 10f).requiresCorrectToolForDrops().ignitedByLava());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}