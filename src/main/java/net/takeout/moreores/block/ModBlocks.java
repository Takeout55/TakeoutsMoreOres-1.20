package net.takeout.moreores.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoreOres.MOD_ID);

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHEESIUM_BLOCK = registerBlock("cheesium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ZIRCON_BLOCK = registerBlock("zircon_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ZIRCON_ORE = registerBlock("zircon_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_ZIRCON_ORE = registerBlock("deepslate_zircon_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHERRACK_ZIRCON_ORE = registerBlock("netherrack_zircon_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ENDSTONE_ZIRCON_ORE = registerBlock("endstone_zircon_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> REFINED_DIAMOND_BLOCK = registerBlock("refined_diamond_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_SAPPHIRE_BLOCK = registerBlock("raw_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ENDSTONE_SAPPHIRE_ORE = registerBlock("endstone_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHERRACK_SAPPHIRE_ORE = registerBlock("netherrack_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GASNITE_ORE = registerBlock("gasnite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_GASNITE_ORE = registerBlock("nether_gasnite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SAPPHIRE_STAIRS = registerBlock("sapphire_stairs",
            () -> new StairBlock(() -> ModBlocks.SAPPHIRE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SAPPHIRE_SLAB = registerBlock("sapphire_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SAPPHIRE_BUTTON = registerBlock("sapphire_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.AMETHYST).instabreak(),
                    BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> SAPPHIRE_PRESSURE_PLATE = registerBlock("sapphire_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).instabreak(),
                    BlockSetType.IRON));

    public static final RegistryObject<Block> SAPPHIRE_FENCE = registerBlock("sapphire_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> SAPPHIRE_FENCE_GATE = registerBlock("sapphire_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));

    public static final RegistryObject<Block> SAPPHIRE_WALL = registerBlock("sapphire_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> SAPPHIRE_DOOR = registerBlock("sapphire_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> SAPPHIRE_TRAPDOOR = registerBlock("sapphire_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> ZIRCON_STAIRS = registerBlock("zircon_stairs",
            () -> new StairBlock(() -> ModBlocks.ZIRCON_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ZIRCON_SLAB = registerBlock("zircon_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ZIRCON_BUTTON = registerBlock("zircon_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).instabreak(),
                    BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> ZIRCON_PRESSURE_PLATE = registerBlock("zircon_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak(),
                    BlockSetType.IRON));

    public static final RegistryObject<Block> ZIRCON_FENCE = registerBlock("zircon_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ZIRCON_FENCE_GATE = registerBlock("zircon_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));

    public static final RegistryObject<Block> ZIRCON_WALL = registerBlock("zircon_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ZIRCON_DOOR = registerBlock("zircon_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> ZIRCON_TRAPDOOR = registerBlock("zircon_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS), SoundEvents.NETHER_BRICKS_PLACE, SoundEvents.NETHER_BRICKS_BREAK));

    public static final RegistryObject<Block> REFINED_DIAMOND_STAIRS = registerBlock("refined_diamond_stairs",
            () -> new StairBlock(() -> ModBlocks.REFINED_DIAMOND_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> REFINED_DIAMOND_SLAB = registerBlock("refined_diamond_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> REFINED_DIAMOND_BUTTON = registerBlock("refined_diamond_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).instabreak(),
                    BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> REFINED_DIAMOND_PRESSURE_PLATE = registerBlock("refined_diamond_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).instabreak(),
                    BlockSetType.IRON));

    public static final RegistryObject<Block> REFINED_DIAMOND_FENCE = registerBlock("refined_diamond_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> REFINED_DIAMOND_FENCE_GATE = registerBlock("refined_diamond_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));

    public static final RegistryObject<Block> REFINED_DIAMOND_WALL = registerBlock("refined_diamond_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> REFINED_DIAMOND_DOOR = registerBlock("refined_diamond_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> REFINED_DIAMOND_TRAPDOOR = registerBlock("refined_diamond_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> EARIUM_ORE = registerBlock("earium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> GLITCHITE_ORE = registerBlock("glitchite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> DEEPSLATE_EARIUM_ORE = registerBlock("deepslate_earium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> END_STONE_EARIUM_ORE = registerBlock("end_stone_earium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> NETHER_EARIUM_ORE = registerBlock("nether_earium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)));

    public static final RegistryObject<Block> EARIUM_BLOCK = registerBlock("earium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER)));

     public static final RegistryObject<Block> DEEPSLATE_GASNITE_ORE = registerBlock("deepslate_gasnite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));

     public static final RegistryObject<Block> END_STONE_GASNITE_ORE = registerBlock("end_stone_gasnite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));

     public static final RegistryObject<Block> GLITCHITE_BLOCK = registerBlock("glitchite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

     public static final RegistryObject<Block> EARIUM_STAIRS = registerBlock("earium_stairs",
            () -> new StairBlock(() -> ModBlocks.EARIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> EARIUM_SLAB = registerBlock("earium_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> EARIUM_BUTTON = registerBlock("earium_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).instabreak(),
                    BlockSetType.OAK, 10, true));

    public static final RegistryObject<Block> EARIUM_PRESSURE_PLATE = registerBlock("earium_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak(),
                    BlockSetType.IRON));

    public static final RegistryObject<Block> EARIUM_FENCE = registerBlock("earium_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> EARIUM_FENCE_GATE = registerBlock("earium_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));

    public static final RegistryObject<Block> EARIUM_WALL = registerBlock("earium_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> EARIUM_DOOR = registerBlock("earium_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion(), BlockSetType.OAK));

    public static final RegistryObject<Block> EARIUM_TRAPDOOR = registerBlock("earium_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion(), BlockSetType.OAK));
    
    public static final RegistryObject<Block> GLITCHITE_STAIRS = registerBlock("glitchite_stairs",
            () -> new StairBlock(() -> ModBlocks.GLITCHITE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> GLITCHITE_SLAB = registerBlock("glitchite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> GLITCHITE_BUTTON = registerBlock("glitchite_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).instabreak(),
                    BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> GLITCHITE_PRESSURE_PLATE = registerBlock("glitchite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak(),
                    BlockSetType.IRON));

    public static final RegistryObject<Block> GLITCHITE_FENCE = registerBlock("glitchite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> GLITCHITE_FENCE_GATE = registerBlock("glitchite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));

    public static final RegistryObject<Block> GLITCHITE_WALL = registerBlock("glitchite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> GLITCHITE_DOOR = registerBlock("glitchite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> GLITCHITE_TRAPDOOR = registerBlock("glitchite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion(), BlockSetType.SPRUCE));

    public static final RegistryObject<Block> CHEESIUM_STAIRS = registerBlock("cheesium_stairs",
            () -> new StairBlock(() -> ModBlocks.CHEESIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> CHEESIUM_SLAB = registerBlock("cheesium_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> CHEESIUM_BUTTON = registerBlock("cheesium_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).instabreak(),
                    BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> CHEESIUM_PRESSURE_PLATE = registerBlock("cheesium_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DIRT).instabreak(),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> CHEESIUM_FENCE = registerBlock("cheesium_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> CHEESIUM_FENCE_GATE = registerBlock("cheesium_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DIRT), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));

    public static final RegistryObject<Block> CHEESIUM_WALL = registerBlock("cheesium_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> CHEESIUM_DOOR = registerBlock("cheesium_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).noOcclusion(), BlockSetType.OAK));

    public static final RegistryObject<Block> CHEESIUM_TRAPDOOR = registerBlock("cheesium_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion(), BlockSetType.OAK));

    public static final RegistryObject<Block> OCARITE_BLOCK = registerBlock("ocarite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ANCIENT_VOIDSTONE = registerBlock("ancient_voidstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_GLITCHITE_ORE = registerBlock("deepslate_glitchite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_STONE_GLITCHITE_ORE = registerBlock("end_stone_glitchite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_GLITCHITE_ORE = registerBlock("nether_glitchite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> THIMEITE_BLOCK = registerBlock("thimeite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_PORTAL_FRAME).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> THIMEITE_ORE = registerBlock("thimeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_THIMEITE_ORE = registerBlock("deepslate_thimeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_THIMEITE_ORE = registerBlock("nether_thimeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_STONE_THIMEITE_ORE = registerBlock("end_stone_thimeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DIRT_SLAB = registerBlock("dirt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> DIRT_STAIRS = registerBlock("dirt_stairs",
            () -> new StairBlock(() -> Blocks.DIRT.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> THIMEITE_STAIRS = registerBlock("thimeite_stairs",
            () -> new StairBlock(() -> ModBlocks.CHEESIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> THIMEITE_SLAB = registerBlock("thimeite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> THIMEITE_BUTTON = registerBlock("thimeite_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).instabreak(),
                    BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> THIMEITE_PRESSURE_PLATE = registerBlock("thimeite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak(),
                    BlockSetType.IRON));

    public static final RegistryObject<Block> THIMEITE_FENCE = registerBlock("thimeite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> THIMEITE_FENCE_GATE = registerBlock("thimeite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));

    public static final RegistryObject<Block> THIMEITE_WALL = registerBlock("thimeite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    // public static final RegistryObject<Block> THIMEITE_DOOR = registerBlock("cheesium_door",
    //        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion(), BlockSetType.OAK));

    // public static final RegistryObject<Block> THIMEITE_TRAPDOOR = registerBlock("cheesium_trapdoor",
    //        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion(), BlockSetType.OAK));

    
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }



    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
       return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
       BLOCKS.register(eventBus);
    }

}
