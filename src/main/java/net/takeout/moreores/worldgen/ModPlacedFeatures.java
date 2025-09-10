package net.takeout.moreores.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.takeout.moreores.MoreOres;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    //public static final ResourceKey<PlacedFeature> NETHER_SAPPHIRE_ORE_PLACED_KEY = registerKey("nether_sapphire_ore_placed");
    //public static final ResourceKey<PlacedFeature> END_SAPPHIRE_ORE_PLACED_KEY = registerKey("end_sapphire_ore_placed");

    public static final ResourceKey<PlacedFeature> ZIRCON_ORE_PLACED_KEY = registerKey("zircon_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_ZIRCON_ORE_PLACED_KEY = registerKey("nether_zircon_ore_placed");
    //public static final ResourceKey<PlacedFeature> END_ZIRCON_ORE_PLACED_KEY = registerKey("end_zircon_ore_placed");

    public static final ResourceKey<PlacedFeature> NETHER_THIMEITE_ORE_PLACED_KEY = registerKey("nether_thimeite_ore_placed");
    public static final ResourceKey<PlacedFeature> END_THIMEITE_ORE_PLACED_KEY = registerKey("end_thimeite_ore_placed");

    public static final ResourceKey<PlacedFeature> GLITCHITE_ORE_PLACED_KEY = registerKey("glitchite_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_GLITCHITE_ORE_PLACED_KEY = registerKey("nether_glitchite_ore_placed");
    public static final ResourceKey<PlacedFeature> END_GLITCHITE_ORE_PLACED_KEY = registerKey("end_glitchite_ore_placed");

    public static final ResourceKey<PlacedFeature> EARIUM_ORE_PLACED_KEY = registerKey("earium_ore_placed");
    //public static final ResourceKey<PlacedFeature> NETHER_EARIUM_ORE_PLACED_KEY = registerKey("nether_earium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_EARIUM_ORE_PLACED_KEY = registerKey("end_earium_ore_placed");

    public static final ResourceKey<PlacedFeature> END_ENDITE_ORE_PLACED_KEY = registerKey("end_endite_ore_placed");

    public static final ResourceKey<PlacedFeature> GASNITE_ORE_PLACED_KEY = registerKey("gasnite_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_GASNITE_ORE_PLACED_KEY = registerKey("nether_gasnite_ore_placed");
    //public static final ResourceKey<PlacedFeature> END_GASNITE_ORE_PLACED_KEY = registerKey("end_gasnite_ore_placed");

    public static final ResourceKey<PlacedFeature> OCARITE_ORE_PLACED_KEY = registerKey("ocarite_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_OCARITE_ORE_PLACED_KEY = registerKey("nether_ocarite_ore_placed");
    public static final ResourceKey<PlacedFeature> END_OCARITE_ORE_PLACED_KEY = registerKey("end_ocarite_ore_placed");

    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    //public static final ResourceKey<PlacedFeature> NETHER_RUBY_ORE_PLACED_KEY = registerKey("nether_ruby_ore_placed");
    //public static final ResourceKey<PlacedFeature> END_RUBY_ORE_PLACED_KEY = registerKey("end_ruby_ore_placed");

    //public static final ResourceKey<PlacedFeature> CHEESIUM_ORE_PLACED_KEY = registerKey("cheesium_ore_placed");
    //public static final ResourceKey<PlacedFeature> NETHER_CHEESIUM_ORE_PLACED_KEY = registerKey("nether_cheesium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_CHEESIUM_ORE_PLACED_KEY = registerKey("end_cheesium_ore_placed");

    public static final ResourceKey<PlacedFeature> PLUNGITE_ORE_PLACED_KEY = registerKey("plungite_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_PLUNGITE_ORE_PLACED_KEY = registerKey("nether_plungite_ore_placed");
    //public static final ResourceKey<PlacedFeature> END_PLUNGITE_ORE_PLACED_KEY = registerKey("end_plungite_ore_placed");

    public static final ResourceKey<PlacedFeature> CHEEKIUM_ORE_PLACED_KEY = registerKey("cheekium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_CHEEKIUM_ORE_PLACED_KEY = registerKey("nether_cheekium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_CHEEKIUM_ORE_PLACED_KEY = registerKey("end_cheekium_ore_placed");

    public static final ResourceKey<PlacedFeature> NETHER_FLAMING_TAKEITE_ORE_PLACED_KEY = registerKey("nether_flaming_takeite_ore_placed");
    public static final ResourceKey<PlacedFeature> FROZEN_TAKEITE_ORE_PLACED_KEY = registerKey("nether_frozen_takeite_ore_placed");
    public static final ResourceKey<PlacedFeature> END_FROZEN_TAKEITE_ORE_PLACED_KEY = registerKey("end_frozen_takeite_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(50))));

        register(context, ZIRCON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ZIRCON_ORE_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32))));
        register(context, NETHER_ZIRCON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHERRACK_ZIRCON_ORE_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32))));

        register(context, NETHER_THIMEITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHERRACK_THIMEITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-30), VerticalAnchor.absolute(80))));
        register(context, END_THIMEITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENDSTONE_THIMEITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, GLITCHITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_GLITCHITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, NETHER_GLITCHITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_GLITCHITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, END_GLITCHITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENDSTONE_GLITCHITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, EARIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_EARIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(15))));
        register(context, END_EARIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENDSTONE_EARIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, END_ENDITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENDSTONE_ENDITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(30), VerticalAnchor.absolute(50))));

        register(context, GASNITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_GASNITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, NETHER_GASNITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_GASNITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, OCARITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_OCARITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-40), VerticalAnchor.absolute(50))));
        register(context, NETHER_OCARITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_OCARITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-40), VerticalAnchor.absolute(50))));
        register(context, END_OCARITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENDSTONE_OCARITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-40), VerticalAnchor.absolute(50))));

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));

        register(context, END_CHEESIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENDSTONE_CHEESIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, PLUNGITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PLUNGITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(50))));
        register(context, NETHER_PLUNGITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_PLUNGITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(50))));

        register(context, CHEEKIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CHEEKIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-5), VerticalAnchor.absolute(80))));
        register(context, NETHER_CHEEKIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_CHEEKIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-5), VerticalAnchor.absolute(80))));
        register(context, END_CHEEKIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENDSTONE_CHEEKIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-5), VerticalAnchor.absolute(80))));

        register(context, NETHER_FLAMING_TAKEITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_FLAMING_TAKEITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-5), VerticalAnchor.absolute(50))));

        register(context, FROZEN_TAKEITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_FROZEN_TAKEITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(80), VerticalAnchor.absolute(100))));
        register(context, END_FROZEN_TAKEITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENDSTONE_FROZEN_TAKEITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-5), VerticalAnchor.absolute(80))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MoreOres.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
