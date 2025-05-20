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
                block -> createCopperLikeOreDrops(ModBlocks.GASNITE_ORE.get(), ModItems.RAW_ZIRCON.get()));
        this.add(ModBlocks.NETHER_GASNITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_GASNITE_ORE.get(), ModItems.RAW_ZIRCON.get()));
        this.add(ModBlocks.EARIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.EARIUM_ORE.get(), ModItems.RAW_EARIUM.get()));
        this.add(ModBlocks.NETHER_EARIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_EARIUM_ORE.get(), ModItems.RAW_EARIUM.get()));
        this.add(ModBlocks.END_STONE_EARIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_EARIUM_ORE.get(), ModItems.RAW_EARIUM.get()));
        this.add(ModBlocks.DEEPSLATE_EARIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_EARIUM_ORE.get(), ModItems.RAW_EARIUM.get()));

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
