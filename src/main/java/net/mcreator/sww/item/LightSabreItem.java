
package net.mcreator.sww.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.sww.SwwModElements;

@SwwModElements.ModElement.Tag
public class LightSabreItem extends SwwModElements.ModElement {
	@ObjectHolder("sww:light_sabre")
	public static final Item block = null;
	public LightSabreItem(SwwModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100000;
			}

			public float getEfficiency() {
				return 100f;
			}

			public float getAttackDamage() {
				return 48f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 96f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("light_sabre"));
	}
}
