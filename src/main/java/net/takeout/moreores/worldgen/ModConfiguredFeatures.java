package net.takeout.moreores.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_SAPPHIRE_ORE_KEY = registerKey("netherrack_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENDSTONE_SAPPHIRE_ORE_KEY = registerKey("endstone_sapphire_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ZIRCON_ORE_KEY = registerKey("zircon_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_ZIRCON_ORE_KEY = registerKey("netherrack_zircon_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENDSTONE_ZIRCON_ORE_KEY = registerKey("endstone_zircon_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_THIMEITE_ORE_KEY = registerKey("nether_thimeite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENDSTONE_THIMEITE_ORE_KEY = registerKey("end_stone_thimeite_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GLITCHITE_ORE_KEY = registerKey("glitchite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_GLITCHITE_ORE_KEY = registerKey("nether_glitchite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENDSTONE_GLITCHITE_ORE_KEY = registerKey("end_stone_glitchite_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EARIUM_ORE_KEY = registerKey("earium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_EARIUM_ORE_KEY = registerKey("nether_earium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENDSTONE_EARIUM_ORE_KEY = registerKey("end_stone_earium_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ENDSTONE_ENDITE_ORE_KEY = registerKey("end_stone_endite_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GASNITE_ORE_KEY = registerKey("gasnite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_GASNITE_ORE_KEY = registerKey("nether_gasnite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENDSTONE_GASNITE_ORE_KEY = registerKey("end_stone_gasnite_ore");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, 9));
        register(context, NETHERRACK_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHERRACK_SAPPHIRE_ORE.get().defaultBlockState(),  9));
        register(context, ENDSTONE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.ENDSTONE_SAPPHIRE_ORE.get().defaultBlockState(),  9));


        List<OreConfiguration.TargetBlockState> overworldZirconOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.ZIRCON_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_ZIRCON_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_ZIRCON_ORE_KEY, Feature.ORE, new OreConfiguration(overworldZirconOres, 9));
        register(context, NETHERRACK_ZIRCON_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHERRACK_ZIRCON_ORE.get().defaultBlockState(),  9));
        register(context, ENDSTONE_ZIRCON_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.ENDSTONE_ZIRCON_ORE.get().defaultBlockState(),  9));

        register(context, NETHERRACK_THIMEITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_THIMEITE_ORE.get().defaultBlockState(),  9));
        register(context, ENDSTONE_THIMEITE_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.END_STONE_THIMEITE_ORE.get().defaultBlockState(),  9));

        List<OreConfiguration.TargetBlockState> overworldGlitchiteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.GLITCHITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_GLITCHITE_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_GLITCHITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldGlitchiteOres, 9));
        register(context, NETHER_GLITCHITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_GLITCHITE_ORE.get().defaultBlockState(),  9));
        register(context, ENDSTONE_GLITCHITE_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.END_STONE_GLITCHITE_ORE.get().defaultBlockState(),  9));

        List<OreConfiguration.TargetBlockState> overworldEariumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.EARIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_EARIUM_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_EARIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldEariumOres, 9));
        register(context, NETHER_EARIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_EARIUM_ORE.get().defaultBlockState(),  9));
        register(context, ENDSTONE_EARIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.END_STONE_EARIUM_ORE.get().defaultBlockState(),  9));

        register(context, ENDSTONE_ENDITE_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.ANCIENT_VOIDSTONE.get().defaultBlockState(),  9));

        List<OreConfiguration.TargetBlockState> overworldGasniteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.GASNITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_GASNITE_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_GASNITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldGasniteOres, 9));
        register(context, NETHER_GASNITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_GASNITE_ORE.get().defaultBlockState(),  9));
        register(context, ENDSTONE_GASNITE_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.END_STONE_GASNITE_ORE.get().defaultBlockState(),  9));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MoreOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

