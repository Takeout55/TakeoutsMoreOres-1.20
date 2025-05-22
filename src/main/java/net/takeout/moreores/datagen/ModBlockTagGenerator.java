package net.takeout.moreores.datagen;

import net.takeout.moreores.MoreOres;
import net.takeout.moreores.block.ModBlocks;
import net.takeout.moreores.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MoreOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.ZIRCON_ORE.get(),
                        ModBlocks.DEEPSLATE_ZIRCON_ORE.get(),
                        ModBlocks.NETHERRACK_ZIRCON_ORE.get(),
                        ModBlocks.ENDSTONE_ZIRCON_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.NETHERRACK_SAPPHIRE_ORE.get(),
                        ModBlocks.ENDSTONE_SAPPHIRE_ORE.get(),
                        ModBlocks.NETHER_GASNITE_ORE.get(),
                        ModBlocks.GASNITE_ORE.get(),
                        ModBlocks.EARIUM_ORE.get(),
                        ModBlocks.NETHER_EARIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_EARIUM_ORE.get(),
                        ModBlocks.END_STONE_EARIUM_ORE.get(),
                        ModBlocks.END_STONE_GASNITE_ORE.get(),
                        ModBlocks.DEEPSLATE_GASNITE_ORE.get()
                    ).addTag(Tags.Blocks.ORES);



        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.NETHERRACK_SAPPHIRE_ORE.get(),
                        ModBlocks.ENDSTONE_SAPPHIRE_ORE.get(),
                        ModBlocks.ZIRCON_ORE.get(),
                        ModBlocks.DEEPSLATE_ZIRCON_ORE.get(),
                        ModBlocks.ENDSTONE_ZIRCON_ORE.get(),
                        ModBlocks.NETHERRACK_ZIRCON_ORE.get(),
                        ModBlocks.GASNITE_ORE.get(),
                        ModBlocks.NETHER_GASNITE_ORE.get(),
                        ModBlocks.ZIRCON_BLOCK.get(),
                        ModBlocks.REFINED_DIAMOND_BLOCK.get(),
                        ModBlocks.EARIUM_ORE.get(),
                        ModBlocks.NETHER_EARIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_EARIUM_ORE.get(),
                        ModBlocks.END_STONE_EARIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_GASNITE_ORE.get(),
                        ModBlocks.END_STONE_GASNITE_ORE.get(),
                        ModBlocks.GLITCHITE_BLOCK.get(),
                        ModBlocks.OCARITE_BLOCK.get(),
                        ModBlocks.NETHER_GLITCHITE_ORE.get(),
                        ModBlocks.END_STONE_GLITCHITE_ORE.get(),
                        ModBlocks.DEEPSLATE_GLITCHITE_ORE.get(),
                        ModBlocks.ANCIENT_VOIDSTONE.get(),
                        ModBlocks.THIMEITE_BLOCK.get(),
                        ModBlocks.THIMEITE_ORE.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.NETHERRACK_SAPPHIRE_ORE.get(),
                        ModBlocks.ENDSTONE_SAPPHIRE_ORE.get(),
                        ModBlocks.ZIRCON_ORE.get(),
                        ModBlocks.DEEPSLATE_ZIRCON_ORE.get(),
                        ModBlocks.ENDSTONE_ZIRCON_ORE.get(),
                        ModBlocks.NETHERRACK_ZIRCON_ORE.get(),
                        ModBlocks.ZIRCON_BLOCK.get(),
                        ModBlocks.EARIUM_ORE.get(),
                        ModBlocks.NETHER_EARIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_EARIUM_ORE.get(),
                        ModBlocks.END_STONE_EARIUM_ORE.get(),
                        ModBlocks.GLITCHITE_BLOCK.get(),
                        ModBlocks.OCARITE_BLOCK.get(),
                        ModBlocks.NETHER_GLITCHITE_ORE.get(),
                        ModBlocks.END_STONE_GLITCHITE_ORE.get(),
                        ModBlocks.DEEPSLATE_GLITCHITE_ORE.get(),
                        ModBlocks.ANCIENT_VOIDSTONE.get(),
                        ModBlocks.THIMEITE_BLOCK.get(),
                        ModBlocks.THIMEITE_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.REFINED_DIAMOND_BLOCK.get());

        this.tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL);

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GASNITE_ORE.get(),
                        ModBlocks.NETHER_GASNITE_ORE.get(),
                        ModBlocks.DEEPSLATE_GASNITE_ORE.get(),
                        ModBlocks.END_STONE_GASNITE_ORE.get());


        this.tag(BlockTags.FENCES)
                .add(ModBlocks.SAPPHIRE_FENCE.get(),
                        ModBlocks.ZIRCON_FENCE.get(),
                        ModBlocks.REFINED_DIAMOND_FENCE.get(),
                        ModBlocks.CHEESIUM_FENCE.get(),
                        ModBlocks.EARIUM_FENCE.get(),
                        ModBlocks.GLITCHITE_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get(),
                        ModBlocks.ZIRCON_FENCE_GATE.get(),
                        ModBlocks.NETHER_BRICK_FENCE_GATE.get(),
                        ModBlocks.REFINED_DIAMOND_FENCE_GATE.get(),
                        ModBlocks.CHEESIUM_FENCE_GATE.get(),
                        ModBlocks.EARIUM_FENCE_GATE.get(),
                        ModBlocks.GLITCHITE_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SAPPHIRE_WALL.get(),
                        ModBlocks.ZIRCON_WALL.get(),
                        ModBlocks.REFINED_DIAMOND_WALL.get(),
                        ModBlocks.CHEESIUM_WALL.get(),
                        ModBlocks.EARIUM_WALL.get(),
                        ModBlocks.GLITCHITE_WALL.get());


        this.tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.ZIRCON_BLOCK.get(),
                        ModBlocks.EARIUM_BLOCK.get(),
                        ModBlocks.THIMEITE_BLOCK.get(),
                        ModBlocks.GLITCHITE_ORE.get(),
                        ModBlocks.REFINED_DIAMOND_BLOCK.get());

    }
}
