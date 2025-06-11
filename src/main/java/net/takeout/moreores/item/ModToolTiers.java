package net.takeout.moreores.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 300, 6.5f, 4f, 15,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(MoreOres.MOD_ID, "sapphire"), List.of(Tiers.IRON), List.of());

    public static final Tier REFINED_DIAMOND = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1987, 8.5f, 4.2f, 20,
                    ModTags.Blocks.NEEDS_REFINED_DIAMOND_TOOL, () -> Ingredient.of(ModItems.REFINED_DIAMOND.get())),
            new ResourceLocation(MoreOres.MOD_ID, "refined_diamond"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier GLITCHITE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1332, 7.5f, 4.2f, 13,
                    ModTags.Blocks.NEEDS_GLITCHITE_TOOL, () -> Ingredient.of(ModItems.GLITCHITE_INGOT.get())),
            new ResourceLocation(MoreOres.MOD_ID, "glitchite"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier THIMEITE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1380, 7.8f, 4.4f, 16,
                    ModTags.Blocks.NEEDS_THIMEITE_TOOL, () -> Ingredient.of(ModItems.THIMEITE.get())),
            new ResourceLocation(MoreOres.MOD_ID, "thimeite"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier PLUNGITE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1380, 7.8f, 4.4f, 16,
                    ModTags.Blocks.NEEDS_PLUNGITE_TOOL, () -> Ingredient.of(ModItems.PLUNGITE.get())),
            new ResourceLocation(MoreOres.MOD_ID, "plungite"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier CHEEKIUM = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1380, 7.8f, 4.4f, 16,
                    ModTags.Blocks.NEEDS_CHEEKIUM_TOOL, () -> Ingredient.of(ModItems.CHEEKIUM.get())),
            new ResourceLocation(MoreOres.MOD_ID, "cheekium"), List.of(Tiers.DIAMOND), List.of());
}
