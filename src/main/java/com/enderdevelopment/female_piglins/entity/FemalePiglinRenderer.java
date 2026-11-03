package com.enderdevelopment.female_piglins.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FemalePiglinRenderer extends MobRenderer<FemalePiglin, FemalePiglinModel<FemalePiglin>> {
    
    private static final ResourceLocation TEXTURE = new ResourceLocation("female_piglins:textures/entity/female_piglin.png");
    
    public FemalePiglinRenderer(EntityRendererProvider.Context context) {
        super(context, new FemalePiglinModel<>(context.bakeLayer(FemalePiglinModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(FemalePiglin entity) {
        return TEXTURE;
    }

    @Override
    protected void scale(FemalePiglin entity, PoseStack poseStack, float partialTickTime) {
        poseStack.scale(0.9375f, 0.9375f, 0.9375f);
    }
}