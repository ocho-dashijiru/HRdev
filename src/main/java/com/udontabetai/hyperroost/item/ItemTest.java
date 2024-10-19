package com.udontabetai.hyperroost.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTest extends Item {
    public ItemTest() {
        super();
        this.setRegistryName("hyper_roost", "test_item");
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }
}
