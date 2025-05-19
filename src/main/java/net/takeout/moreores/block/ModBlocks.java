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
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GASNITE_ORE = registerBlock("gasnite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_GASNITE_ORE = registerBlock("nether_gasnite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).requiresCorrectToolForDrops()));

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
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SAPPHIRE_FENCE_GATE = registerBlock("sapphire_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));

    public static final RegistryObject<Block> SAPPHIRE_WALL = registerBlock("sapphire_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SAPPHIRE_DOOR = registerBlock("sapphire_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> SAPPHIRE_TRAPDOOR = registerBlock("sapphire_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> ZIRCON_STAIRS = registerBlock("zircon_stairs",
            () -> new StairBlock(() -> ModBlocks.SAPPHIRE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ZIRCON_SLAB = registerBlock("zircon_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ZIRCON_BUTTON = registerBlock("zircon_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).instabreak(),
                    BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> ZIRCON_PRESSURE_PLATE = registerBlock("zircon_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak(),
                    BlockSetType.IRON));

    public static final RegistryObject<Block> ZIRCON_FENCE = registerBlock("zircon_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ZIRCON_FENCE_GATE = registerBlock("zircon_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));

    public static final RegistryObject<Block> ZIRCON_WALL = registerBlock("zircon_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ZIRCON_DOOR = registerBlock("zircon_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> ZIRCON_TRAPDOOR = registerBlock("zircon_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion(), BlockSetType.IRON));



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
