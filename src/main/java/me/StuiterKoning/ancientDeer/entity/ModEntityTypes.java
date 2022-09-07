package me.StuiterKoning.ancientDeer.entity;

import me.StuiterKoning.ancientDeer.AncientDeerMod;
import me.StuiterKoning.ancientDeer.entity.custom.DeerEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, AncientDeerMod.MOD_ID);

    public static final RegistryObject<EntityType<DeerEntity>> DEER = ENTITY_TYPES.register("deer",
                    () -> EntityType.Builder.of(DeerEntity::new, MobCategory.CREATURE)
                            .sized(1.25f, 1.6f)
                            .build(new ResourceLocation(AncientDeerMod.MOD_ID, "deer").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
