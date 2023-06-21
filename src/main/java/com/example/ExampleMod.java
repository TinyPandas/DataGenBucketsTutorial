package com.example;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	public static final String MODID = "examplemod";

	public static final Item RED_WATER_BUCKET = new CustomBucket(new FabricItemSettings(), 12320768);
	public static final Item GREEN_WATER_BUCKET = new CustomBucket(new FabricItemSettings(), 48128);
	public static final Item BLUE_WATER_BUCKET = new CustomBucket(new FabricItemSettings(), 188);

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier(MODID, "red_water_bucket"), RED_WATER_BUCKET);
		Registry.register(Registries.ITEM, new Identifier(MODID, "green_water_bucket"), GREEN_WATER_BUCKET);
		Registry.register(Registries.ITEM, new Identifier(MODID, "blue_water_bucket"), BLUE_WATER_BUCKET);
	}
}