package net.takeout.moreores.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.takeout.moreores.MoreOres;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoreOres.MOD_ID);

    public static final RegistryObject<SoundEvent> METAL_DETECTOR_FOUND_ORE = registerSoundEvents("metal_detector_found_ore");
    public static final RegistryObject<SoundEvent> GOLDEN_ODESSEY = registerSoundEvents("golden_odyssey");
    public static final RegistryObject<SoundEvent> BAR_BRAWL = registerSoundEvents("bar_brawl");





    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MoreOres.MOD_ID, name)));
    }


    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
