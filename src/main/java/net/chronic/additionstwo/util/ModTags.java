package net.chronic.additionstwo.util;

import net.chronic.additionstwo.AdditionsTwo;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SAMPLE_BLOCK_TAG = createTag("sample_block_tag");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(AdditionsTwo.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> SAMPLE_ITEM_TAG = createTag("sample_item_tag");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(AdditionsTwo.MOD_ID, name));
        }
    }
}