package com.enderdevelopment.female_piglins.gui;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;

public class FemalePiglinMenu extends AbstractContainerMenu {
    
    public FemalePiglinMenu(int containerId, Inventory inventory) {
        super(MenuType.GENERIC_9x3, containerId);
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        return ItemStack.EMPTY;
    }
}