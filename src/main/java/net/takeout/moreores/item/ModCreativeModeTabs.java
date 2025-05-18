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

import javax.security.auth.login.Configuration;
import java.lang.reflect.Parameter;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreOres.MOD_ID);


    public static final RegistryObject<CreativeModeTab> MORE_ORES = CREATIVE_MODE_TABS.register("more_ores",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GASNITE_ORE.get()))
                    .title(Component.translatable("creativetab.more_ores"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.REFINED_DIAMOND.get());
                        pOutput.accept(Moditems.REFINED_DIAMOND_SHARD.get());
                        pOutput.accept(Moditems.ZIRCON.get());
                        pOutput.accept(Moditems.SAPPHIRE.get());
                        pOutput.accept(Moditems.GASNITE.get());
                        pOutput.accept(Moditems.RAW_ZIRCON.get());
                        pOutput.accept(Moditems.RAW_SAPPHIRE.get());
                        pOutput.accept(Moditems.METAL_DETECTOR.get());
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
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
