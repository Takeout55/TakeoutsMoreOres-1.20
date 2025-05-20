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

        fenceGateBlock(((FenceGateBlock) ModBlocks.NETHER_BRICK_FENCE_GATE.get()), blockTexture(Blocks.NETHER_BRICKS));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
