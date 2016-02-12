package net.flaplim.milkpp.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hye-Seo on 2016-02-06.
 */
public final class MilkPpItems {
    public static final Item item_milk_bottle = new ItemBottleMilk();
    public static final Item item_milk_bottle_strawberry = new ItemBottleMilkStrawberry();
    public static final Item item_milk_bottle_banana = new ItemBottleMilkBanana();
    public static final Item item_milk_bottle_chocolate = new ItemBottleMilkChocolate();

    private MilkPpItems() {
        throw new AssertionError();
    }

    public static Set<Item> getItems() {
        Set<Item> items = new HashSet<>();
        items.add(item_milk_bottle);
        items.add(item_milk_bottle_strawberry);
        items.add(item_milk_bottle_banana);
        items.add(item_milk_bottle_chocolate);
        return items;
    }

    public static void register() {
        getItems().forEach(GameRegistry::registerItem);
    }

    public static void registerRenders() {
        for (Item item : getItems()) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(item, 0, new ModelResourceLocation("minecraft:bottle_drinkable", "inventory"));
        }
    }
}
