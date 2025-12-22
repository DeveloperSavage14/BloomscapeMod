package net.spud.bloomscape.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.spud.bloomscape.Bloomscape;

public class RestoredBloomscapeBlock extends Block {

    public RestoredBloomscapeBlock(Settings settings) {
        super(settings);
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextFloat() < 0.015f) {
            BlockState targetState = ModBlocks.TARNISHED_BLOOMSCAPE.getDefaultState();
            world.setBlockState(pos, targetState, 3);
            Bloomscape.LOGGER.info("RESTORED_BLOOMSCAPE at " + pos + " transformed into TARNISHED_BLOOMSCAPE!");
        }
    }
}