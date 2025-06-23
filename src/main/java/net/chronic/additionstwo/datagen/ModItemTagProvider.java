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
