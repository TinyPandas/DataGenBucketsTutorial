package com.example;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

public class ExampleModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> ((CustomBucket) ExampleMod.RED_WATER_BUCKET).getColor(tintIndex), ExampleMod.RED_WATER_BUCKET);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> ((CustomBucket) ExampleMod.GREEN_WATER_BUCKET).getColor(tintIndex), ExampleMod.GREEN_WATER_BUCKET);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> ((CustomBucket) ExampleMod.BLUE_WATER_BUCKET).getColor(tintIndex), ExampleMod.BLUE_WATER_BUCKET);
	}
}