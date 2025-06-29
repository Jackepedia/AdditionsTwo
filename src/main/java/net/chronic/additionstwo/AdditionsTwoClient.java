package net.chronic.additionstwo;

import net.chronic.additionstwo.block.ModBlocks;
import net.chronic.additionstwo.block.entity.ModBlockEntities;
import net.chronic.additionstwo.entity.renderer.PedestalBlockEntityRenderer;
import net.chronic.additionstwo.screen.ModScreenHandlers;
import net.chronic.additionstwo.screen.custom.AlloyerScreen;
import net.chronic.additionstwo.screen.custom.PedestalScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class AdditionsTwoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAMPLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAMPLE_TRAPDOOR, RenderLayer.getCutout());
        BlockEntityRendererFactories.register(ModBlockEntities.PEDESTAL_BE, PedestalBlockEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.ALLOYER_SCREEN_HANDLER, AlloyerScreen::new);
        HandledScreens.register(ModScreenHandlers.PEDESTAL_SCREEN_HANDLER, PedestalScreen::new);


    }
}
