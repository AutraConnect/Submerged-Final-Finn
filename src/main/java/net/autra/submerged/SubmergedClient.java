package net.autra.submerged;

import net.autra.submerged.block.ModBlocks;
import net.autra.submerged.entity.ModEntities;
import net.autra.submerged.entity.client.SharkModel;
import net.autra.submerged.entity.client.SharkRenderer;
import net.autra.submerged.entity.layer.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class SubmergedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAPPHIRE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAPPHIRE_TRAPDOOR, RenderLayer.getCutout());

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.SHARK, SharkModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.SHARK, SharkRenderer::new);
    }
}
