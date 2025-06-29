
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
import net.minecraft.item.Items;
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
        List<ItemConvertible> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE);
        List<ItemConvertible> ZINC_SMELTABLES = List.of(ModItems.RAW_ZINC, ModBlocks.ZINC_ORE, ModBlocks.DEEPSLATE_ZINC_ORE);

        offerSmelting(exporter, SAMPLE_SMELTABLES, RecipeCategory.MISC, ModItems.SAMPLEITEM, 0.25f, 200, "sampleitem");
        offerBlasting(exporter, SAMPLE_SMELTABLES, RecipeCategory.MISC, ModItems.SAMPLEITEM, 0.25f, 200, "sampleitem");

        offerSmelting(exporter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 0.25f, 200, "mythril_ingot");
        offerBlasting(exporter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 0.25f, 200, "mythril_ingot");

        offerSmelting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.25f, 200, "tin_ingot");
        offerBlasting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.25f, 200, "tin_ingot");

        offerSmelting(exporter, ZINC_SMELTABLES, RecipeCategory.MISC, ModItems.ZINC_INGOT, 0.25f, 200, "zinc_ingot");
        offerBlasting(exporter, ZINC_SMELTABLES, RecipeCategory.MISC, ModItems.ZINC_INGOT, 0.25f, 200, "zinc_ingot");

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


//  ARMOR CRAFTING STUFF

        // STEEL

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .pattern("   ")
                .input('R', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_BOOTS)
                .pattern("   ")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        // BRONZE

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRONZE_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .pattern("   ")
                .input('R', ModItems.BRONZE_INGOT)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRONZE_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.BRONZE_INGOT)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRONZE_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.BRONZE_INGOT)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRONZE_BOOTS)
                .pattern("   ")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.BRONZE_INGOT)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(exporter);

        // BRASS

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRASS_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .pattern("   ")
                .input('R', ModItems.BRASS_INGOT)
                .criterion(hasItem(ModItems.BRASS_INGOT), conditionsFromItem(ModItems.BRASS_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRASS_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.BRASS_INGOT)
                .criterion(hasItem(ModItems.BRASS_INGOT), conditionsFromItem(ModItems.BRASS_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRASS_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.BRASS_INGOT)
                .criterion(hasItem(ModItems.BRASS_INGOT), conditionsFromItem(ModItems.BRASS_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRASS_BOOTS)
                .pattern("   ")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.BRASS_INGOT)
                .criterion(hasItem(ModItems.BRASS_INGOT), conditionsFromItem(ModItems.BRASS_INGOT))
                .offerTo(exporter);

        //MYTHRIL

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MYTHRIL_HELMET)
                .pattern(" R ")
                .pattern("R#R")
                .pattern(" R ")
                .input('R', ModItems.MYTHRIL_INGOT)
                .input('#', ModItems.STEEL_HELMET)
                .criterion(hasItem(ModItems.MYTHRIL_INGOT), conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MYTHRIL_CHESTPLATE)
                .pattern(" R ")
                .pattern("R#R")
                .pattern(" R ")
                .input('R', ModItems.MYTHRIL_INGOT)
                .input('#', ModItems.STEEL_CHESTPLATE)
                .criterion(hasItem(ModItems.MYTHRIL_INGOT), conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MYTHRIL_LEGGINGS)
                .pattern(" R ")
                .pattern("R#R")
                .pattern(" R ")
                .input('R', ModItems.MYTHRIL_INGOT)
                .input('#', ModItems.STEEL_CHESTPLATE)
                .criterion(hasItem(ModItems.MYTHRIL_INGOT), conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MYTHRIL_BOOTS)
                .pattern(" R ")
                .pattern("R#R")
                .pattern(" R ")
                .input('R', ModItems.MYTHRIL_INGOT)
                .input('#', ModItems.STEEL_BOOTS)
                .criterion(hasItem(ModItems.MYTHRIL_INGOT), conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ALLOYER)
                .pattern("DDD")
                .pattern("BAB")
                .pattern("CCC")
                .input('A', Items.BLAST_FURNACE)
                .input('B', Items.BRICKS)
                .input('C', Items.POLISHED_BLACKSTONE)
                .input('D', Items.SMOOTH_STONE)
                .criterion(hasItem(Items.BLAST_FURNACE), conditionsFromItem(Items.BLAST_FURNACE))
                .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                .criterion(hasItem(Items.POLISHED_BLACKSTONE), conditionsFromItem(Items.POLISHED_BLACKSTONE))
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .offerTo(exporter);





    }
}
