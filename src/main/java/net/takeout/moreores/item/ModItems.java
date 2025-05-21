package net.takeout.moreores.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.item.custom.FuelItem;
import net.takeout.moreores.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreOres.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> REFINED_DIAMOND = ITEMS.register("refined_diamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_SHARD = ITEMS.register("refined_diamond_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(500)));

    public static final RegistryObject<Item> GASNITE = ITEMS.register("gasnite",
            () -> new FuelItem(new Item.Properties(), 2000));

    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 5, 1, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> EARIUM = ITEMS.register("earium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_EARIUM = ITEMS.register("raw_earium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PINKITE = ITEMS.register("raw_pinkite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> METAL_ROD = ITEMS.register("metal_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_HELMET = ITEMS.register("refined_diamond_helmet",
            () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_CHESTPLATE = ITEMS.register("refined_diamond_chestplate",
            () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_LEGGINGS = ITEMS.register("refined_diamond_leggings",
            () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_BOOTS = ITEMS.register("refined_diamond_boots",
            () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties()));

     public static final RegistryObject<Item> GLITCHITE_INGOT = ITEMS.register("glitchite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_SWORD = ITEMS.register("glitchite_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_PICKAXE = ITEMS.register("glitchite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_AXE = ITEMS.register("glitchite_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 5, 1, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_SHOVEL = ITEMS.register("glitchite_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_HOE = ITEMS.register("glitchite_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));
}
