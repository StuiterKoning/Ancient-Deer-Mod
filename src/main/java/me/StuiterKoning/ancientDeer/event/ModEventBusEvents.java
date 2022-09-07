package me.StuiterKoning.ancientDeer.event;

import me.StuiterKoning.ancientDeer.AncientDeerMod;
import me.StuiterKoning.ancientDeer.entity.ModEntityTypes;
import me.StuiterKoning.ancientDeer.entity.custom.DeerEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AncientDeerMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.DEER.get(), DeerEntity.setAttributes());
    }
}
