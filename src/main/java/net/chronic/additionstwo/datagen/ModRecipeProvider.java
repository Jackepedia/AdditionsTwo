
package net.chronic.additionstwo.datagen;

import net.chronic.additionstwo.AdditionsTwo;
import net.chronic.additionstwo.block.ModBlocks;
import net.chronic.additionstwo.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> SAMPLE_SMELTABLES = List.of(ModItems.RAWSAMPLEITEM, ModBlocks.SAMPLE_ORE);
        List<ItemConvertible> MYTHRIL_SMELTABLES = List.of(ModItems.RAW_MYTHRIL, ModBlocks.MYTHRIL_ORE);

        offerSmelting(exporter, SAMPLE_SMELTABLES, RecipeCategory.MISC, ModItems.SAMPLEITEM, 0.25f, 200, "sampleitem");
        offerBlasting(exporter, SAMPLE_SMELTABLES, RecipeCategory.MISC, ModItems.SAMPLEITEM, 0.25f, 200, "sampleitem");

        offerSmelting(exporter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 0.25f, 200, "mythril_ingot");
        offerBlasting(exporter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 0.25f, 200, "mythril_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT, RecipeCategory.MISC, ModBlocks.STEEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BRASS_INGOT, RecipeCategory.MISC, ModBlocks.BRASS_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_INGOT, RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MYTHRIL_INGOT, RecipeCategory.MISC, ModBlocks.MYTHRIL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_SAMPLE_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAWSAMPLEITEM)
                .criterion(hasItem(ModItems.RAWSAMPLEITEM), conditionsFromItem(ModItems.RAWSAMPLEITEM))
                .offerTo(exporter);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAWSAMPLEITEM, 9)
                .input(ModBlocks.RAW_SAMPLE_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_SAMPLE_BLOCK), conditionsFromItem(ModBlocks.RAW_SAMPLE_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAWSAMPLEITEM, 32)
                .input(ModBlocks.SAMPLE_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_SAMPLE_BLOCK), conditionsFromItem(ModBlocks.RAW_SAMPLE_BLOCK))
                .offerTo(exporter, Identifier.of(AdditionsTwo.MOD_ID, "rawsampleitem_from_sampleblock"));
    }
}
