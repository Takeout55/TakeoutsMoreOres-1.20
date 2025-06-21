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
            new ForgeTier(2, 280, 6.3f, 2.0f, 14,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(MoreOres.MOD_ID, "sapphire"), List.of(Tiers.IRON), List.of());

    public static final Tier ZIRCON = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 6.1f, 1.9f, 15,
                    ModTags.Blocks.NEEDS_ZIRCON_TOOL, () -> Ingredient.of(ModItems.ZIRCON.get())),
            new ResourceLocation(MoreOres.MOD_ID, "zircon"), List.of(Tiers.IRON), List.of());

    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(3, 210, 5.9f, 2.3f, 14,
                    ModTags.Blocks.NEEDS_RUBY_TOOL, () -> Ingredient.of(ModItems.RUBY.get())),
            new ResourceLocation(MoreOres.MOD_ID, "ruby"), List.of(Tiers.IRON), List.of());

    public static final Tier GLITCHITE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 872, 7.5f, 2.6f, 11,
                    ModTags.Blocks.NEEDS_GLITCHITE_TOOL, () -> Ingredient.of(ModItems.GLITCHITE_INGOT.get())),
            new ResourceLocation(MoreOres.MOD_ID, "glitchite"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier PLUNGITE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 992, 7.0f, 3.0f, 8,
                    ModTags.Blocks.NEEDS_PLUNGITE_TOOL, () -> Ingredient.of(ModItems.PLUNGITE.get())),
            new ResourceLocation(MoreOres.MOD_ID, "plungite"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier CHEEKIUM = TierSortingRegistry.registerTier(
            new ForgeTier(3, 792, 8.0f, 3.0f, 10,
                    ModTags.Blocks.NEEDS_CHEEKIUM_TOOL, () -> Ingredient.of(ModItems.CHEEKIUM.get())),
            new ResourceLocation(MoreOres.MOD_ID, "cheekium"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier OCARITE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 856, 7.7f, 2.7f, 9,
                    ModTags.Blocks.NEEDS_OCARITE_TOOL, () -> Ingredient.of(ModItems.OCARITE.get())),
            new ResourceLocation(MoreOres.MOD_ID, "ocarite"), List.of(Tiers.DIAMOND), List.of());


    public static final Tier THIMEITE = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1056, 7.9f, 3.8f, 14,
                    ModTags.Blocks.NEEDS_THIMEITE_TOOL, () -> Ingredient.of(ModItems.THIMEITE.get())),
            new ResourceLocation(MoreOres.MOD_ID, "thimeite"), List.of(Tiers.DIAMOND), List.of());


    public static final Tier REFINED_DIAMOND = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1987, 8.5f, 3.9f, 20,
                    ModTags.Blocks.NEEDS_REFINED_DIAMOND_TOOL, () -> Ingredient.of(ModItems.REFINED_DIAMOND.get())),
            new ResourceLocation(MoreOres.MOD_ID, "refined_diamond"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier FIRE_TAKEITE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2929, 9, 4, 25,
                    ModTags.Blocks.NEEDS_FIRE_TAKEITE_TOOL, () -> Ingredient.of(ModItems.FLAMING_TAKEITE_GEM.get())),
            new ResourceLocation(MoreOres.MOD_ID, "fire_takeite"), List.of(Tiers.NETHERITE), List.of());
}
