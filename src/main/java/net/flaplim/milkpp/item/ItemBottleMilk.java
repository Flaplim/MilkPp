package net.flaplim.milkpp.item;

import net.flaplim.milkpp.MilkPp;
import net.flaplim.milkpp.creativetab.MilkPpCreativeTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Hye-Seo on 2016-02-06.
 */
public class ItemBottleMilk extends ItemPotion {
    public ItemBottleMilk() {
        this.setMaxStackSize(1);
        this.setMaxDamage(0);
        if (this.hasFlavour()) {
            this.setRegistryName(this.getFlavour() + "_milk_bottle");
            this.setUnlocalizedName(MilkPp.MODID + "." + this.getFlavour() + "_milkBottle");
        } else {
            this.setRegistryName("milk_bottle");
            this.setUnlocalizedName(MilkPp.MODID + ".milkBottle");
        }
        this.setCreativeTab(MilkPpCreativeTabs.tabMilkPp);
    }

    public String getFlavour() {
        return "";
    }

    public boolean hasFlavour() {
        return this.getFlavour() != null && !this.getFlavour().isEmpty();
    }

    @Override
    public String toString() {
        return "milkBottle";
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        playerIn.curePotionEffects(new ItemStack(Items.milk_bucket));
        return super.onItemUseFinish(stack, worldIn, playerIn);

    }

    @Override
    public int getColorFromItemStack(ItemStack stack, int renderPass) {
        return renderPass > 0 ? 0xffffff : 0xffffff;
    }

    @Override
    public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {
        subItems.add(new ItemStack(itemIn, 1, 0));
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return (StatCollector.translateToLocal(this.getUnlocalizedNameInefficiently(stack) + ".name")).trim();
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);
        stack.setTagInfo("HideFlags", new NBTTagInt((1)));
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return false;  //To remove Enchantment Effects.
    }
}
