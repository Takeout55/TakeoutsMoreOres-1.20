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


    public static final RegistryObject<CreativeModeTab> MORE_ORES = CREATIVE_MODE_TABS.register("more_ores",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GASNITE_ORE.get()))
                    .title(Component.translatable("creativetab.more_ores"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.REFINED_DIAMOND.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_SHARD.get());
                        pOutput.accept(ModItems.ZIRCON.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.GASNITE.get());
                        pOutput.accept(ModItems.RAW_ZIRCON.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.SAPPHIRE_STAFF.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_BLOCK.get());
                        pOutput.accept(ModBlocks.ZIRCON_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.GASNITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHERRACK_ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.NETHERRACK_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_GASNITE_ORE.get());
                        pOutput.accept(ModBlocks.ENDSTONE_ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.ENDSTONE_SAPPHIRE_ORE.get());
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
                        pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                        pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_AXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        pOutput.accept(ModItems.SAPPHIRE_HOE.get());
                        pOutput.accept(ModBlocks.NETHER_BRICK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_STAIRS.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_SLAB.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_DOOR.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_BUTTON.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_FENCE.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_WALL.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_PRESSURE_PLATE.get());
                        pOutput.accept(ModItems.EARIUM.get());
                        pOutput.accept(ModItems.RAW_EARIUM.get());
                        pOutput.accept(ModItems.RAW_PINKITE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
