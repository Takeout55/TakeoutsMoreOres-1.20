package net.takeout.moreores.datagen;

import net.minecraft.world.level.block.*;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MoreOres.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.RAW_SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.ENDSTONE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.NETHERRACK_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.ZIRCON_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ZIRCON_ORE);
        blockWithItem(ModBlocks.NETHERRACK_ZIRCON_ORE);
        blockWithItem(ModBlocks.ENDSTONE_ZIRCON_ORE);
        blockWithItem(ModBlocks.ZIRCON_BLOCK);
        blockWithItem(ModBlocks.GASNITE_ORE);
        blockWithItem(ModBlocks.NETHER_GASNITE_ORE);
        blockWithItem(ModBlocks.REFINED_DIAMOND_BLOCK);
        blockWithItem(ModBlocks.EARIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_EARIUM_ORE);
        blockWithItem(ModBlocks.NETHER_EARIUM_ORE);
        blockWithItem(ModBlocks.END_STONE_EARIUM_ORE);
        blockWithItem(ModBlocks.EARIUM_BLOCK);
        blockWithItem(ModBlocks.GLITCHITE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_GASNITE_ORE);
        blockWithItem(ModBlocks.END_STONE_GASNITE_ORE);
        blockWithItem(ModBlocks.OCARITE_BLOCK);
        blockWithItem(ModBlocks.CHEESIUM_BLOCK);
        blockWithItem(ModBlocks.GLITCHITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_GLITCHITE_ORE);
        blockWithItem(ModBlocks.NETHER_GLITCHITE_ORE);
        blockWithItem(ModBlocks.END_STONE_GLITCHITE_ORE);
        blockWithItem(ModBlocks.THIMEITE_BLOCK);
        blockWithItem(ModBlocks.THIMEITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_THIMEITE_ORE);
        blockWithItem(ModBlocks.END_STONE_THIMEITE_ORE);
        blockWithItem(ModBlocks.NETHER_THIMEITE_ORE);
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.END_STONE_RUBY_ORE);
        blockWithItem(ModBlocks.NETHER_RUBY_ORE);
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.OCARITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_OCARITE_ORE);
        blockWithItem(ModBlocks.END_STONE_OCARITE_ORE);
        blockWithItem(ModBlocks.NETHER_OCARITE_ORE);
        blockWithItem(ModBlocks.CHEESIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_CHEESIUM_ORE);
        blockWithItem(ModBlocks.END_STONE_CHEESIUM_ORE);
        blockWithItem(ModBlocks.NETHER_CHEESIUM_ORE);
        blockWithItem(ModBlocks.PLUNGITE_BLOCK);
        blockWithItem(ModBlocks.PLUNGITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PLUNGITE_ORE);
        blockWithItem(ModBlocks.END_STONE_PLUNGITE_ORE);
        blockWithItem(ModBlocks.NETHER_PLUNGITE_ORE);
        blockWithItem(ModBlocks.CHEEKIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_CHEEKIUM_ORE);
        blockWithItem(ModBlocks.END_STONE_CHEEKIUM_ORE);
        blockWithItem(ModBlocks.NETHER_CHEEKIUM_ORE);
        blockWithItem(ModBlocks.CHEEKIUM_BLOCK);
        blockWithItem(ModBlocks.FLAMING_TAKEITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_FLAMING_TAKEITE_ORE);
        blockWithItem(ModBlocks.END_STONE_FLAMING_TAKEITE_ORE);
        blockWithItem(ModBlocks.NETHER_FLAMING_TAKEITE_ORE);
        blockWithItem(ModBlocks.FLAMING_TAKEITE_BLOCK);
        blockWithItem(ModBlocks.FROZEN_TAKEITE_BLOCK);


        stairsBlock(((StairBlock) ModBlocks.SAPPHIRE_STAIRS.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.SAPPHIRE_SLAB.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.SAPPHIRE_BUTTON.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.SAPPHIRE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.SAPPHIRE_FENCE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.SAPPHIRE_FENCE_GATE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.SAPPHIRE_WALL.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.SAPPHIRE_DOOR.get()), modLoc("block/sapphire_door_bottom"), modLoc("block/sapphire_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.SAPPHIRE_TRAPDOOR.get()), modLoc("block/sapphire_trapdoor"), true, "cutout");


        stairsBlock(((StairBlock) ModBlocks.ZIRCON_STAIRS.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.ZIRCON_SLAB.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.ZIRCON_BUTTON.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.ZIRCON_PRESSURE_PLATE.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.ZIRCON_FENCE.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.ZIRCON_FENCE_GATE.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.ZIRCON_WALL.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.ZIRCON_DOOR.get()), modLoc("block/zircon_door_bottom"), modLoc("block/zircon_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.ZIRCON_TRAPDOOR.get()), modLoc("block/zircon_trapdoor"), true, "cutout");

        stairsBlock(((StairBlock) ModBlocks.REFINED_DIAMOND_STAIRS.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.REFINED_DIAMOND_SLAB.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.REFINED_DIAMOND_BUTTON.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.REFINED_DIAMOND_PRESSURE_PLATE.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.REFINED_DIAMOND_FENCE.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.REFINED_DIAMOND_FENCE_GATE.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.REFINED_DIAMOND_WALL.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.REFINED_DIAMOND_DOOR.get()), modLoc("block/refined_diamond_door_bottom"), modLoc("block/refined_diamond_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.REFINED_DIAMOND_TRAPDOOR.get()), modLoc("block/refined_diamond_trapdoor"), true, "cutout");

        stairsBlock(((StairBlock) ModBlocks.EARIUM_STAIRS.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.EARIUM_SLAB.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.EARIUM_BUTTON.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.EARIUM_PRESSURE_PLATE.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.EARIUM_FENCE.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.EARIUM_FENCE_GATE.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.EARIUM_WALL.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.EARIUM_DOOR.get()), modLoc("block/earium_door_bottom"), modLoc("block/earium_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.EARIUM_TRAPDOOR.get()), modLoc("block/earium_trapdoor"), true, "cutout");

        stairsBlock(((StairBlock) ModBlocks.GLITCHITE_STAIRS.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.GLITCHITE_SLAB.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.GLITCHITE_BUTTON.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.GLITCHITE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.GLITCHITE_FENCE.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.GLITCHITE_FENCE_GATE.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.GLITCHITE_WALL.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        // doorBlockWithRenderType(((DoorBlock) ModBlocks.GLITCHITE_DOOR.get()), modLoc("block/glitchite_door_bottom"), modLoc("block/glitchite_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.GLITCHITE_TRAPDOOR.get()), modLoc("block/glitchite_trapdoor"), true, "cutout");

        stairsBlock(((StairBlock) ModBlocks.CHEESIUM_STAIRS.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.CHEESIUM_SLAB.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.CHEESIUM_BUTTON.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.CHEESIUM_PRESSURE_PLATE.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.CHEESIUM_FENCE.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.CHEESIUM_FENCE_GATE.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.CHEESIUM_WALL.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.CHEESIUM_DOOR.get()), modLoc("block/cheesium_door_bottom"), modLoc("block/cheesium_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.CHEESIUM_TRAPDOOR.get()), modLoc("block/cheesium_trapdoor"), true, "cutout");

        fenceGateBlock(((FenceGateBlock) ModBlocks.NETHER_BRICK_FENCE_GATE.get()), blockTexture(Blocks.NETHER_BRICKS));
        slabBlock(((SlabBlock) ModBlocks.DIRT_SLAB.get()), blockTexture(Blocks.DIRT), blockTexture(Blocks.DIRT));
        stairsBlock(((StairBlock) ModBlocks.DIRT_STAIRS.get()), blockTexture(Blocks.DIRT));

        stairsBlock(((StairBlock) ModBlocks.THIMEITE_STAIRS.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.THIMEITE_SLAB.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.THIMEITE_BUTTON.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.THIMEITE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.THIMEITE_FENCE.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.THIMEITE_FENCE_GATE.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.THIMEITE_WALL.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.THIMEITE_DOOR.get()), modLoc("block/thimeite_door_bottom"), modLoc("block/thimeite_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.THIMEITE_TRAPDOOR.get()), modLoc("block/thimeite_trapdoor"), true, "cutout");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
