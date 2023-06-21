package com.example;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class DataGenEntry implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        final FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(CustomModelProvider::new);
    }

    private static class CustomModelProvider extends FabricModelProvider {
        private CustomModelProvider(FabricDataOutput output) {
            super(output);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            itemModelGenerator.register(ExampleMod.RED_WATER_BUCKET, item("template_bucket"));
            itemModelGenerator.register(ExampleMod.GREEN_WATER_BUCKET, item("template_bucket"));
            itemModelGenerator.register(ExampleMod.BLUE_WATER_BUCKET, item("template_bucket"));
        }
    }

    public static Model item(String parent) {
        return new Model(Optional.of(new Identifier(ExampleMod.MODID, "item/" + parent)), Optional.empty());
    }
}
