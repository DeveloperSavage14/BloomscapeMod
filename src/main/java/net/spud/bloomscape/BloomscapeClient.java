package net.spud.bloomscape;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.spud.bloomscape.blocks.ModFlowers;

public class BloomscapeClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.RESTORED_DANDELION, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.TARNISHED_DANDELION, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.RESTORED_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.TARNISHED_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.RESTORED_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.TARNISHED_TULIP, RenderLayer.getCutout());
    }
}