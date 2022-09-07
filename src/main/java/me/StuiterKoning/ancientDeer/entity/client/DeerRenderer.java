package me.StuiterKoning.ancientDeer.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import me.StuiterKoning.ancientDeer.AncientDeerMod;
import me.StuiterKoning.ancientDeer.entity.custom.DeerEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DeerRenderer extends GeoEntityRenderer<DeerEntity> {
    public DeerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DeerModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(DeerEntity instance) {
        return new ResourceLocation(AncientDeerMod.MOD_ID, "textures/entity/deer/deer.png");
    }

    @Override
    public RenderType getRenderType(DeerEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation){
        stack.scale(1,1,1);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
