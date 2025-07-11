package net.chronic.additionstwo.item;

import com.google.common.base.Suppliers;
import net.chronic.additionstwo.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    STEEL(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL, 1850, 5.0F,
            3.5F, 22, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    BRONZE(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL, 1300, 4.0F,
            3.0F, 10, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),
    BRASS(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL, 1465, 4.5F,
            4.5F, 25, () -> Ingredient.ofItems(ModItems.BRASS_INGOT)),
    MYTHRIL(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL,12000, 9.5F,
            6.0F, 30, () -> Ingredient.ofItems(ModItems.MYTHRIL_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability,final float miningSpeed,
                     final float attackDamage, final int enchantability,final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}