package net.chronic.additionstwo.item;

import net.chronic.additionstwo.AdditionsTwo;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item BRASS_INGOT = registerItem("brass_ingot", new Item(new Item.Settings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Settings()));
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new Item.Settings()));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new Item.Settings()));


    public static final Item STEEL_SWORD = registerItem("steel_sword", new SwordItem(ModToolMaterials.STEEL,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, 3, -2.5f))));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe", new PickaxeItem(ModToolMaterials.STEEL,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 1, -2.9f))));
    public static final Item STEEL_AXE = registerItem("steel_axe", new AxeItem(ModToolMaterials.STEEL,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 3, -2.5f))));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel", new ShovelItem(ModToolMaterials.STEEL,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STEEL, 1, -3.5f))));
    public static final Item STEEL_HOE = registerItem("steel_hoe", new HoeItem(ModToolMaterials.STEEL,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STEEL, 0, -3.5f))));

    public static final Item BRONZE_SWORD = registerItem("bronze_sword", new SwordItem(ModToolMaterials.BRONZE,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BRONZE, 3, -1.5f))));
    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe", new PickaxeItem(ModToolMaterials.BRONZE,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.BRONZE, 1, -2.9f))));
    public static final Item BRONZE_AXE = registerItem("bronze_axe", new AxeItem(ModToolMaterials.BRONZE,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.BRONZE, 3, -2.5f))));
    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel", new ShovelItem(ModToolMaterials.BRONZE,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.BRONZE, 1, -3.5f))));
    public static final Item BRONZE_HOE = registerItem("bronze_hoe", new HoeItem(ModToolMaterials.BRONZE,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.BRONZE, 0, -3.5f))));

    public static final Item BRASS_SWORD = registerItem("brass_sword", new SwordItem(ModToolMaterials.BRASS,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BRASS, 3, -4.0f))));
    public static final Item BRASS_PICKAXE = registerItem("brass_pickaxe", new PickaxeItem(ModToolMaterials.BRASS,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.BRASS, 1, -2.9f))));
    public static final Item BRASS_AXE = registerItem("brass_axe", new AxeItem(ModToolMaterials.BRASS,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.BRASS, 3, -2.5f))));
    public static final Item BRASS_SHOVEL = registerItem("brass_shovel", new ShovelItem(ModToolMaterials.BRASS,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.BRASS, 1, -3.5f))));
    public static final Item BRASS_HOE = registerItem("brass_hoe", new HoeItem(ModToolMaterials.BRASS,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.BRASS, 0, -3.5f))));

    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword", new SwordItem(ModToolMaterials.MYTHRIL,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.MYTHRIL, 3, -4.5f))));
    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe", new PickaxeItem(ModToolMaterials.MYTHRIL,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.MYTHRIL, 1, -2.9f))));
    public static final Item MYTHRIL_AXE = registerItem("mythril_axe", new AxeItem(ModToolMaterials.MYTHRIL,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.MYTHRIL, 3, -2.5f))));
    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel", new ShovelItem(ModToolMaterials.MYTHRIL,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.MYTHRIL, 1, -3.5f))));
    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe", new HoeItem(ModToolMaterials.MYTHRIL,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.MYTHRIL, 0, -3.5f))));


    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(22))));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(22))));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(22))));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(22))));

    public static final Item BRONZE_HELMET = registerItem("bronze_helmet",
            new ArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(22))));
    public static final Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate",
            new ArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(22))));
    public static final Item BRONZE_LEGGINGS = registerItem("bronze_leggings",
            new ArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(22))));
    public static final Item BRONZE_BOOTS = registerItem("bronze_boots",
            new ArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(22))));

    public static final Item BRASS_HELMET = registerItem("brass_helmet",
            new ArmorItem(ModArmorMaterials.BRASS_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(22))));
    public static final Item BRASS_CHESTPLATE = registerItem("brass_chestplate",
            new ArmorItem(ModArmorMaterials.BRASS_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(22))));
    public static final Item BRASS_LEGGINGS = registerItem("brass_leggings",
            new ArmorItem(ModArmorMaterials.BRASS_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(22))));
    public static final Item BRASS_BOOTS = registerItem("brass_boots",
            new ArmorItem(ModArmorMaterials.BRASS_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(22))));

    public static final Item MYTHRIL_HELMET = registerItem("mythril_helmet",
            new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(22))));
    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythril_chestplate",
            new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(22))));
    public static final Item MYTHRIL_LEGGINGS = registerItem("mythril_leggings",
            new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(22))));
    public static final Item MYTHRIL_BOOTS = registerItem("mythril_boots",
            new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(22))));



    public static final Item SAMPLEITEM = registerItem("sampleitem", new Item(new Item.Settings()));
    public static final Item RAWSAMPLEITEM = registerItem("rawsampleitem", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AdditionsTwo.MOD_ID, name), item);
    }


    public static void registerModItems() {
        AdditionsTwo.LOGGER.info("registering Items for " + AdditionsTwo.MOD_ID);
        AdditionsTwo.LOGGER.info("registering Mod Tool Materials for " + AdditionsTwo.MOD_ID);
    }
}
