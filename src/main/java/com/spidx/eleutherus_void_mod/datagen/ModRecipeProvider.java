package com.spidx.eleutherus_void_mod.datagen;

import com.spidx.eleutherus_void_mod.block.ModBlocks;
import com.spidx.eleutherus_void_mod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ELEUTHERUS, RecipeCategory.MISC,
                ModBlocks.ELEUTHERUS_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ELEUTHERUS_PIE, 1)
                .pattern("-*-")
                .pattern("*+*")
                .pattern("-*-")
                .input('*', ModItems.ELEUTHERUS)
                .input('-', Items.COPPER_INGOT)
                .input('+', Items.PUMPKIN_PIE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.PUMPKIN_PIE), conditionsFromItem(Items.PUMPKIN_PIE))
                .criterion(hasItem(ModItems.ELEUTHERUS), conditionsFromItem(ModItems.ELEUTHERUS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ELEUTHERUS_PIE)));

    }
}
