package net.takeout.moreores.event;


import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.entity.ModEntities;
import net.takeout.moreores.entity.custom.RhinoEntity;

@Mod.EventBusSubscriber(modid = MoreOres.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RHINO.get(), RhinoEntity.createAttributes().build());
    }
}
