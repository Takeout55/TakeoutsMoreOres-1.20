package net.takeout.moreores.item;

import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.entity.ModEntities;
import net.takeout.moreores.item.custom.FuelItem;
import net.takeout.moreores.item.custom.MetalDetectorItem;
import net.takeout.moreores.sounds.ModSounds;

import java.rmi.registry.Registry;

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
            () -> new SwordItem(ModToolTiers.GLITCHITE, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_PICKAXE = ITEMS.register("glitchite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GLITCHITE, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_AXE = ITEMS.register("glitchite_axe",
            () -> new AxeItem(ModToolTiers.GLITCHITE, 5, 1, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_SHOVEL = ITEMS.register("glitchite_shovel",
            () -> new ShovelItem(ModToolTiers.GLITCHITE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_HOE = ITEMS.register("glitchite_hoe",
            () -> new HoeItem(ModToolTiers.GLITCHITE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_HELMET = ITEMS.register("glitchite_helmet",
            () -> new ArmorItem(ModArmorMaterials.GLITCHITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_CHESTPLATE = ITEMS.register("glitchite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.GLITCHITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_LEGGINGS = ITEMS.register("glitchite_leggings",
            () -> new ArmorItem(ModArmorMaterials.GLITCHITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_BOOTS = ITEMS.register("glitchite_boots",
            () -> new ArmorItem(ModArmorMaterials.GLITCHITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CHEESIUM = ITEMS.register("cheesium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_CHEESIUM = ITEMS.register("raw_cheesium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OCARITE = ITEMS.register("ocarite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ENDITE = ITEMS.register("raw_endite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDITE = ITEMS.register("endite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE = ITEMS.register("thimeite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_SCYTHE = ITEMS.register("thimeite_scythe",
            () -> new SwordItem(ModToolTiers.THIMEITE, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_PICKAXE = ITEMS.register("thimeite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.THIMEITE, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_AXE = ITEMS.register("thimeite_axe",
            () -> new AxeItem(ModToolTiers.THIMEITE, 5, 1, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_SHOVEL = ITEMS.register("thimeite_shovel",
            () -> new ShovelItem(ModToolTiers.THIMEITE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_HOE = ITEMS.register("thimeite_hoe",
            () -> new HoeItem(ModToolTiers.THIMEITE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_SWORD = ITEMS.register("refined_diamond_sword",
            () -> new SwordItem(ModToolTiers.REFINED_DIAMOND, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_PICKAXE = ITEMS.register("refined_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.REFINED_DIAMOND, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_AXE = ITEMS.register("refined_diamond_axe",
            () -> new AxeItem(ModToolTiers.REFINED_DIAMOND, 5, 1, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_SHOVEL = ITEMS.register("refined_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.REFINED_DIAMOND, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_HOE = ITEMS.register("refined_diamond_hoe",
            () -> new HoeItem(ModToolTiers.REFINED_DIAMOND, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_HELMET = ITEMS.register("ocarite_helmet",
            () -> new ArmorItem(ModArmorMaterials.OCARITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_CHESTPLATE = ITEMS.register("ocarite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OCARITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_LEGGINGS = ITEMS.register("ocarite_leggings",
            () -> new ArmorItem(ModArmorMaterials.OCARITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_BOOTS = ITEMS.register("ocarite_boots",
            () -> new ArmorItem(ModArmorMaterials.OCARITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_MUSIC_DISC = ITEMS.register("thimeite_music_disc",
            () -> new RecordItem(6, ModSounds.GOLDEN_ODESSEY, new Item.Properties().stacksTo(1), 5820));

    public static final RegistryObject<Item> BAR_BRAWL_MUSIC_DISC = ITEMS.register("bar_brawl_music_disc",
            () -> new RecordItem(6, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> VINYL_TEMPLATE = ITEMS.register("vinyl_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_HELMET = ITEMS.register("zircon_helmet",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_CHESTPLATE = ITEMS.register("zircon_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_LEGGINGS = ITEMS.register("zircon_leggings",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_BOOTS = ITEMS.register("zircon_boots",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> RHINO_SPAWN_EGG = ITEMS.register("rhino_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));

    public static final RegistryObject<Item> PINKITE_INGOT = ITEMS.register("pinkite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));
}
