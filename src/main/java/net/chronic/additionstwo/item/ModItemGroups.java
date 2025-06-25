package net.chronic.additionstwo.item;

import net.chronic.additionstwo.AdditionsTwo;
import net.chronic.additionstwo.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ADDITIONS = Registry.register(Registries.ITEM_GROUP, Identifier.of(AdditionsTwo.MOD_ID, "additions"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.STEEL_INGOT))
                    .displayName(Text.translatable("itemgroup.additionstwo.additions"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.BRASS_INGOT);
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModItems.MYTHRIL_INGOT);
                        entries.add(ModItems.RAW_MYTHRIL);
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.BRASS_BLOCK);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModBlocks.MYTHRIL_BLOCK);
                        entries.add(ModBlocks.MYTHRIL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_MYTHRIL_ORE);

                        entries.add(ModBlocks.SAMPLE_BLOCK);
                        entries.add(ModBlocks.RAW_SAMPLE_BLOCK);
                        entries.add(ModBlocks.SAMPLE_STAIRS);
                        entries.add(ModBlocks.SAMPLE_SLAB);
                        entries.add(ModBlocks.SAMPLE_BUTTON);
                        entries.add(ModBlocks.SAMPLE_WALL);
                        entries.add(ModBlocks.SAMPLE_FENCE);
                        entries.add(ModBlocks.SAMPLE_FENCE_GATE);
                        entries.add(ModBlocks.SAMPLE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SAMPLE_DOOR);
                        entries.add(ModBlocks.SAMPLE_TRAPDOOR);

                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_HOE);

                        entries.add(ModItems.BRONZE_SWORD);
                        entries.add(ModItems.BRONZE_PICKAXE);
                        entries.add(ModItems.BRONZE_AXE);
                        entries.add(ModItems.BRONZE_SHOVEL);
                        entries.add(ModItems.BRONZE_HOE);

                        entries.add(ModItems.BRASS_SWORD);
                        entries.add(ModItems.BRASS_PICKAXE);
                        entries.add(ModItems.BRASS_AXE);
                        entries.add(ModItems.BRASS_SHOVEL);
                        entries.add(ModItems.BRASS_HOE);

                        entries.add(ModItems.MYTHRIL_SWORD);
                        entries.add(ModItems.MYTHRIL_PICKAXE);
                        entries.add(ModItems.MYTHRIL_AXE);
                        entries.add(ModItems.MYTHRIL_SHOVEL);
                        entries.add(ModItems.MYTHRIL_HOE);

                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);

                        entries.add(ModItems.BRONZE_HELMET);
                        entries.add(ModItems.BRONZE_CHESTPLATE);
                        entries.add(ModItems.BRONZE_LEGGINGS);
                        entries.add(ModItems.BRONZE_BOOTS);

                        entries.add(ModItems.BRASS_HELMET);
                        entries.add(ModItems.BRASS_CHESTPLATE);
                        entries.add(ModItems.BRASS_LEGGINGS);
                        entries.add(ModItems.BRASS_BOOTS);

                        entries.add(ModItems.MYTHRIL_HELMET);
                        entries.add(ModItems.MYTHRIL_CHESTPLATE);
                        entries.add(ModItems.MYTHRIL_LEGGINGS);
                        entries.add(ModItems.MYTHRIL_BOOTS);

                    }).build());



    public static void registerItemGroups() {
        AdditionsTwo.LOGGER.info("Registering Mod Item Groups for " + AdditionsTwo.MOD_ID);
    }
}
