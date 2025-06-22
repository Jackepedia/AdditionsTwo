package net.chronic.additionstwo.datagen;

import net.chronic.additionstwo.block.ModBlocks;
import net.chronic.additionstwo.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> SAMPLE_SMELTABLES = List.of(ModItems.RAWSAMPLEITEM, ModBlocks.SAMPLEORE);

        offerSmelting(exporter, SAMPLE_SMELTABLES, RecipeCategory.MISC, ModItems.SAMPLEITEM, 0.25f, 200, "sampleitem");
        offerBlasting(exporter, SAMPLE_SMELTABLES, RecipeCategory.MISC, ModItems.SAMPLEITEM, 0.25f, 200, "sampleitem");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT, RecipeCategory.MISC, ModBlocks.STEEL_BLOCK);

    }
}
