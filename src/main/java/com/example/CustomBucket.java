package com.example;

import net.minecraft.fluid.Fluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;

public class CustomBucket extends BucketItem {
    private final int fluidColor;

    public CustomBucket(Item.Settings settings, int fluidColor) {
        super(Fluids.WATER, settings);
        this.fluidColor = fluidColor;
    }

    public int getColor(int tintIndex) {
        return tintIndex == 1 ? fluidColor: -1;
    }
}