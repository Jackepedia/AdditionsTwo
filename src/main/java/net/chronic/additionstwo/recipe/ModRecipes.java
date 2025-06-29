package net.chronic.additionstwo.recipe;

import net.chronic.additionstwo.AdditionsTwo;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static final RecipeSerializer<AlloyerRecipe> ALLOYER_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(AdditionsTwo.MOD_ID, "alloyer"),
            new AlloyerRecipe.Serializer());
    public static final RecipeType<AlloyerRecipe> ALLOYER_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(AdditionsTwo.MOD_ID, "alloyer"), new RecipeType<AlloyerRecipe>() {
                @Override
                public String toString() {
                    return "alloyer";
                }
            });

    public static void registerRecipes() {
        AdditionsTwo.LOGGER.info("Registering Custom Recipes for " + AdditionsTwo.MOD_ID);
    }
}