package net.chronic.additionstwo.block;

import net.chronic.additionstwo.AdditionsTwo;
import net.chronic.additionstwo.block.custom.AlloyerBlock;
import net.chronic.additionstwo.block.custom.PedestalBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;


public class ModBlocks {

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block BRASS_BLOCK = registerBlock("brass_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block ZINC_ORE = registerBlock("zinc_ore",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_ZINC_ORE = registerBlock("deepslate_zinc_ore",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));


    public static final Block SAMPLE_ORE = registerBlock("sampleore",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RAW_SAMPLE_BLOCK = registerBlock("rawsampleblock",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SAMPLE_BLOCK = registerBlock("sampleblock",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));


    public static final Block SAMPLE_STAIRS = registerBlock("sample_stairs",
            new StairsBlock(ModBlocks.SAMPLE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SAMPLE_SLAB = registerBlock("sample_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block SAMPLE_BUTTON = registerBlock("sample_button",
            new ButtonBlock(BlockSetType.OAK, 2,
                    AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block SAMPLE_PRESSURE_PLATE = registerBlock("sample_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block SAMPLE_FENCE = registerBlock("sample_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SAMPLE_FENCE_GATE = registerBlock("sample_fence_gate",
            new FenceGateBlock(WoodType.ACACIA,
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SAMPLE_WALL = registerBlock("sample_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block SAMPLE_DOOR = registerBlock("sample_door",
            new DoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block SAMPLE_TRAPDOOR = registerBlock("sample_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));

    public static final Block ALLOYER = registerBlock("alloyer_block",
            new AlloyerBlock(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block PEDESTAL = registerBlock("pedestal",
            new PedestalBlock(AbstractBlock.Settings.create().nonOpaque()));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AdditionsTwo.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AdditionsTwo.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        AdditionsTwo.LOGGER.info("Registering Blocks for " + AdditionsTwo.MOD_ID);
    }
}
