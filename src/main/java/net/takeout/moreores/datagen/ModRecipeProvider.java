package net.takeout.moreores.datagen;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.block.Blocks;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.block.ModBlocks;
import net.takeout.moreores.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE.get(),
            ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModBlocks.NETHERRACK_SAPPHIRE_ORE.get(),
            ModBlocks.ENDSTONE_SAPPHIRE_ORE.get());

    private static final List<ItemLike> ZIRCON_SMELTABLES = List.of(ModItems.RAW_ZIRCON.get(),
            ModBlocks.ZIRCON_ORE.get(), ModBlocks.DEEPSLATE_ZIRCON_ORE.get(), ModBlocks.NETHERRACK_ZIRCON_ORE.get(),
            ModBlocks.ENDSTONE_ZIRCON_ORE.get());

    private static final List<ItemLike> GASNITE_SMELTABLES = List.of(ModBlocks.GASNITE_ORE.get(),
            ModBlocks.END_STONE_GASNITE_ORE.get(), ModBlocks.DEEPSLATE_GASNITE_ORE.get(), ModBlocks.NETHER_GASNITE_ORE.get());

    private static final List<ItemLike> EARIUM_SMELTABLES = List.of(ModItems.RAW_EARIUM.get(),
            ModBlocks.EARIUM_ORE.get(), ModBlocks.DEEPSLATE_EARIUM_ORE.get(), ModBlocks.NETHER_EARIUM_ORE.get(),
            ModBlocks.END_STONE_EARIUM_ORE.get());

    private static final List<ItemLike> CHEESIUM_SMELTABLES = List.of(ModItems.RAW_CHEESIUM.get(), ModBlocks.CHEESIUM_ORE.get(),
            ModBlocks.DEEPSLATE_CHEESIUM_ORE.get(), ModBlocks.END_STONE_CHEESIUM_ORE.get(), ModBlocks.NETHER_CHEESIUM_ORE.get());

    private static final List<ItemLike> GLITCHITE_SMELTABLES = List.of(ModBlocks.GLITCHITE_ORE.get(),
            ModBlocks.DEEPSLATE_GLITCHITE_ORE.get(), ModBlocks.END_STONE_GLITCHITE_ORE.get(), ModBlocks.NETHER_GLITCHITE_ORE.get());

    private static final List<ItemLike> ENDITE_SMELTABLES = List.of(ModItems.RAW_ENDITE.get());

    private static final List<ItemLike> THIMEITE_SMELTABLES = List.of(ModItems.RAW_THIMEITE.get(), ModBlocks.THIMEITE_ORE.get(),
            ModBlocks.DEEPSLATE_THIMEITE_ORE.get(), ModBlocks.END_STONE_THIMEITE_ORE.get(), ModBlocks.NETHER_THIMEITE_ORE.get());

    private static final List<ItemLike> PINKITE_SMELTABLES = List.of(ModItems.RAW_PINKITE.get());

    private static final List<ItemLike> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY.get(),
            ModBlocks.RUBY_ORE.get(), ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModBlocks.NETHER_RUBY_ORE.get(),
            ModBlocks.END_STONE_RUBY_ORE.get());

    private static final List<ItemLike> PLUNGITE_SMELTABLES = List.of(ModItems.RAW_PLUNGITE.get(),
            ModBlocks.PLUNGITE_ORE.get(), ModBlocks.DEEPSLATE_PLUNGITE_ORE.get(), ModBlocks.NETHER_PLUNGITE_ORE.get(),
            ModBlocks.END_STONE_PLUNGITE_ORE.get());

    private static final List<ItemLike> CHEEKIUM_SMELTABLES = List.of(ModItems.RAW_CHEEKIUM.get(),
            ModBlocks.CHEEKIUM_ORE.get(), ModBlocks.DEEPSLATE_CHEEKIUM_ORE.get(), ModBlocks.NETHER_CHEEKIUM_ORE.get(),
            ModBlocks.END_STONE_CHEEKIUM_ORE.get());

    private static final List<ItemLike> FLAMING_TAKEITE_SMELTABLES = List.of(
            ModBlocks.FLAMING_TAKEITE_ORE.get(), ModBlocks.DEEPSLATE_FLAMING_TAKEITE_ORE.get(), ModBlocks.NETHER_FLAMING_TAKEITE_ORE.get(),
            ModBlocks.END_STONE_FLAMING_TAKEITE_ORE.get());

    private static final List<ItemLike> FROZEN_TAKEITE_SMELTABLES = List.of(
            ModBlocks.FLAMING_FROZEN_ORE.get(), ModBlocks.DEEPSLATE_FROZEN_TAKEITE_ORE.get(), ModBlocks.NETHER_FROZEN_TAKEITE_ORE.get(),
            ModBlocks.END_STONE_FLAMING_FROZEN_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 100, "sapphire");
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 200, "sapphire");
        oreBlasting(pWriter, ZIRCON_SMELTABLES, RecipeCategory.MISC, ModItems.ZIRCON.get(), 0.25f, 100, "zircon");
        oreSmelting(pWriter, ZIRCON_SMELTABLES, RecipeCategory.MISC, ModItems.ZIRCON.get(), 0.25f, 200, "zircon");
        oreBlasting(pWriter, EARIUM_SMELTABLES, RecipeCategory.MISC, ModItems.EARIUM.get(), 0.25f, 100, "earium");
        oreSmelting(pWriter, EARIUM_SMELTABLES, RecipeCategory.MISC, ModItems.EARIUM.get(), 0.25f, 200, "earium");
        oreBlasting(pWriter, GASNITE_SMELTABLES, RecipeCategory.MISC, ModItems.GASNITE.get(), 0.25f, 100, "gasnite");
        oreSmelting(pWriter, GASNITE_SMELTABLES, RecipeCategory.MISC, ModItems.GASNITE.get(), 0.25f, 200, "gasnite");
        oreBlasting(pWriter, CHEESIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CHEESIUM.get(), 0.25f, 100, "cheesium");
        oreSmelting(pWriter, CHEESIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CHEESIUM.get(), 0.25f, 200, "cheesium");
        oreBlasting(pWriter, GLITCHITE_SMELTABLES, RecipeCategory.MISC, ModItems.GLITCHITE_INGOT.get(), 0.25f, 100, "glitchite");
        oreSmelting(pWriter, GLITCHITE_SMELTABLES, RecipeCategory.MISC, ModItems.GLITCHITE_INGOT.get(), 0.25f, 200, "glitchite");
        oreBlasting(pWriter, ENDITE_SMELTABLES, RecipeCategory.MISC, ModItems.ENDITE.get(), 0.25f, 100, "endite");
        oreSmelting(pWriter, ENDITE_SMELTABLES, RecipeCategory.MISC, ModItems.ENDITE.get(), 0.25f, 200, "endite");
        oreBlasting(pWriter, THIMEITE_SMELTABLES, RecipeCategory.MISC, ModItems.THIMEITE.get(), 0.25f, 100, "thimeite");
        oreSmelting(pWriter, THIMEITE_SMELTABLES, RecipeCategory.MISC, ModItems.THIMEITE.get(), 0.25f, 200, "thimeite");
        oreBlasting(pWriter, PINKITE_SMELTABLES, RecipeCategory.MISC, ModItems.PINKITE_INGOT.get(), 0.25f, 100, "pinkite");
        oreSmelting(pWriter, PINKITE_SMELTABLES, RecipeCategory.MISC, ModItems.PINKITE_INGOT.get(), 0.25f, 200, "pinkite");
        oreBlasting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 0.25f, 100, "ruby");
        oreSmelting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 0.25f, 200, "ruby");
        oreBlasting(pWriter, PLUNGITE_SMELTABLES, RecipeCategory.MISC, ModItems.PLUNGITE.get(), 0.25f, 100, "plungite");
        oreSmelting(pWriter, PLUNGITE_SMELTABLES, RecipeCategory.MISC, ModItems.PLUNGITE.get(), 0.25f, 200, "plungite");
        oreBlasting(pWriter, CHEEKIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CHEEKIUM.get(), 0.25f, 100, "cheekium");
        oreSmelting(pWriter, CHEEKIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CHEEKIUM.get(), 0.25f, 200, "cheekium");
        oreBlasting(pWriter, FLAMING_TAKEITE_SMELTABLES, RecipeCategory.MISC, ModItems.FLAMING_TAKEITE.get(), 0.25f, 100, "flaming_takeite");
        oreSmelting(pWriter, FLAMING_TAKEITE_SMELTABLES, RecipeCategory.MISC, ModItems.FLAMING_TAKEITE.get(), 0.25f, 200, "flaming_takeite");
        oreBlasting(pWriter, FROZEN_TAKEITE_SMELTABLES, RecipeCategory.MISC, ModItems.FROZEN_TAKEITE.get(), 0.25f, 100, "frozen_takeite");
        oreSmelting(pWriter, FROZEN_TAKEITE_SMELTABLES, RecipeCategory.MISC, ModItems.FROZEN_TAKEITE.get(), 0.25f, 200, "frozen_takeite");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHEESIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.CHEESIUM.get())
                .unlockedBy(getHasName(ModItems.CHEESIUM.get()), has(ModItems.CHEESIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OCARITE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.OCARITE.get())
                .unlockedBy(getHasName(ModItems.OCARITE.get()), has(ModItems.OCARITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHEEKIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.CHEEKIUM.get())
                .unlockedBy(getHasName(ModItems.CHEEKIUM.get()), has(ModItems.CHEEKIUM.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCON_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.ZIRCON.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EARIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.EARIUM.get())
                .unlockedBy(getHasName(ModItems.EARIUM.get()), has(ModItems.EARIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_DIAMOND.get())
                .pattern("SS ")
                .pattern("SS ")
                .pattern("   ")
                .define('S', Items.DIAMOND)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RAW_SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.RAW_SAPPHIRE.get()), has(ModItems.RAW_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REFINED_DIAMOND_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GLITCHITE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.GLITCHITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.GLITCHITE_INGOT.get()), has(ModItems.GLITCHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUNGITE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.PLUNGITE.get())
                .unlockedBy(getHasName(ModItems.PLUNGITE.get()), has(ModItems.PLUNGITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THIMEITE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.THIMEITE.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.METAL_DETECTOR.get())
                .pattern("S  ")
                .pattern(" S ")
                .pattern(" ID")
                .define('D', ModItems.REFINED_DIAMOND.get())
                .define('I', Items.IRON_INGOT)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.METAL_ROD.get())
                .pattern("S")
                .pattern("S")
                .pattern("S")
                .define('S', Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCON_STAIRS.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .define('S', ModItems.ZIRCON.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_STAIRS.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REFINED_DIAMOND_STAIRS.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCON_SLAB.get())
                .pattern("SSS")
                .define('S', ModItems.ZIRCON.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_SLAB.get())
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REFINED_DIAMOND_SLAB.get())
                .pattern("SSS")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REFINED_DIAMOND_DOOR.get(), 3)
                .pattern("SS ")
                .pattern("SS ")
                .pattern("SS ")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCON_DOOR.get(), 3)
                .pattern("SS ")
                .pattern("SS ")
                .pattern("SS ")
                .define('S', ModItems.ZIRCON.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_DOOR.get(), 3)
                .pattern("SS ")
                .pattern("SS ")
                .pattern("SS ")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_TRAPDOOR.get(), 2)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCON_TRAPDOOR.get(), 2)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.ZIRCON.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REFINED_DIAMOND_TRAPDOOR.get(), 2)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REFINED_DIAMOND_PRESSURE_PLATE.get())
                .pattern("SS")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCON_PRESSURE_PLATE.get())
                .pattern("SS")
                .define('S', ModItems.ZIRCON.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_PRESSURE_PLATE.get())
                .pattern("SS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCON_WALL.get())
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.ZIRCON.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_WALL.get())
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REFINED_DIAMOND_WALL.get())
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_DIAMOND.get())
                .pattern("SS ")
                .pattern("SS ")
                .pattern("   ")
                .define('S', ModItems.REFINED_DIAMOND_SHARD.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter, new ResourceLocation(MoreOres.MOD_ID, "refined_diamond_from_shards"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCON_FENCE.get())
                .pattern("SMS")
                .pattern("SMS")
                .define('S', ModBlocks.ZIRCON_BLOCK.get())
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_FENCE.get())
                .pattern("SMS")
                .pattern("SMS")
                .define('S', ModItems.SAPPHIRE.get())
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REFINED_DIAMOND_FENCE.get())
                .pattern("SMS")
                .pattern("SMS")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REFINED_DIAMOND_FENCE_GATE.get())
                .pattern("MSM")
                .pattern("MSM")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_FENCE_GATE.get())
                .pattern("MSM")
                .pattern("MSM")
                .define('S', ModItems.SAPPHIRE.get())
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCON_FENCE_GATE.get())
                .pattern("MSM")
                .pattern("MSM")
                .define('S', ModBlocks.ZIRCON_BLOCK.get())
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_DIAMOND_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_DIAMOND_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_DIAMOND_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_DIAMOND_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .define('S', ModItems.SAPPHIRE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.SAPPHIRE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_HOE.get())
                .pattern("SS")
                .pattern("T ")
                .pattern("T ")
                .define('S', ModItems.SAPPHIRE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_SHOVEL.get())
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .define('S', ModItems.SAPPHIRE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_AXE.get())
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .define('S', ModItems.SAPPHIRE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EARIUM_STAIRS.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .define('S', ModItems.EARIUM.get())
                .unlockedBy(getHasName(ModItems.EARIUM.get()), has(ModItems.EARIUM.get()))
                .save(pWriter);

         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EARIUM_TRAPDOOR.get())
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.EARIUM.get())
                .unlockedBy(getHasName(ModItems.EARIUM.get()), has(ModItems.EARIUM.get()))
                .save(pWriter);

         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EARIUM_WALL.get())
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.EARIUM.get())
                .unlockedBy(getHasName(ModItems.EARIUM.get()), has(ModItems.EARIUM.get()))
                .save(pWriter);

         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EARIUM_DOOR.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .define('S', ModItems.EARIUM.get())
                .unlockedBy(getHasName(ModItems.EARIUM.get()), has(ModItems.EARIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EARIUM_FENCE_GATE.get())
                .pattern("MSM")
                .pattern("MSM")
                .define('S', ModItems.EARIUM.get())
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.EARIUM.get()), has(ModItems.EARIUM.get()))
                .save(pWriter);

         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EARIUM_FENCE.get())
                .pattern("SMS")
                .pattern("SMS")
                .define('S', ModItems.EARIUM.get())
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.EARIUM.get()), has(ModItems.EARIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EARIUM_SLAB.get())
                .pattern("SSS")
                .define('S', ModItems.EARIUM.get())
                .unlockedBy(getHasName(ModItems.EARIUM.get()), has(ModItems.EARIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EARIUM_PRESSURE_PLATE.get())
                .pattern("SS")
                .define('S', ModItems.EARIUM.get())
                .unlockedBy(getHasName(ModItems.EARIUM.get()), has(ModItems.EARIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHEESIUM_STAIRS.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .define('S', ModItems.EARIUM.get())
                .unlockedBy(getHasName(ModItems.CHEESIUM.get()), has(ModBlocks.CHEESIUM_BLOCK.get()))
                .save(pWriter);

         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHEESIUM_TRAPDOOR.get())
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.CHEESIUM.get())
                .unlockedBy(getHasName(ModItems.CHEESIUM.get()), has(ModItems.CHEESIUM.get()))
                .save(pWriter);

         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHEESIUM_WALL.get())
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.CHEESIUM.get())
                .unlockedBy(getHasName(ModItems.CHEESIUM.get()), has(ModItems.CHEESIUM.get()))
                .save(pWriter);

         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHEESIUM_DOOR.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .define('S', ModItems.CHEESIUM.get())
                .unlockedBy(getHasName(ModItems.CHEESIUM.get()), has(ModItems.CHEESIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHEESIUM_FENCE_GATE.get())
                .pattern("MSM")
                .pattern("MSM")
                .define('S', ModItems.CHEESIUM.get())
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.CHEESIUM.get()), has(ModItems.CHEESIUM.get()))
                .save(pWriter);

         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHEESIUM_FENCE.get())
                .pattern("SMS")
                .pattern("SMS")
                .define('S', ModItems.CHEESIUM.get())
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.CHEESIUM.get()), has(ModItems.CHEESIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHEESIUM_SLAB.get())
                .pattern("SSS")
                .define('S', ModItems.CHEESIUM.get())
                .unlockedBy(getHasName(ModItems.CHEESIUM.get()), has(ModItems.CHEESIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIRT_SLAB.get())
                .pattern("SSS")
                .define('S', Blocks.DIRT)
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIRT_STAIRS.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .define('S', Blocks.DIRT)
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHEESIUM_PRESSURE_PLATE.get())
                .pattern("SS")
                .define('S', ModItems.CHEESIUM.get())
                .unlockedBy(getHasName(ModItems.CHEESIUM.get()), has(ModItems.CHEESIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLITCHITE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.GLITCHITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.GLITCHITE_INGOT.get()), has(ModItems.GLITCHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLITCHITE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.GLITCHITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.GLITCHITE_INGOT.get()), has(ModItems.GLITCHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLITCHITE_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.GLITCHITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.GLITCHITE_INGOT.get()), has(ModItems.GLITCHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLITCHITE_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.GLITCHITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.GLITCHITE_INGOT.get()), has(ModItems.GLITCHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLITCHITE_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .define('S', ModItems.GLITCHITE_INGOT.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.GLITCHITE_INGOT.get()), has(ModItems.GLITCHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLITCHITE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.GLITCHITE_INGOT.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.GLITCHITE_INGOT.get()), has(ModItems.GLITCHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLITCHITE_HOE.get())
                .pattern("SS")
                .pattern("T ")
                .pattern("T ")
                .define('S', ModItems.GLITCHITE_INGOT.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.GLITCHITE_INGOT.get()), has(ModItems.GLITCHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLITCHITE_SHOVEL.get())
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .define('S', ModItems.GLITCHITE_INGOT.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.GLITCHITE_INGOT.get()), has(ModItems.GLITCHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLITCHITE_AXE.get())
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .define('S', ModItems.GLITCHITE_INGOT.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.GLITCHITE_INGOT.get()), has(ModItems.GLITCHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THIMEITE_SCYTHE.get())
                .pattern("SA")
                .pattern(" S")
                .pattern(" T")
                .define('S', ModItems.THIMEITE.get())
                .define('T', Items.STICK)
                .define('A', Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THIMEITE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.THIMEITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THIMEITE_HOE.get())
                .pattern("SS")
                .pattern("T ")
                .pattern("T ")
                .define('S', ModItems.THIMEITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THIMEITE_SHOVEL.get())
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .define('S', ModItems.THIMEITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THIMEITE_AXE.get())
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .define('S', ModItems.THIMEITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_STAFF.get())
                .pattern("S")
                .pattern("M")
                .pattern("T")
                .define('S', ModItems.SAPPHIRE.get())
                .define('T', Items.STICK)
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NETHER_BRICK_FENCE_GATE.get())
                .pattern("MSM")
                .pattern("MSM")
                .define('S', Blocks.NETHER_BRICKS)
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(Blocks.NETHER_BRICKS), has(Blocks.NETHER_BRICKS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_DIAMOND_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_DIAMOND_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_DIAMOND_HOE.get())
                .pattern("SS")
                .pattern("T ")
                .pattern("T ")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_DIAMOND_SHOVEL.get())
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REFINED_DIAMOND_AXE.get())
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND.get()), has(ModItems.REFINED_DIAMOND.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THIMEITE_MUSIC_DISC.get())
                .pattern("SGS")
                .pattern("STS")
                .pattern("SSS")
                .define('S', ModItems.THIMEITE.get())
                .define('T', ModItems.VINYL_TEMPLATE.get())
                .define('G', Items.GOLD_INGOT)
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE_MUSIC_DISC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THIMEITE_PRESSURE_PLATE.get())
                .pattern("SS")
                .define('S', ModItems.THIMEITE.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THIMEITE_STAIRS.get())
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .define('S', ModItems.THIMEITE.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModBlocks.THIMEITE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THIMEITE_TRAPDOOR.get())
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.THIMEITE.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THIMEITE_WALL.get())
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.THIMEITE.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModBlocks.THIMEITE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THIMEITE_DOOR.get())
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .define('S', ModItems.THIMEITE.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THIMEITE_FENCE_GATE.get())
                .pattern("MSM")
                .pattern("MSM")
                .define('S', ModItems.THIMEITE.get())
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THIMEITE_FENCE.get())
                .pattern("SMS")
                .pattern("SMS")
                .define('S', ModItems.THIMEITE.get())
                .define('M', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THIMEITE_SLAB.get())
                .pattern("SSS")
                .define('S', ModItems.THIMEITE.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OCARITE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.OCARITE.get())
                .unlockedBy(getHasName(ModItems.OCARITE.get()), has(ModItems.OCARITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OCARITE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.OCARITE.get())
                .unlockedBy(getHasName(ModItems.OCARITE.get()), has(ModItems.OCARITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OCARITE_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.OCARITE.get())
                .unlockedBy(getHasName(ModItems.OCARITE.get()), has(ModItems.OCARITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OCARITE_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.OCARITE.get())
                .unlockedBy(getHasName(ModItems.OCARITE.get()), has(ModItems.OCARITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCON_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.ZIRCON.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCON_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.ZIRCON.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCON_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.ZIRCON.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCON_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.ZIRCON.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.VINYL_TEMPLATE.get())
                .pattern("SSS")
                .pattern("MAM")
                .pattern("DAD")
                .define('S', ModItems.REFINED_DIAMOND.get())
                .define('M', ModItems.METAL_ROD.get())
                .define('D', Items.DIAMOND)
                .define('A', Items.DISC_FRAGMENT_5)
                .unlockedBy(getHasName(Items.DISC_FRAGMENT_5), has(Items.DISC_FRAGMENT_5))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLAMING_TAKEITE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.FLAMING_TAKEITE_GEM.get())
                .unlockedBy(getHasName(ModItems.FLAMING_TAKEITE_GEM.get()), has(ModItems.FLAMING_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLAMING_TAKEITE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.FLAMING_TAKEITE_GEM.get())
                .unlockedBy(getHasName(ModItems.FLAMING_TAKEITE_GEM.get()), has(ModItems.FLAMING_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLAMING_TAKEITE_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.FLAMING_TAKEITE_GEM.get())
                .unlockedBy(getHasName(ModItems.FLAMING_TAKEITE_GEM.get()), has(ModItems.FLAMING_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLAMING_TAKEITE_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.FLAMING_TAKEITE_GEM.get())
                .unlockedBy(getHasName(ModItems.FLAMING_TAKEITE_GEM.get()), has(ModItems.FLAMING_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FROZEN_TAKEITE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.FROZEN_TAKEITE_GEM.get())
                .unlockedBy(getHasName(ModItems.FROZEN_TAKEITE_GEM.get()), has(ModItems.FROZEN_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FROZEN_TAKEITE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.FROZEN_TAKEITE_GEM.get())
                .unlockedBy(getHasName(ModItems.FROZEN_TAKEITE_GEM.get()), has(ModItems.FROZEN_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FROZEN_TAKEITE_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.FROZEN_TAKEITE_GEM.get())
                .unlockedBy(getHasName(ModItems.FROZEN_TAKEITE_GEM.get()), has(ModItems.FROZEN_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FROZEN_TAKEITE_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.FROZEN_TAKEITE_GEM.get())
                .unlockedBy(getHasName(ModItems.FROZEN_TAKEITE_GEM.get()), has(ModItems.FROZEN_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.TORCH)
                .pattern("G")
                .pattern("S")
                .pattern(" ")
                .define('S', Items.STICK)
                .define('G', ModItems.GASNITE.get())
                .unlockedBy(getHasName(ModItems.GASNITE.get()), has(ModItems.GASNITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THIMEITE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.THIMEITE.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THIMEITE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.THIMEITE.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THIMEITE_BOOTS.get())
                .pattern("S S")
                .pattern("A A")
                .define('S', ModItems.THIMEITE.get())
                .define('A', Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THIMEITE_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.THIMEITE.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLUNGITE_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .define('S', ModItems.PLUNGITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.PLUNGITE.get()), has(ModItems.PLUNGITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLUNGITE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.PLUNGITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.PLUNGITE.get()), has(ModItems.PLUNGITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLUNGITE_HOE.get())
                .pattern("SS")
                .pattern("T ")
                .pattern("T ")
                .define('S', ModItems.PLUNGITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.PLUNGITE.get()), has(ModItems.PLUNGITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLUNGITE_SHOVEL.get())
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .define('S', ModItems.PLUNGITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.PLUNGITE.get()), has(ModItems.PLUNGITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLUNGITE_AXE.get())
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .define('S', ModItems.PLUNGITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.PLUNGITE.get()), has(ModItems.PLUNGITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHEEKIUM_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .define('S', ModItems.CHEEKIUM.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.CHEEKIUM.get()), has(ModItems.CHEEKIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHEEKIUM_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.CHEEKIUM.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.CHEEKIUM.get()), has(ModItems.CHEEKIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHEEKIUM_HOE.get())
                .pattern("SS")
                .pattern("T ")
                .pattern("T ")
                .define('S', ModItems.CHEEKIUM.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.CHEEKIUM.get()), has(ModItems.CHEEKIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHEEKIUM_SHOVEL.get())
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .define('S', ModItems.CHEEKIUM.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.CHEEKIUM.get()), has(ModItems.CHEEKIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHEEKIUM_AXE.get())
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .define('S', ModItems.CHEEKIUM.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.CHEEKIUM.get()), has(ModItems.CHEEKIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .define('S', ModItems.RUBY.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.RUBY.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_HOE.get())
                .pattern("SS")
                .pattern("T ")
                .pattern("T ")
                .define('S', ModItems.RUBY.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_SHOVEL.get())
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .define('S', ModItems.RUBY.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_AXE.get())
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .define('S', ModItems.RUBY.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCON_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .define('S', ModItems.ZIRCON.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCON_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.ZIRCON.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCON_HOE.get())
                .pattern("SS")
                .pattern("T ")
                .pattern("T ")
                .define('S', ModItems.ZIRCON.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCON_SHOVEL.get())
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .define('S', ModItems.ZIRCON.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCON_AXE.get())
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .define('S', ModItems.ZIRCON.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OCARITE_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .define('S', ModItems.OCARITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.OCARITE.get()), has(ModItems.OCARITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OCARITE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.OCARITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.OCARITE.get()), has(ModItems.OCARITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OCARITE_HOE.get())
                .pattern("SS")
                .pattern("T ")
                .pattern("T ")
                .define('S', ModItems.OCARITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.OCARITE.get()), has(ModItems.OCARITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OCARITE_SHOVEL.get())
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .define('S', ModItems.OCARITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.OCARITE.get()), has(ModItems.OCARITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OCARITE_AXE.get())
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .define('S', ModItems.OCARITE.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.OCARITE.get()), has(ModItems.OCARITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLAMING_TAKEITE_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .define('S', ModItems.FLAMING_TAKEITE_GEM.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.FLAMING_TAKEITE_GEM.get()), has(ModItems.FLAMING_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLAMING_TAKEITE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.FLAMING_TAKEITE_GEM.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.FLAMING_TAKEITE_GEM.get()), has(ModItems.FLAMING_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLAMING_TAKEITE_HOE.get())
                .pattern("SS")
                .pattern("T ")
                .pattern("T ")
                .define('S', ModItems.FLAMING_TAKEITE_GEM.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.FLAMING_TAKEITE_GEM.get()), has(ModItems.FLAMING_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLAMING_TAKEITE_SHOVEL.get())
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .define('S', ModItems.FLAMING_TAKEITE_GEM.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.FLAMING_TAKEITE_GEM.get()), has(ModItems.FLAMING_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLAMING_TAKEITE_AXE.get())
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .define('S', ModItems.FLAMING_TAKEITE_GEM.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.FLAMING_TAKEITE_GEM.get()), has(ModItems.FLAMING_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLAMING_TAKEITE_GEM.get())
                .pattern("FFF")
                .pattern("FEF")
                .pattern("FFF")
                .define('F', ModItems.FLAMING_TAKEITE.get())
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(ModItems.FLAMING_TAKEITE.get()), has(ModItems.FLAMING_TAKEITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FROZEN_TAKEITE_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .define('S', ModItems.FROZEN_TAKEITE_GEM.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.FROZEN_TAKEITE_GEM.get()), has(ModItems.FROZEN_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FROZEN_TAKEITE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.FROZEN_TAKEITE_GEM.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.FROZEN_TAKEITE_GEM.get()), has(ModItems.FROZEN_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FROZEN_TAKEITE_HOE.get())
                .pattern("SS")
                .pattern("T ")
                .pattern("T ")
                .define('S', ModItems.FROZEN_TAKEITE_GEM.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.FROZEN_TAKEITE_GEM.get()), has(ModItems.FROZEN_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FROZEN_TAKEITE_SHOVEL.get())
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .define('S', ModItems.FROZEN_TAKEITE_GEM.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.FROZEN_TAKEITE_GEM.get()), has(ModItems.FROZEN_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FROZEN_TAKEITE_AXE.get())
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .define('S', ModItems.FROZEN_TAKEITE_GEM.get())
                .define('T', ModItems.METAL_ROD.get())
                .unlockedBy(getHasName(ModItems.FROZEN_TAKEITE_GEM.get()), has(ModItems.FROZEN_TAKEITE_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FROZEN_TAKEITE_GEM.get())
                .pattern("FFF")
                .pattern("FEF")
                .pattern("FFF")
                .define('F', ModItems.FROZEN_TAKEITE.get())
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(ModItems.FROZEN_TAKEITE.get()), has(ModItems.FROZEN_TAKEITE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLUNGITE.get(), 9)
                .requires(ModBlocks.PLUNGITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PLUNGITE_BLOCK.get()), has(ModBlocks.PLUNGITE_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SAPPHIRE.get(), 9)
                .requires(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_SAPPHIRE_BLOCK.get()), has(ModBlocks.RAW_SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZIRCON.get(), 9)
                .requires(ModBlocks.ZIRCON_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ZIRCON_BLOCK.get()), has(ModBlocks.ZIRCON_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OCARITE.get(), 9)
                .requires(ModBlocks.OCARITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.OCARITE_BLOCK.get()), has(ModBlocks.OCARITE_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHEESIUM.get(), 9)
                .requires(ModBlocks.CHEESIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CHEESIUM_BLOCK.get()), has(ModBlocks.CHEESIUM_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GLITCHITE_INGOT.get(), 9)
                .requires(ModBlocks.GLITCHITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.GLITCHITE_BLOCK.get()), has(ModBlocks.GLITCHITE_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REFINED_DIAMOND.get(), 9)
                .requires(ModBlocks.REFINED_DIAMOND_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.REFINED_DIAMOND_BLOCK.get()), has(ModBlocks.REFINED_DIAMOND_BLOCK.get()))
                .save(pWriter, new ResourceLocation(MoreOres.MOD_ID, "refined_diamond_from_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REFINED_DIAMOND_SHARD.get(), 4)
                .requires(ModItems.REFINED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND_SHARD.get()), has(ModItems.REFINED_DIAMOND_SHARD.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BUTTON.get())
                .requires(ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ZIRCON_BUTTON.get())
                .requires(ModItems.ZIRCON.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.REFINED_DIAMOND_BUTTON.get())
                .requires(ModItems.REFINED_DIAMOND_SHARD.get())
                .unlockedBy(getHasName(ModItems.REFINED_DIAMOND_SHARD.get()), has(ModItems.REFINED_DIAMOND_SHARD.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.EARIUM_BUTTON.get())
                .requires(ModItems.EARIUM.get())
                .unlockedBy(getHasName(ModItems.EARIUM.get()), has(ModItems.EARIUM.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CHEESIUM_BUTTON.get())
                .requires(ModItems.CHEESIUM.get())
                .unlockedBy(getHasName(ModItems.CHEESIUM.get()), has(ModItems.CHEESIUM.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.THIMEITE.get(), 9)
                .requires(ModItems.THIMEITE.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.THIMEITE_BUTTON.get())
                .requires(ModItems.THIMEITE.get())
                .unlockedBy(getHasName(ModItems.THIMEITE.get()), has(ModItems.THIMEITE.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  MoreOres.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
