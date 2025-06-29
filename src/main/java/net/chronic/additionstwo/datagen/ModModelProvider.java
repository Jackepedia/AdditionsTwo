package net.chronic.additionstwo.datagen;

import net.chronic.additionstwo.block.ModBlocks;
import net.chronic.additionstwo.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZINC_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ZINC_ORE);
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

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ALLOYER);
        blockStateModelGenerator.register();
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRASS_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZINC_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ZINC, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MYTHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAMPLEITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAWSAMPLEITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRASS_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRASS_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRASS_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRASS_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRASS_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRONZE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRONZE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRONZE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRONZE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRASS_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRASS_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRASS_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRASS_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_BOOTS));




    }
}
