package net.flaplim.milkpp.item;

import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hye-Seo on 2016-02-12.
 */
public class ItemBottleMilkChocolate extends ItemBottleMilk {

    @Override
    public String getFlavour() {
        return "chocolate";
    }

    @Override
    public int getColorFromItemStack(ItemStack stack, int renderPass) {
        return renderPass > 0 ? 0xffffff : 0x664c33;
    }

    @Override
    public List<PotionEffect> getEffects(ItemStack stack) {
        List<PotionEffect> effects = new ArrayList<>();
        effects.add(new PotionEffect(Potion.resistance.getId(), 300, 0));
        return effects;
    }
}
