package net.takeout.moreores.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.takeout.moreores.MoreOres;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_SAPPHIRE_ORE = registerKey("add_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SAPPHIRE_ORE = registerKey("add_nether_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_SAPPHIRE_ORE = registerKey("add_end_sapphire_ore");

    public static final ResourceKey<BiomeModifier> ADD_ZIRCON_ORE = registerKey("add_zircon_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ZIRCON_ORE = registerKey("add_nether_zircon_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_ZIRCON_ORE = registerKey("add_end_zircon_ore");

    public static final ResourceKey<BiomeModifier> ADD_NETHER_THIMEITE_ORE = registerKey("add_nether_thimeite_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_THIMEITE_ORE = registerKey("add_end_thimeite_ore");

    public static final ResourceKey<BiomeModifier> ADD_GLITCHITE_ORE = registerKey("add_glitchite_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_GLITCHITE_ORE = registerKey("add_nether_glitchite_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_GLITCHITE_ORE = registerKey("add_end_glitchite_ore");

    public static final ResourceKey<BiomeModifier> ADD_END_ENDITE_ORE = registerKey("add_end_endite_ore");

    public static final ResourceKey<BiomeModifier> ADD_GASNITE_ORE = registerKey("add_gasnite_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_GASNITE_ORE = registerKey("add_nether_gasnite_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_GASNITE_ORE = registerKey("add_end_gasnite_ore");

    public static final ResourceKey<BiomeModifier> ADD_EARIUM_ORE = registerKey("add_earium_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_EARIUM_ORE = registerKey("add_nether_earium_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_EARIUM_ORE = registerKey("add_end_earium_ore");

    public static final ResourceKey<BiomeModifier> ADD_OCARITE_ORE = registerKey("add_ocarite_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_OCARITE_ORE = registerKey("add_nether_ocarite_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_OCARITE_ORE = registerKey("add_end_ocarite_ore");

    public static final ResourceKey<BiomeModifier> ADD_RUBY_ORE = registerKey("add_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_RUBY_ORE = registerKey("add_nether_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_RUBY_ORE = registerKey("add_end_ruby_ore");

    public static final ResourceKey<BiomeModifier> ADD_CHEESIUM_ORE = registerKey("add_cheesium_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_CHEESIUM_ORE = registerKey("add_nether_cheesium_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_CHEESIUM_ORE = registerKey("add_end_cheesium_ore");

    public static final ResourceKey<BiomeModifier> ADD_PLUNGITE_ORE = registerKey("add_plungite_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_PLUNGITE_ORE = registerKey("add_nether_plungite_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_PLUNGITE_ORE = registerKey("add_end_plungite_ore");

    public static final ResourceKey<BiomeModifier> ADD_CHEEKIUM_ORE = registerKey("add_cheekium_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_CHEEKIUM_ORE = registerKey("add_nether_cheekium_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_CHEEKIUM_ORE = registerKey("add_end_cheekium_ore");

    public static final ResourceKey<BiomeModifier> ADD_NETHER_FLAMING_TAKEITE_ORE = registerKey("add_nether_flaming_takeite_ore");
    public static final ResourceKey<BiomeModifier> ADD_FROZEN_TAKEITE_ORE = registerKey("add_frozen_takeite_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_FROZEN_TAKEITE_ORE = registerKey("add_end_frozen_takeite_ore");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_SAPPHIRE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //context.register(ADD_NETHER_SAPPHIRE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        //        biomes.getOrThrow(BiomeTags.IS_NETHER),
        //        HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_SAPPHIRE_ORE_PLACED_KEY)),
        //        GenerationStep.Decoration.UNDERGROUND_ORES));

        //context.register(ADD_END_SAPPHIRE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        //        biomes.getOrThrow(BiomeTags.IS_END),
        //        HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_SAPPHIRE_ORE_PLACED_KEY)),
        //        GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ZIRCON_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ZIRCON_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_ZIRCON_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_ZIRCON_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //context.register(ADD_END_ZIRCON_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        //        biomes.getOrThrow(BiomeTags.IS_END),
        //        HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_ZIRCON_ORE_PLACED_KEY)),
        //        GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_THIMEITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_THIMEITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_THIMEITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_THIMEITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GLITCHITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GLITCHITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_GLITCHITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_GLITCHITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_GLITCHITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_GLITCHITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_ENDITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_ENDITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GASNITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GASNITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_GASNITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_GASNITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //context.register(ADD_END_GASNITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        //        biomes.getOrThrow(BiomeTags.IS_END),
        //        HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_GASNITE_ORE_PLACED_KEY)),
        //        GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_EARIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.EARIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //context.register(ADD_NETHER_EARIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        //        biomes.getOrThrow(BiomeTags.IS_NETHER),
        //        HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_EARIUM_ORE_PLACED_KEY)),
        //        GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_EARIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_EARIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OCARITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OCARITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_OCARITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_OCARITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_OCARITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_OCARITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //context.register(ADD_RUBY_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        //        biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
        //        HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RUBY_ORE_PLACED_KEY)),
        //        GenerationStep.Decoration.UNDERGROUND_ORES));

        //context.register(ADD_NETHER_RUBY_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        //        biomes.getOrThrow(BiomeTags.IS_NETHER),
        //        HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_RUBY_ORE_PLACED_KEY)),
        //        GenerationStep.Decoration.UNDERGROUND_ORES));

        //context.register(ADD_END_RUBY_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        //        biomes.getOrThrow(BiomeTags.IS_END),
        //        HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_RUBY_ORE_PLACED_KEY)),
        //        GenerationStep.Decoration.UNDERGROUND_ORES));

        //context.register(ADD_CHEESIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        //        biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
        //        HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CHEESIUM_ORE_PLACED_KEY)),
        //        GenerationStep.Decoration.UNDERGROUND_ORES));

        //context.register(ADD_NETHER_CHEESIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        //        biomes.getOrThrow(BiomeTags.IS_NETHER),
        //        HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_CHEESIUM_ORE_PLACED_KEY)),
        //        GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_CHEESIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_CHEESIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_PLUNGITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PLUNGITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_PLUNGITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_PLUNGITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //context.register(ADD_END_PLUNGITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
        //        biomes.getOrThrow(BiomeTags.IS_END),
        //        HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_PLUNGITE_ORE_PLACED_KEY)),
        //        GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHEEKIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CHEEKIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_CHEEKIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_CHEEKIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_CHEEKIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_CHEEKIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_FROZEN_TAKEITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.FROZEN_TAKEITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_FLAMING_TAKEITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_FLAMING_TAKEITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_FROZEN_TAKEITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_FROZEN_TAKEITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(MoreOres.MOD_ID, name));
    }
}
