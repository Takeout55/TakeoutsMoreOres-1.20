package net.takeout.moreores.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreOres.MOD_ID);


    public static final RegistryObject<CreativeModeTab> MORE_ORES_BLOCKS = CREATIVE_MODE_TABS.register("more_ores_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.REFINED_DIAMOND_BLOCK.get()))
                    .title(Component.translatable("creativetab.more_ores_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_BLOCK.get());
                        pOutput.accept(ModBlocks.ZIRCON_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.GLITCHITE_BLOCK.get());
                        pOutput.accept(ModBlocks.EARIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.CHEESIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.OCARITE_BLOCK.get());
                        pOutput.accept(ModBlocks.THIMEITE_BLOCK.get());
                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModBlocks.ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.GASNITE_ORE.get());
                        pOutput.accept(ModBlocks.EARIUM_ORE.get());
                        pOutput.accept(ModBlocks.GLITCHITE_ORE.get());
                        pOutput.accept(ModBlocks.ANCIENT_VOIDSTONE.get());
                        pOutput.accept(ModBlocks.THIMEITE_ORE.get());
                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModBlocks.OCARITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_GASNITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_EARIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_GLITCHITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_THIMEITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_OCARITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHERRACK_ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.NETHERRACK_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_GASNITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_EARIUM_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_GLITCHITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_THIMEITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_RUBY_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_OCARITE_ORE.get());
                        pOutput.accept(ModBlocks.ENDSTONE_ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.ENDSTONE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_EARIUM_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_GASNITE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_GLITCHITE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_THIMEITE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_RUBY_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_OCARITE_ORE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.ZIRCON_STAIRS.get());
                        pOutput.accept(ModBlocks.ZIRCON_SLAB.get());
                        pOutput.accept(ModBlocks.ZIRCON_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.ZIRCON_DOOR.get());
                        pOutput.accept(ModBlocks.ZIRCON_BUTTON.get());
                        pOutput.accept(ModBlocks.ZIRCON_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.ZIRCON_FENCE.get());
                        pOutput.accept(ModBlocks.ZIRCON_WALL.get());
                        pOutput.accept(ModBlocks.ZIRCON_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_STAIRS.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_SLAB.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_DOOR.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_BUTTON.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_FENCE.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_WALL.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.GLITCHITE_STAIRS.get());
                        pOutput.accept(ModBlocks.GLITCHITE_SLAB.get());
                        pOutput.accept(ModBlocks.GLITCHITE_TRAPDOOR.get());
                        // pOutput.accept(ModBlocks.GLITCHITE_DOOR.get());
                        pOutput.accept(ModBlocks.GLITCHITE_BUTTON.get());
                        pOutput.accept(ModBlocks.GLITCHITE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.GLITCHITE_FENCE.get());
                        pOutput.accept(ModBlocks.GLITCHITE_WALL.get());
                        pOutput.accept(ModBlocks.GLITCHITE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.EARIUM_STAIRS.get());
                        pOutput.accept(ModBlocks.EARIUM_SLAB.get());
                        pOutput.accept(ModBlocks.EARIUM_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.EARIUM_DOOR.get());
                        pOutput.accept(ModBlocks.EARIUM_BUTTON.get());
                        pOutput.accept(ModBlocks.EARIUM_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.EARIUM_FENCE.get());
                        pOutput.accept(ModBlocks.EARIUM_WALL.get());
                        pOutput.accept(ModBlocks.EARIUM_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.CHEESIUM_STAIRS.get());
                        pOutput.accept(ModBlocks.CHEESIUM_SLAB.get());
                        pOutput.accept(ModBlocks.CHEESIUM_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.CHEESIUM_DOOR.get());
                        pOutput.accept(ModBlocks.CHEESIUM_BUTTON.get());
                        pOutput.accept(ModBlocks.CHEESIUM_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.CHEESIUM_FENCE.get());
                        pOutput.accept(ModBlocks.CHEESIUM_WALL.get());
                        pOutput.accept(ModBlocks.CHEESIUM_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.THIMEITE_STAIRS.get());
                        pOutput.accept(ModBlocks.THIMEITE_SLAB.get());
                        // pOutput.accept(ModBlocks.THIMEITE_TRAPDOOR.get());
                        // pOutput.accept(ModBlocks.THIMEITE_DOOR.get());
                        pOutput.accept(ModBlocks.THIMEITE_BUTTON.get());
                        pOutput.accept(ModBlocks.THIMEITE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.THIMEITE_FENCE.get());
                        pOutput.accept(ModBlocks.THIMEITE_WALL.get());
                        pOutput.accept(ModBlocks.THIMEITE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.NETHER_BRICK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.DIRT_SLAB.get());
                        pOutput.accept(ModBlocks.DIRT_STAIRS.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MORE_ORES_ITEMS = CREATIVE_MODE_TABS.register("more_ores_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.REFINED_DIAMOND.get()))
                    .title(Component.translatable("creativetab.more_ores_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.METAL_ROD.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_SHARD.get());
                        pOutput.accept(ModItems.ZIRCON.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.GASNITE.get());
                        pOutput.accept(ModItems.EARIUM.get());
                        pOutput.accept(ModItems.CHEESIUM.get());
                        pOutput.accept(ModItems.GLITCHITE_INGOT.get());
                        pOutput.accept(ModItems.OCARITE.get());
                        pOutput.accept(ModItems.ENDITE.get());
                        pOutput.accept(ModItems.THIMEITE.get());
                        pOutput.accept(ModItems.PINKITE_INGOT.get());
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.RAW_ZIRCON.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_EARIUM.get());
                        pOutput.accept(ModItems.RAW_PINKITE.get());
                        pOutput.accept(ModItems.RAW_CHEESIUM.get());
                        pOutput.accept(ModItems.RAW_ENDITE.get());
                        pOutput.accept(ModItems.RAW_RUBY.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.SAPPHIRE_STAFF.get());
                        pOutput.accept(ModItems.VINYL_TEMPLATE.get());
                        pOutput.accept(ModItems.BAR_BRAWL_MUSIC_DISC.get());
                        pOutput.accept(ModItems.THIMEITE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                        pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_AXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        pOutput.accept(ModItems.SAPPHIRE_HOE.get());
                        pOutput.accept(ModItems.GLITCHITE_SWORD.get());
                        pOutput.accept(ModItems.GLITCHITE_PICKAXE.get());
                        pOutput.accept(ModItems.GLITCHITE_AXE.get());
                        pOutput.accept(ModItems.GLITCHITE_SHOVEL.get());
                        pOutput.accept(ModItems.GLITCHITE_HOE.get());
                        pOutput.accept(ModItems.THIMEITE_SCYTHE.get());
                        pOutput.accept(ModItems.THIMEITE_PICKAXE.get());
                        pOutput.accept(ModItems.THIMEITE_AXE.get());
                        pOutput.accept(ModItems.THIMEITE_SHOVEL.get());
                        pOutput.accept(ModItems.THIMEITE_HOE.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_SWORD.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_PICKAXE.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_AXE.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_SHOVEL.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_HOE.get());
                        pOutput.accept(ModItems.SAPPHIRE_HELMET.get());
                        pOutput.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(ModItems.SAPPHIRE_BOOTS.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_HELMET.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_CHESTPLATE.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_LEGGINGS.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_BOOTS.get());
                        pOutput.accept(ModItems.GLITCHITE_HELMET.get());
                        pOutput.accept(ModItems.GLITCHITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.GLITCHITE_LEGGINGS.get());
                        pOutput.accept(ModItems.GLITCHITE_BOOTS.get());
                        pOutput.accept(ModItems.OCARITE_HELMET.get());
                        pOutput.accept(ModItems.OCARITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.OCARITE_LEGGINGS.get());
                        pOutput.accept(ModItems.OCARITE_BOOTS.get());
                        pOutput.accept(ModItems.ZIRCON_HELMET.get());
                        pOutput.accept(ModItems.ZIRCON_CHESTPLATE.get());
                        pOutput.accept(ModItems.ZIRCON_LEGGINGS.get());
                        pOutput.accept(ModItems.ZIRCON_BOOTS.get());
                        pOutput.accept(ModItems.RHINO_SPAWN_EGG.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
