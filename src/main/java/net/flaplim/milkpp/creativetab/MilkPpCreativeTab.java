package net.flaplim.milkpp.creativetab;

import net.flaplim.milkpp.MilkPp;
import net.flaplim.milkpp.item.MilkPpItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Hye-Seo on 2016-02-12.
 */
public class MilkPpCreativeTab extends CreativeTabs {

    public MilkPpCreativeTab() {
        super(MilkPp.MODID);
    }

    @Override
    public Item getTabIconItem() {
        return MilkPpItems.item_milk_bottle_strawberry;
    }
}
