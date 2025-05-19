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
                        ModBlocks.GASNITE_ORE.get()
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
                        ModBlocks.REFINED_DIAMOND_BLOCK.get());


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
                        ModBlocks.ZIRCON_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.REFINED_DIAMOND_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GASNITE_ORE.get(),
                        ModBlocks.NETHER_GASNITE_ORE.get());


        this.tag(BlockTags.FENCES)
                .add(ModBlocks.SAPPHIRE_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SAPPHIRE_WALL.get());


    }
}
