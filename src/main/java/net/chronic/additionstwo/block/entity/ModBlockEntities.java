package net.chronic.additionstwo.block.entity;

import net.chronic.additionstwo.AdditionsTwo;
import net.chronic.additionstwo.block.ModBlocks;
import net.chronic.additionstwo.block.entity.custom.AlloyerBlockEntity;
import net.chronic.additionstwo.block.entity.custom.PedestalBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<PedestalBlockEntity> PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(AdditionsTwo.MOD_ID, "pedestal_be"),
                    BlockEntityType.Builder.create(PedestalBlockEntity::new, ModBlocks.PEDESTAL).build(null));

    public static final BlockEntityType<AlloyerBlockEntity> ALLOYER_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(AdditionsTwo.MOD_ID, "alloyer_be"),
                    BlockEntityType.Builder.create(AlloyerBlockEntity::new, ModBlocks.ALLOYER).build(null));

    public static void registerBlockEntities() {
        AdditionsTwo.LOGGER.info("Registering Block Entities for " + AdditionsTwo.MOD_ID);
    }
}
