package com.minecraftabnormals.neapolitan.common.item;

import com.minecraftabnormals.neapolitan.common.entity.BananarrowEntity;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BananarrowItem extends ArrowItem {

	public BananarrowItem(Properties builder) {
		super(builder);
	}

	@Override
	public AbstractArrowEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
		BananarrowEntity arrowentity = new BananarrowEntity(worldIn, shooter);
		return arrowentity;
	}

	@Override
	public boolean isInfinite(ItemStack stack, ItemStack bow, PlayerEntity player) {
		return false;
	}
}