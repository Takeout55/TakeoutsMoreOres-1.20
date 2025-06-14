package net.takeout.moreores.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.takeout.moreores.MoreOres;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    SAPPHIRE("sapphire", 14, new int[]{1, 5, 4, 2}, 8,
            SoundEvents.ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.of(ModItems.SAPPHIRE.get())),

    ZIRCON("zircon", 13, new int[]{1, 5, 4, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0f, 0.0f, () -> Ingredient.of(ModItems.ZIRCON.get())),

    RUBY("ruby", 13, new int[]{1, 5, 4, 2}, 7, SoundEvents.ARMOR_EQUIP_IRON,
            0.1f, 0.0f, () -> Ingredient.of(ModItems.RUBY.get())),

    GLITCHITE("glitchite", 20, new int[]{3, 5, 4, 2}, 10, SoundEvents.ARMOR_EQUIP_GOLD,
            0.2f, 0.0f, () -> Ingredient.of(ModItems.GLITCHITE_INGOT.get())),

    OCARITE("ocarite", 19, new int[]{4, 6, 4, 2}, 10, SoundEvents.ARMOR_EQUIP_IRON,
            0.2f, 0.0f, () -> Ingredient.of(ModItems.OCARITE.get())),

    THIMEITE("thimeite", 36, new int[]{4, 8, 6, 5}, 11, SoundEvents.ARMOR_EQUIP_IRON,
            2.0f, 0.0f, () -> Ingredient.of(ModItems.RUBY.get())),

    REFINED_DIAMOND("refined_diamond", 38, new int[]{5, 9, 7, 6}, 13, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.0f, 0.05f, () -> Ingredient.of(ModItems.REFINED_DIAMOND.get())),

    CHEEKIUM("cheekium", 22, new int[]{3, 4, 3, 2}, 10,SoundEvents.ARMOR_EQUIP_GOLD,
            0.2f, 0.0f, () -> Ingredient.of(ModItems.CHEEKIUM.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 16, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {

        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }



    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MoreOres.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
