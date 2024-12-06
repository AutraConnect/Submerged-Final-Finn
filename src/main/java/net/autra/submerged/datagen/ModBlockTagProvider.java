package net.autra.submerged.datagen;

import net.autra.submerged.block.ModBlocks;
import net.autra.submerged.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
       getOrCreateTagBuilder(ModTags.Blocks.GEM_FINDER_ELIGIBLE_BLOCKS)
               .add(ModBlocks.SAPPHIRE_BLOCK,
                       ModBlocks.CRACKED_SAPPHIRE_BLOCK,
                       Blocks.EMERALD_BLOCK,
                       Blocks.DIAMOND_BLOCK,
                       Blocks.GOLD_BLOCK,
                       Blocks.AMETHYST_BLOCK,
                       Blocks.NETHERITE_BLOCK,
                       Blocks.DIAMOND_ORE,
                       Blocks.DEEPSLATE_DIAMOND_ORE,
                       Blocks.EMERALD_ORE,
                       Blocks.DEEPSLATE_EMERALD_ORE,
                       ModBlocks.SAPPHIRE_ORE,
                       ModBlocks.DEEPSLATE_SAPPHIRE_ORE,
                       ModBlocks.NETHER_SAPPHIRE_ORE,
                       ModBlocks.END_SAPPHIRE_ORE);

       getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
               .add(ModBlocks.SAPPHIRE_BLOCK,
                       ModBlocks.CRACKED_SAPPHIRE_BLOCK,
                       ModBlocks.SAPPHIRE_STAIRS,
                       ModBlocks.SAPPHIRE_SLAB,
                       ModBlocks.SAPPHIRE_FENCE,
                       ModBlocks.SAPPHIRE_FENCE_GATE,
                       ModBlocks.SAPPHIRE_WALL,
                       ModBlocks.SAPPHIRE_BUTTON,
                       ModBlocks.SAPPHIRE_PRESSURE_PLATE,
                       ModBlocks.SAPPHIRE_DOOR,
                       ModBlocks.SAPPHIRE_TRAPDOOR,
                       ModBlocks.SAPPHIRE_ORE,
                       ModBlocks.DEEPSLATE_SAPPHIRE_ORE,
                       ModBlocks.NETHER_SAPPHIRE_ORE,
                       ModBlocks.END_SAPPHIRE_ORE);



       getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
               .add(ModBlocks.SAPPHIRE_BLOCK);

       getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.CRACKED_SAPPHIRE_BLOCK);

        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.SAPPHIRE_WALL);
        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.SAPPHIRE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.SAPPHIRE_FENCE_GATE);
    }
}
