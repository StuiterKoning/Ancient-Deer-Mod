package me.StuiterKoning.ancientDeer.entity.client;

import me.StuiterKoning.ancientDeer.AncientDeerMod;
import me.StuiterKoning.ancientDeer.entity.custom.DeerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DeerModel extends AnimatedGeoModel<DeerEntity> {
    @Override
    public ResourceLocation getModelLocation(DeerEntity object) {
        return new ResourceLocation(AncientDeerMod.MOD_ID, "geo/deer.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(DeerEntity object) {
        return new ResourceLocation(AncientDeerMod.MOD_ID, "textures/entity/deer/deer.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(DeerEntity animatable) {
        return new ResourceLocation(AncientDeerMod.MOD_ID, "animations/deer.animation.json");
    }
}
