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
import net.takeout.moreores.item.custom.ModArmorItem;
import net.takeout.moreores.sounds.ModSounds;

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
            () -> new FuelItem(new Item.Properties(), 500));

    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 5, -3.0f, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 1.5f, 0, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, -2, 0, new Item.Properties()));

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
            () -> new SwordItem(ModToolTiers.GLITCHITE, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_PICKAXE = ITEMS.register("glitchite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GLITCHITE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_AXE = ITEMS.register("glitchite_axe",
            () -> new AxeItem(ModToolTiers.GLITCHITE, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_SHOVEL = ITEMS.register("glitchite_shovel",
            () -> new ShovelItem(ModToolTiers.GLITCHITE, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_HOE = ITEMS.register("glitchite_hoe",
            () -> new HoeItem(ModToolTiers.GLITCHITE, -1, 0, new Item.Properties()));

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
            () -> new SwordItem(ModToolTiers.THIMEITE, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_PICKAXE = ITEMS.register("thimeite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.THIMEITE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_AXE = ITEMS.register("thimeite_axe",
            () -> new AxeItem(ModToolTiers.THIMEITE, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_SHOVEL = ITEMS.register("thimeite_shovel",
            () -> new ShovelItem(ModToolTiers.THIMEITE, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_HOE = ITEMS.register("thimeite_hoe",
            () -> new HoeItem(ModToolTiers.THIMEITE, -2, 0, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_SWORD = ITEMS.register("refined_diamond_sword",
            () -> new SwordItem(ModToolTiers.REFINED_DIAMOND, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_PICKAXE = ITEMS.register("refined_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.REFINED_DIAMOND, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_AXE = ITEMS.register("refined_diamond_axe",
            () -> new AxeItem(ModToolTiers.REFINED_DIAMOND, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_SHOVEL = ITEMS.register("refined_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.REFINED_DIAMOND, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_HOE = ITEMS.register("refined_diamond_hoe",
            () -> new HoeItem(ModToolTiers.REFINED_DIAMOND, -3, 0, new Item.Properties()));

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

    public static final RegistryObject<Item> THIMEITE_HELMET = ITEMS.register("thimeite_helmet",
            () -> new ArmorItem(ModArmorMaterials.THIMEITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_CHESTPLATE = ITEMS.register("thimeite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.THIMEITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_LEGGINGS = ITEMS.register("thimeite_leggings",
            () -> new ArmorItem(ModArmorMaterials.THIMEITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_BOOTS = ITEMS.register("thimeite_boots",
            () -> new ArmorItem(ModArmorMaterials.THIMEITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> PLUNGITE = ITEMS.register("plungite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PLUNGITE = ITEMS.register("raw_plungite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLUNGITE_SWORD = ITEMS.register("plungite_sword",
            () -> new SwordItem(ModToolTiers.PLUNGITE, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> PLUNGITE_PICKAXE = ITEMS.register("plungite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PLUNGITE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> PLUNGITE_AXE = ITEMS.register("plungite_axe",
            () -> new AxeItem(ModToolTiers.PLUNGITE, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> PLUNGITE_SHOVEL = ITEMS.register("plungite_shovel",
            () -> new ShovelItem(ModToolTiers.PLUNGITE, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> PLUNGITE_HOE = ITEMS.register("plungite_hoe",
            () -> new HoeItem(ModToolTiers.PLUNGITE, -2, 0, new Item.Properties()));

    public static final RegistryObject<Item> RAW_THIMEITE = ITEMS.register("raw_thimeite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHEEKIUM = ITEMS.register("cheekium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHEEKIUM_SWORD = ITEMS.register("cheekium_sword",
            () -> new SwordItem(ModToolTiers.CHEEKIUM, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> CHEEKIUM_PICKAXE = ITEMS.register("cheekium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHEEKIUM, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> CHEEKIUM_AXE = ITEMS.register("cheekium_axe",
            () -> new AxeItem(ModToolTiers.CHEEKIUM, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> CHEEKIUM_SHOVEL = ITEMS.register("cheekium_shovel",
            () -> new ShovelItem(ModToolTiers.CHEEKIUM, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> CHEEKIUM_HOE = ITEMS.register("cheekium_hoe",
            () -> new HoeItem(ModToolTiers.CHEEKIUM, -2, 0, new Item.Properties()));

    public static final RegistryObject<Item> CHEEKIUM_HELMET = ITEMS.register("cheekium_helmet",
            () -> new ArmorItem(ModArmorMaterials.CHEEKIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> CHEEKIUM_CHESTPLATE = ITEMS.register("cheekium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CHEEKIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> CHEEKIUM_LEGGINGS = ITEMS.register("cheekium_leggings",
            () -> new ArmorItem(ModArmorMaterials.CHEEKIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> CHEEKIUM_BOOTS = ITEMS.register("cheekium_boots",
            () -> new ArmorItem(ModArmorMaterials.CHEEKIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTiers.RUBY, -2, 0, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_SWORD = ITEMS.register("zircon_sword",
            () -> new SwordItem(ModToolTiers.ZIRCON, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_PICKAXE = ITEMS.register("zircon_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ZIRCON, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_AXE = ITEMS.register("zircon_axe",
            () -> new AxeItem(ModToolTiers.ZIRCON, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_SHOVEL = ITEMS.register("zircon_shovel",
            () -> new ShovelItem(ModToolTiers.ZIRCON, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_HOE = ITEMS.register("zircon_hoe",
            () -> new HoeItem(ModToolTiers.ZIRCON, -2, 0, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_SWORD = ITEMS.register("ocarite_sword",
            () -> new SwordItem(ModToolTiers.OCARITE, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_PICKAXE = ITEMS.register("ocarite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OCARITE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_AXE = ITEMS.register("ocarite_axe",
            () -> new AxeItem(ModToolTiers.OCARITE, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_SHOVEL = ITEMS.register("ocarite_shovel",
            () -> new ShovelItem(ModToolTiers.OCARITE, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_HOE = ITEMS.register("ocarite_hoe",
            () -> new HoeItem(ModToolTiers.OCARITE, -2, 0, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_GEM = ITEMS.register("flaming_takeite_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE = ITEMS.register("flaming_takeite",
            () -> new FuelItem(new Item.Properties(), 1500));

    public static final RegistryObject<Item> FLAMING_TAKEITE_SWORD = ITEMS.register("flaming_takeite_sword",
            () -> new SwordItem(ModToolTiers.FIRE_TAKEITE, 4, -2.2f, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_PICKAXE = ITEMS.register("flaming_takeite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FIRE_TAKEITE, 1, -2.7f, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_AXE = ITEMS.register("flaming_takeite_axe",
            () -> new AxeItem(ModToolTiers.FIRE_TAKEITE, 6, -3, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_SHOVEL = ITEMS.register("flaming_takeite_shovel",
            () -> new ShovelItem(ModToolTiers.FIRE_TAKEITE, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_HOE = ITEMS.register("flaming_takeite_hoe",
            () -> new HoeItem(ModToolTiers.FIRE_TAKEITE, -2, 0, new Item.Properties()));

    public static final RegistryObject<Item> RAW_CHEEKIUM = ITEMS.register("raw_cheekium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_HELMET = ITEMS.register("flaming_takeite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.FLAMETAKEITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_CHESTPLATE = ITEMS.register("flaming_takeite_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.FLAMETAKEITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_LEGGINGS = ITEMS.register("flaming_takeite_leggings",
            () -> new ModArmorItem(ModArmorMaterials.FLAMETAKEITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_BOOTS = ITEMS.register("flaming_takeite_boots",
            () -> new ModArmorItem(ModArmorMaterials.FLAMETAKEITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_GEM = ITEMS.register("frozen_takeite_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE = ITEMS.register("frozen_takeite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_HELMET = ITEMS.register("frozen_takeite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ICETAKEITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_CHESTPLATE = ITEMS.register("frozen_takeite_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.ICETAKEITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_LEGGINGS = ITEMS.register("frozen_takeite_leggings",
            () -> new ModArmorItem(ModArmorMaterials.ICETAKEITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_BOOTS = ITEMS.register("frozen_takeite_boots",
            () -> new ModArmorItem(ModArmorMaterials.ICETAKEITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_SWORD = ITEMS.register("frozen_takeite_sword",
            () -> new SwordItem(ModToolTiers.ICE_TAKEITE, 4, -2.2f, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_PICKAXE = ITEMS.register("frozen_takeite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ICE_TAKEITE, 1, -2.7f, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_AXE = ITEMS.register("frozen_takeite_axe",
            () -> new AxeItem(ModToolTiers.ICE_TAKEITE, 6, -3, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_SHOVEL = ITEMS.register("frozen_takeite_shovel",
            () -> new ShovelItem(ModToolTiers.ICE_TAKEITE, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_HOE = ITEMS.register("frozen_takeite_hoe",
            () -> new HoeItem(ModToolTiers.ICE_TAKEITE, -2, 0, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_URANIUM = ITEMS.register("refined_uranium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> URANIUM_ROD = ITEMS.register("uranium_rod",
            () -> new Item(new Item.Properties()));
}
