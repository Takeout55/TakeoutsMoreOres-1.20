package net.takeout.moreores.datagen.loot;

import net.takeout.moreores.block.ModBlocks;
import net.takeout.moreores.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.ZIRCON_BLOCK.get());
        this.dropSelf(ModBlocks.REFINED_DIAMOND_BLOCK.get());
        this.dropSelf(ModBlocks.SAPPHIRE_FENCE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_WALL.get());
        this.dropSelf(ModBlocks.SAPPHIRE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.SAPPHIRE_WALL.get());
        this.dropSelf(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_BUTTON.get());
        this.dropSelf(ModBlocks.SAPPHIRE_STAIRS.get());
        this.dropSelf(ModBlocks.ZIRCON_FENCE.get());
        this.dropSelf(ModBlocks.ZIRCON_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ZIRCON_WALL.get());
        this.dropSelf(ModBlocks.ZIRCON_TRAPDOOR.get());
        this.dropSelf(ModBlocks.ZIRCON_WALL.get());
        this.dropSelf(ModBlocks.ZIRCON_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ZIRCON_BUTTON.get());
        this.dropSelf(ModBlocks.ZIRCON_STAIRS.get());
        this.dropSelf(ModBlocks.NETHER_BRICK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.REFINED_DIAMOND_FENCE.get());
        this.dropSelf(ModBlocks.REFINED_DIAMOND_FENCE_GATE.get());
        this.dropSelf(ModBlocks.REFINED_DIAMOND_WALL.get());
        this.dropSelf(ModBlocks.REFINED_DIAMOND_TRAPDOOR.get());
        this.dropSelf(ModBlocks.REFINED_DIAMOND_WALL.get());
        this.dropSelf(ModBlocks.REFINED_DIAMOND_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.REFINED_DIAMOND_BUTTON.get());
        this.dropSelf(ModBlocks.REFINED_DIAMOND_STAIRS.get());
        this.dropSelf(ModBlocks.EARIUM_BLOCK.get());
        this.dropSelf(ModBlocks.GLITCHITE_BLOCK.get());
        this.dropSelf(ModBlocks.GLITCHITE_FENCE.get());
        this.dropSelf(ModBlocks.GLITCHITE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GLITCHITE_WALL.get());
        this.dropSelf(ModBlocks.GLITCHITE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.GLITCHITE_WALL.get());
        this.dropSelf(ModBlocks.GLITCHITE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GLITCHITE_BUTTON.get());
        this.dropSelf(ModBlocks.GLITCHITE_STAIRS.get());
        this.dropSelf(ModBlocks.EARIUM_FENCE.get());
        this.dropSelf(ModBlocks.EARIUM_FENCE_GATE.get());
        this.dropSelf(ModBlocks.EARIUM_WALL.get());
        this.dropSelf(ModBlocks.EARIUM_TRAPDOOR.get());
        this.dropSelf(ModBlocks.EARIUM_WALL.get());
        this.dropSelf(ModBlocks.EARIUM_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.EARIUM_BUTTON.get());
        this.dropSelf(ModBlocks.EARIUM_STAIRS.get());
        this.dropSelf(ModBlocks.CHEESIUM_BLOCK.get());
        this.dropSelf(ModBlocks.CHEESIUM_FENCE.get());
        this.dropSelf(ModBlocks.CHEESIUM_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CHEESIUM_WALL.get());
        this.dropSelf(ModBlocks.CHEESIUM_TRAPDOOR.get());
        this.dropSelf(ModBlocks.CHEESIUM_WALL.get());
        this.dropSelf(ModBlocks.CHEESIUM_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CHEESIUM_BUTTON.get());
        this.dropSelf(ModBlocks.CHEESIUM_STAIRS.get());
        this.dropSelf(ModBlocks.OCARITE_BLOCK.get());
        this.dropSelf(ModBlocks.THIMEITE_BLOCK.get());
        this.dropSelf(ModBlocks.DIRT_STAIRS.get());
        this.dropSelf(ModBlocks.THIMEITE_FENCE.get());
        this.dropSelf(ModBlocks.THIMEITE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.THIMEITE_WALL.get());
        // this.dropSelf(ModBlocks.THIMEITE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.THIMEITE_WALL.get());
        this.dropSelf(ModBlocks.THIMEITE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.THIMEITE_BUTTON.get());
        this.dropSelf(ModBlocks.THIMEITE_STAIRS.get());
        this.dropSelf(ModBlocks.RUBY_BLOCK.get());

        this.add(ModBlocks.SAPPHIRE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SAPPHIRE_SLAB.get()));
        this.add(ModBlocks.SAPPHIRE_DOOR.get(),
                block -> createDoorTable(ModBlocks.SAPPHIRE_DOOR.get()));

        this.add(ModBlocks.ZIRCON_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ZIRCON_SLAB.get()));
        this.add(ModBlocks.ZIRCON_DOOR.get(),
                block -> createDoorTable(ModBlocks.ZIRCON_DOOR.get()));

        this.add(ModBlocks.REFINED_DIAMOND_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.REFINED_DIAMOND_SLAB.get()));
        this.add(ModBlocks.REFINED_DIAMOND_DOOR.get(),
                block -> createDoorTable(ModBlocks.REFINED_DIAMOND_DOOR.get()));

        this.add(ModBlocks.EARIUM_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.EARIUM_SLAB.get()));
        this.add(ModBlocks.EARIUM_DOOR.get(),
                block -> createDoorTable(ModBlocks.EARIUM_DOOR.get()));

        this.add(ModBlocks.CHEESIUM_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHEESIUM_SLAB.get()));
        this.add(ModBlocks.CHEESIUM_DOOR.get(),
                block -> createDoorTable(ModBlocks.CHEESIUM_DOOR.get()));

        this.add(ModBlocks.GLITCHITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GLITCHITE_SLAB.get()));
        this.add(ModBlocks.GLITCHITE_DOOR.get(),
                block -> createDoorTable(ModBlocks.GLITCHITE_DOOR.get()));

        this.add(ModBlocks.DIRT_SLAB.get(),
                 block -> createSlabItemTable(ModBlocks.DIRT_SLAB.get()));

        this.add(ModBlocks.THIMEITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.THIMEITE_SLAB.get()));
        //this.add(ModBlocks.THIMEITE_DOOR.get(),
        //        block -> createDoorTable(ModBlocks.THIMEITE_DOOR.get()));


        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.NETHERRACK_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHERRACK_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.ENDSTONE_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.ENDSTONE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.ZIRCON_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.ZIRCON_ORE.get(), ModItems.RAW_ZIRCON.get()));
        this.add(ModBlocks.DEEPSLATE_ZIRCON_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_ZIRCON_ORE.get(), ModItems.RAW_ZIRCON.get()));
        this.add(ModBlocks.NETHERRACK_ZIRCON_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHERRACK_ZIRCON_ORE.get(), ModItems.RAW_ZIRCON.get()));
        this.add(ModBlocks.ENDSTONE_ZIRCON_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.ENDSTONE_ZIRCON_ORE.get(), ModItems.RAW_ZIRCON.get()));
        this.add(ModBlocks.GASNITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.GASNITE_ORE.get(), ModItems.GASNITE.get()));
        this.add(ModBlocks.NETHER_GASNITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_GASNITE_ORE.get(), ModItems.GASNITE.get()));
        this.add(ModBlocks.EARIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.EARIUM_ORE.get(), ModItems.RAW_EARIUM.get()));
        this.add(ModBlocks.NETHER_EARIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_EARIUM_ORE.get(), ModItems.RAW_EARIUM.get()));
        this.add(ModBlocks.END_STONE_EARIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_EARIUM_ORE.get(), ModItems.RAW_EARIUM.get()));
        this.add(ModBlocks.DEEPSLATE_EARIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_EARIUM_ORE.get(), ModItems.RAW_EARIUM.get()));
        this.add(ModBlocks.END_STONE_GASNITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_EARIUM_ORE.get(), ModItems.GASNITE.get()));
        this.add(ModBlocks.DEEPSLATE_GASNITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_GASNITE_ORE.get(), ModItems.GASNITE.get()));
         this.add(ModBlocks.GLITCHITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.GLITCHITE_ORE.get(), ModItems.GLITCHITE_INGOT.get()));
        this.add(ModBlocks.ANCIENT_VOIDSTONE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.ANCIENT_VOIDSTONE.get(), ModItems.RAW_ENDITE.get()));
        this.add(ModBlocks.DEEPSLATE_GLITCHITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_GLITCHITE_ORE.get(), ModItems.GLITCHITE_INGOT.get()));
        this.add(ModBlocks.END_STONE_GLITCHITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_GLITCHITE_ORE.get(), ModItems.GLITCHITE_INGOT.get()));
        this.add(ModBlocks.NETHER_GLITCHITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_GLITCHITE_ORE.get(), ModItems.GLITCHITE_INGOT.get()));
        this.add(ModBlocks.THIMEITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.THIMEITE_ORE.get(), ModItems.THIMEITE.get()));
        this.add(ModBlocks.DEEPSLATE_THIMEITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_THIMEITE_ORE.get(), ModItems.THIMEITE.get()));
        this.add(ModBlocks.NETHER_THIMEITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_THIMEITE_ORE.get(), ModItems.THIMEITE.get()));
        this.add(ModBlocks.END_STONE_THIMEITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_THIMEITE_ORE.get(), ModItems.THIMEITE.get()));
        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.RUBY_ORE.get(), ModItems.RAW_RUBY.get()));
        this.add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RAW_RUBY.get()));
        this.add(ModBlocks.NETHER_RUBY_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_RUBY_ORE.get(), ModItems.RAW_RUBY.get()));
        this.add(ModBlocks.END_STONE_RUBY_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_RUBY_ORE.get(), ModItems.RAW_RUBY.get()));

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
