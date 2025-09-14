package mc.dhp.foss.k7a2.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class K7A2SecretDecorationBlock extends Block {
	public K7A2SecretDecorationBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.LANTERN).strength(5f, 17f).noCollission().ignitedByLava());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}