package net.flaplim.milkpp.item.crafting;

import net.flaplim.milkpp.item.MilkPpItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Hye-Seo on 2016-02-11.
 */
public class MilkPpRecipes {
    private MilkPpRecipes() {
        throw new AssertionError();
    }

    public static void addRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(MilkPpItems.item_milk_bottle), Items.glass_bottle, Items.milk_bucket);

        BrewingRecipeRegistry.addRecipe(new ItemStack(MilkPpItems.item_milk_bottle), new ItemStack(Items.dye, 1, 9), new ItemStack(MilkPpItems.item_milk_bottle_strawberry));
        BrewingRecipeRegistry.addRecipe(new ItemStack(MilkPpItems.item_milk_bottle), new ItemStack(Items.dye, 1, 11), new ItemStack(MilkPpItems.item_milk_bottle_banana));
        BrewingRecipeRegistry.addRecipe(new ItemStack(MilkPpItems.item_milk_bottle), new ItemStack(Items.dye, 1, 3), new ItemStack(MilkPpItems.item_milk_bottle_chocolate));
    }
}
