package net.chronic.additionstwo.datagen;

import net.chronic.additionstwo.block.ModBlocks;
import net.chronic.additionstwo.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRONZE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRASS_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_MYTHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAMPLE_ORE);
        BlockStateModelGenerator.BlockTexturePool SamplePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAMPLE_BLOCK);

        SamplePool.stairs(ModBlocks.SAMPLE_STAIRS);
        SamplePool.slab(ModBlocks.SAMPLE_SLAB);
        SamplePool.fence(ModBlocks.SAMPLE_FENCE);
        SamplePool.fenceGate(ModBlocks.SAMPLE_FENCE_GATE);
        SamplePool.wall(ModBlocks.SAMPLE_WALL);
        SamplePool.button(ModBlocks.SAMPLE_BUTTON);
        SamplePool.pressurePlate(ModBlocks.SAMPLE_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.SAMPLE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SAMPLE_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRASS_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MYTHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAMPLEITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAWSAMPLEITEM, Models.GENERATED);


    }
}
