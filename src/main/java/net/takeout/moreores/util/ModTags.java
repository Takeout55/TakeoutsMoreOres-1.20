package net.takeout.moreores.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.takeout.moreores.MoreOres;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");
        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = tag("needs_sapphire_tool");
        public static final TagKey<Block> NEEDS_GLITCHITE_TOOL = tag("needs_glitchite_tool");
        public static final TagKey<Block> NEEDS_REFINED_DIAMOND_TOOL = tag("needs_refined_diamond_tool");
        public static final TagKey<Block> NEEDS_THIMEITE_TOOL = tag("needs_thimeite_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MoreOres.MOD_ID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MoreOres.MOD_ID, name));
        }
    }
}
