package net.flaplim.milkpp.proxy;

import net.flaplim.milkpp.item.MilkPpItems;

/**
 * Created by Hye-Seo on 2016-02-06.
 */
public class ClientProxy implements MilkPpProxy {
    @Override
    public void registerRenders() {
        MilkPpItems.registerRenders();
    }
}
