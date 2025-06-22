package net.chronic.additionstwo.item;

import net.chronic.additionstwo.AdditionsTwo;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item BRASS_INGOT = registerItem("brass_ingot", new Item(new Item.Settings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Settings()));
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new Item.Settings()));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new Item.Settings()));


    public static final Item SAMPLEITEM = registerItem("sampleitem", new Item(new Item.Settings()));
    public static final Item RAWSAMPLEITEM = registerItem("rawsampleitem", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AdditionsTwo.MOD_ID, name), item);
    }


    public static void registerModItems() {
        AdditionsTwo.LOGGER.info("registering Items for " + AdditionsTwo.MOD_ID);
    }
}
