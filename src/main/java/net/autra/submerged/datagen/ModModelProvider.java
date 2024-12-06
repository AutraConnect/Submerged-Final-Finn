package net.autra.submerged.datagen;

import net.autra.submerged.block.ModBlocks;
import net.autra.submerged.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool sapphireTexturePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_SAPPHIRE_BLOCK);

        sapphireTexturePool.stairs(ModBlocks.SAPPHIRE_STAIRS);
        sapphireTexturePool.slab(ModBlocks.SAPPHIRE_SLAB);
        sapphireTexturePool.fence(ModBlocks.SAPPHIRE_FENCE);
        sapphireTexturePool.fenceGate(ModBlocks.SAPPHIRE_FENCE_GATE);
        sapphireTexturePool.wall(ModBlocks.SAPPHIRE_WALL);
        sapphireTexturePool.button(ModBlocks.SAPPHIRE_BUTTON);
        sapphireTexturePool.pressurePlate(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(ModBlocks.SAPPHIRE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SAPPHIRE_TRAPDOOR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_SAPPHIRE_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AUTRA_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRACKED_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMPOWERED_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IMBUED_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GEM_FINDER, Models.GENERATED);

        //Tools
        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.SHARK_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));
    }
}
