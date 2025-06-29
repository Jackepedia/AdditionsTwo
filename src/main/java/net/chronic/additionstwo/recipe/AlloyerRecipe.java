package net.chronic.additionstwo.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public record AlloyerRecipe(Ingredient input1, Ingredient input2, Ingredient input3, ItemStack output) implements Recipe<AlloyerRecipeInput> {

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(input1);
        list.add(input2);
        list.add(input3);
        return list;
    }

    @Override
    public boolean matches(AlloyerRecipeInput input, World world) {
        if (world.isClient()) return false;

        return input1.test(input.getStackInSlot(0)) &&
                input2.test(input.getStackInSlot(1)) &&
                input3.test(input.getStackInSlot(2));
    }

    @Override
    public ItemStack craft(AlloyerRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.ALLOYER_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.ALLOYER_TYPE;
    }

    public static class Serializer implements RecipeSerializer<AlloyerRecipe> {
        public static final MapCodec<AlloyerRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient1").forGetter(AlloyerRecipe::input1),
                Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient2").forGetter(AlloyerRecipe::input2),
                Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient3").forGetter(AlloyerRecipe::input3),
                ItemStack.CODEC.fieldOf("result").forGetter(AlloyerRecipe::output)
        ).apply(inst, AlloyerRecipe::new));

        public static final PacketCodec<RegistryByteBuf, AlloyerRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, AlloyerRecipe::input1,
                        Ingredient.PACKET_CODEC, AlloyerRecipe::input2,
                        Ingredient.PACKET_CODEC, AlloyerRecipe::input3,
                        ItemStack.PACKET_CODEC, AlloyerRecipe::output,
                        AlloyerRecipe::new
                );

        @Override
        public MapCodec<AlloyerRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, AlloyerRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
