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
                        entries.add(ModBlocks.STEEL_BLOCK);

                    }).build());



    public static void registerItemGroups() {
        AdditionsTwo.LOGGER.info("Registering Mod Item Groups for " + AdditionsTwo.MOD_ID);
    }
}
