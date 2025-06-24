package net.chronic.additionstwo.item;

import net.chronic.additionstwo.AdditionsTwo;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> STEEL_ARMOR_MATERIAL = registerArmorMaterial("steel",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 10);
            }),22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.STEEL_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdditionsTwo.MOD_ID, "steel"))),5.5f, 0.25f));

    public static final RegistryEntry<ArmorMaterial> BRONZE_ARMOR_MATERIAL = registerArmorMaterial("bronze",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 9);
            }),10, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdditionsTwo.MOD_ID, "bronze"))),2, 0));

    public static final RegistryEntry<ArmorMaterial> BRASS_ARMOR_MATERIAL = registerArmorMaterial("brass",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 8);
            }),25, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.BRASS_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdditionsTwo.MOD_ID, "brass"))),1, 0));

    public static final RegistryEntry<ArmorMaterial> MYTHRIL_ARMOR_MATERIAL = registerArmorMaterial("mythril",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.HELMET, 5);
                map.put(ArmorItem.Type.BODY, 25);
            }),30, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.MYTHRIL_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdditionsTwo.MOD_ID, "mythril"))),4, 0.5f));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(AdditionsTwo.MOD_ID, name), material.get());
    }
}
