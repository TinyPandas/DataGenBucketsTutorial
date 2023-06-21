package com.example;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

public class ExampleModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> ((CustomBucket) stack.getItem()).getColor(tintIndex),
				ExampleMod.RED_WATER_BUCKET, ExampleMod.GREEN_WATER_BUCKET, ExampleMod.BLUE_WATER_BUCKET);
	}
}