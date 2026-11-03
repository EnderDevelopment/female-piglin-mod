package com.enderdevelopment.female_piglins.interaction;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import com.enderdevelopment.female_piglins.entity.FemalePiglin;

public class FemalePiglinInteraction {
    
    public static InteractionResult interact(FemalePiglin femalePiglin, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        
        if (itemStack.getItem() == Items.GOLD_INGOT || itemStack.getItem() == Items.GOLD_NUGGET) {
            if (!player.getAbilities().instabuild) {
                itemStack.shrink(1);
            }
            
            // Add logic for befriending or romancing the female piglin
            // For example, increase friendship level or trigger a romance event
            
            return InteractionResult.SUCCESS;
        }
        
        return InteractionResult.PASS;
    }
}