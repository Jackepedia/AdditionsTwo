package net.chronic.additionstwo.datagen;

import net.chronic.additionstwo.item.ModItems;
import net.chronic.additionstwo.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.SAMPLE_ITEM_TAG)
                .add(ModItems.SAMPLEITEM)
                .add(ModItems.RAWSAMPLEITEM);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.STEEL_SWORD)
                .add(ModItems.BRONZE_SWORD)
                .add(ModItems.BRASS_SWORD)
                .add(ModItems.MYTHRIL_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.STEEL_PICKAXE)
                .add(ModItems.BRONZE_PICKAXE)
                .add(ModItems.BRASS_PICKAXE)
                .add(ModItems.MYTHRIL_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.STEEL_AXE)
                .add(ModItems.BRONZE_AXE)
                .add(ModItems.BRASS_AXE)
                .add(ModItems.MYTHRIL_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.STEEL_SHOVEL)
                .add(ModItems.BRONZE_SHOVEL)
                .add(ModItems.BRASS_SHOVEL)
                .add(ModItems.MYTHRIL_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.STEEL_HOE)
                .add(ModItems.BRONZE_HOE)
                .add(ModItems.BRASS_HOE)
                .add(ModItems.MYTHRIL_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.STEEL_HELMET)
                .add(ModItems.STEEL_CHESTPLATE)
                .add(ModItems.STEEL_LEGGINGS)
                .add(ModItems.STEEL_BOOTS)
                .add(ModItems.BRONZE_HELMET)
                .add(ModItems.BRONZE_CHESTPLATE)
                .add(ModItems.BRONZE_LEGGINGS)
                .add(ModItems.BRONZE_BOOTS)
                .add(ModItems.BRASS_HELMET)
                .add(ModItems.BRASS_CHESTPLATE)
                .add(ModItems.BRASS_LEGGINGS)
                .add(ModItems.BRASS_BOOTS)
                .add(ModItems.MYTHRIL_HELMET)
                .add(ModItems.MYTHRIL_CHESTPLATE)
                .add(ModItems.MYTHRIL_LEGGINGS)
                .add(ModItems.MYTHRIL_BOOTS);
    }
}
