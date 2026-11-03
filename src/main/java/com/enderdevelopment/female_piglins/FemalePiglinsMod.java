package com.enderdevelopment.female_piglins;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod("female_piglins")
public class FemalePiglinsMod implements ModInitializer {

    public static final String MODID = "female_piglins";
    
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);
    
    public static final RegistryObject<EntityType<FemalePiglin>> FEMALE_PIGLIN = ENTITY_TYPES.register("female_piglin", () -> EntityType.Builder.of(FemalePiglin::new, MobCategory.MONSTER).sized(0.6f, 1.95f).build(new ResourceLocation(MODID, "female_piglin").toString()));
    
    @Override
    public void onInitialize() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ENTITY_TYPES.register(modEventBus);
    }

    public static class FemalePiglin extends Piglin {
        public FemalePiglin(EntityType<? extends Piglin> entityType, Level level) {
            super(entityType, level);
        }
    }

    public static AttributeSupplier.Builder createFemalePiglinAttributes() {
        return Piglin.createAttributes().add(Attributes.MAX_HEALTH, 16.0D).add(Attributes.MOVEMENT_SPEED, 0.35D).add(Attributes.ATTACK_DAMAGE, 5.0D).add(Attributes.ARMOR, 4.0D);
    }
}