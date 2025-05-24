package net.takeout.moreores.datagen;

import net.minecraft.resources.ResourceKey;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.registries.ForgeRegistries;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.block.ModBlocks;
import net.takeout.moreores.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }


    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.RAW_SAPPHIRE);
        simpleItem(ModItems.ZIRCON);
        simpleItem(ModItems.RAW_ZIRCON);
        simpleItem(ModItems.REFINED_DIAMOND);
        simpleItem(ModItems.REFINED_DIAMOND_SHARD);
        simpleItem(ModItems.GASNITE);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.RAW_PINKITE);
        simpleItem(ModItems.EARIUM);
        simpleItem(ModItems.RAW_EARIUM);
        handheldItem(ModItems.METAL_ROD);
        simpleItem(ModItems.GLITCHITE_INGOT);
        simpleItem(ModItems.CHEESIUM);
        simpleItem(ModItems.RAW_CHEESIUM);
        simpleItem(ModItems.OCARITE);
        simpleItem(ModItems.RAW_ENDITE);
        simpleItem(ModItems.ENDITE);
        simpleItem(ModItems.THIMEITE);
        simpleItem(ModItems.BAR_BRAWL_MUSIC_DISC);
        simpleItem(ModItems.THIMEITE_MUSIC_DISC);
        simpleItem(ModItems.VINYL_TEMPLATE);
        simpleItem(ModItems.PINKITE_INGOT);
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.RAW_RUBY);
        
        simpleBlockItem(ModBlocks.SAPPHIRE_DOOR);
        fenceItem(ModBlocks.SAPPHIRE_FENCE, ModBlocks.SAPPHIRE_BLOCK);
        buttonItem(ModBlocks.SAPPHIRE_BUTTON, ModBlocks.SAPPHIRE_BLOCK);
        wallItem(ModBlocks.SAPPHIRE_WALL, ModBlocks.SAPPHIRE_BLOCK);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_STAIRS);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_SLAB);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_FENCE_GATE);
        trapdoorItem(ModBlocks.SAPPHIRE_TRAPDOOR);

        simpleBlockItem(ModBlocks.ZIRCON_DOOR);
        fenceItem(ModBlocks.ZIRCON_FENCE, ModBlocks.ZIRCON_BLOCK);
        buttonItem(ModBlocks.ZIRCON_BUTTON, ModBlocks.ZIRCON_BLOCK);
        wallItem(ModBlocks.ZIRCON_WALL, ModBlocks.ZIRCON_BLOCK);
        evenSimplerBlockItem(ModBlocks.ZIRCON_STAIRS);
        evenSimplerBlockItem(ModBlocks.ZIRCON_SLAB);
        evenSimplerBlockItem(ModBlocks.ZIRCON_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.ZIRCON_FENCE_GATE);
        trapdoorItem(ModBlocks.ZIRCON_TRAPDOOR);

        simpleBlockItem(ModBlocks.CHEESIUM_DOOR);
        fenceItem(ModBlocks.CHEESIUM_FENCE, ModBlocks.CHEESIUM_BLOCK);
        buttonItem(ModBlocks.CHEESIUM_BUTTON, ModBlocks.CHEESIUM_BLOCK);
        wallItem(ModBlocks.CHEESIUM_WALL, ModBlocks.CHEESIUM_BLOCK);
        evenSimplerBlockItem(ModBlocks.CHEESIUM_STAIRS);
        evenSimplerBlockItem(ModBlocks.CHEESIUM_SLAB);
        evenSimplerBlockItem(ModBlocks.CHEESIUM_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.CHEESIUM_FENCE_GATE);
        trapdoorItem(ModBlocks.CHEESIUM_TRAPDOOR);

        // simpleBlockItem(ModBlocks.GLITCHITE_DOOR);
        fenceItem(ModBlocks.GLITCHITE_FENCE, ModBlocks.GLITCHITE_BLOCK);
        buttonItem(ModBlocks.GLITCHITE_BUTTON, ModBlocks.GLITCHITE_BLOCK);
        wallItem(ModBlocks.GLITCHITE_WALL, ModBlocks.GLITCHITE_BLOCK);
        evenSimplerBlockItem(ModBlocks.GLITCHITE_STAIRS);
        evenSimplerBlockItem(ModBlocks.GLITCHITE_SLAB);
        evenSimplerBlockItem(ModBlocks.GLITCHITE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.GLITCHITE_FENCE_GATE);
        trapdoorItem(ModBlocks.GLITCHITE_TRAPDOOR);

        simpleBlockItem(ModBlocks.EARIUM_DOOR);
        fenceItem(ModBlocks.EARIUM_FENCE, ModBlocks.EARIUM_BLOCK);
        buttonItem(ModBlocks.EARIUM_BUTTON, ModBlocks.EARIUM_BLOCK);
        wallItem(ModBlocks.EARIUM_WALL, ModBlocks.EARIUM_BLOCK);
        evenSimplerBlockItem(ModBlocks.EARIUM_STAIRS);
        evenSimplerBlockItem(ModBlocks.EARIUM_SLAB);
        evenSimplerBlockItem(ModBlocks.EARIUM_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.EARIUM_FENCE_GATE);
        trapdoorItem(ModBlocks.EARIUM_TRAPDOOR);

        // simpleBlockItem(ModBlocks.THIMEITE_DOOR);
        fenceItem(ModBlocks.THIMEITE_FENCE, ModBlocks.THIMEITE_BLOCK);
        buttonItem(ModBlocks.THIMEITE_BUTTON, ModBlocks.THIMEITE_BLOCK);
        wallItem(ModBlocks.THIMEITE_WALL, ModBlocks.THIMEITE_BLOCK);
        evenSimplerBlockItem(ModBlocks.THIMEITE_STAIRS);
        evenSimplerBlockItem(ModBlocks.THIMEITE_SLAB);
        evenSimplerBlockItem(ModBlocks.THIMEITE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.THIMEITE_FENCE_GATE);
        // trapdoorItem(ModBlocks.THIMEITE_TRAPDOOR);

        evenSimplerBlockItem(ModBlocks.NETHER_BRICK_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.DIRT_STAIRS);
        evenSimplerBlockItem(ModBlocks.DIRT_SLAB);

        handheldItem(ModItems.SAPPHIRE_SWORD);
        handheldItem(ModItems.SAPPHIRE_PICKAXE);
        handheldItem(ModItems.SAPPHIRE_AXE);
        handheldItem(ModItems.SAPPHIRE_HOE);
        handheldItem(ModItems.SAPPHIRE_SHOVEL);

        handheldItem(ModItems.GLITCHITE_SWORD);
        handheldItem(ModItems.GLITCHITE_PICKAXE);
        handheldItem(ModItems.GLITCHITE_AXE);
        handheldItem(ModItems.GLITCHITE_HOE);
        handheldItem(ModItems.GLITCHITE_SHOVEL);

        handheldItem(ModItems.THIMEITE_SCYTHE);
        handheldItem(ModItems.THIMEITE_PICKAXE);
        handheldItem(ModItems.THIMEITE_AXE);
        handheldItem(ModItems.THIMEITE_HOE);
        handheldItem(ModItems.THIMEITE_SHOVEL);

        handheldItem(ModItems.REFINED_DIAMOND_SWORD);
        handheldItem(ModItems.REFINED_DIAMOND_PICKAXE);
        handheldItem(ModItems.REFINED_DIAMOND_AXE);
        handheldItem(ModItems.REFINED_DIAMOND_HOE);
        handheldItem(ModItems.REFINED_DIAMOND_SHOVEL);

        fenceItem(ModBlocks.REFINED_DIAMOND_FENCE, ModBlocks.REFINED_DIAMOND_BLOCK);
        buttonItem(ModBlocks.REFINED_DIAMOND_BUTTON, ModBlocks.REFINED_DIAMOND_BLOCK);
        wallItem(ModBlocks.REFINED_DIAMOND_WALL, ModBlocks.REFINED_DIAMOND_BLOCK);

        evenSimplerBlockItem(ModBlocks.REFINED_DIAMOND_STAIRS);
        evenSimplerBlockItem(ModBlocks.REFINED_DIAMOND_SLAB);
        evenSimplerBlockItem(ModBlocks.REFINED_DIAMOND_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.REFINED_DIAMOND_FENCE_GATE);
        trapdoorItem(ModBlocks.REFINED_DIAMOND_TRAPDOOR);
        simpleBlockItem(ModBlocks.REFINED_DIAMOND_DOOR);

        evenSimplerBlockItem(ModBlocks.NETHER_BRICK_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.DIRT_SLAB);
        evenSimplerBlockItem(ModBlocks.DIRT_STAIRS);

        trimmedArmorItem(ModItems.SAPPHIRE_HELMET);
        trimmedArmorItem(ModItems.SAPPHIRE_CHESTPLATE);
        trimmedArmorItem(ModItems.SAPPHIRE_BOOTS);
        trimmedArmorItem(ModItems.SAPPHIRE_LEGGINGS);

        trimmedArmorItem(ModItems.REFINED_DIAMOND_HELMET);
        trimmedArmorItem(ModItems.REFINED_DIAMOND_CHESTPLATE);
        trimmedArmorItem(ModItems.REFINED_DIAMOND_BOOTS);
        trimmedArmorItem(ModItems.REFINED_DIAMOND_LEGGINGS);

        trimmedArmorItem(ModItems.GLITCHITE_HELMET);
        trimmedArmorItem(ModItems.GLITCHITE_CHESTPLATE);
        trimmedArmorItem(ModItems.GLITCHITE_BOOTS);
        trimmedArmorItem(ModItems.GLITCHITE_LEGGINGS);

        trimmedArmorItem(ModItems.OCARITE_HELMET);
        trimmedArmorItem(ModItems.OCARITE_CHESTPLATE);
        trimmedArmorItem(ModItems.OCARITE_LEGGINGS);
        trimmedArmorItem(ModItems.OCARITE_BOOTS);

        trimmedArmorItem(ModItems.ZIRCON_HELMET);
        trimmedArmorItem(ModItems.ZIRCON_CHESTPLATE);
        trimmedArmorItem(ModItems.ZIRCON_BOOTS);
        trimmedArmorItem(ModItems.ZIRCON_LEGGINGS);

        withExistingParent(ModItems.RHINO_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MoreOres.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(MoreOres.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(MoreOres.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(MoreOres.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MoreOres.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(MoreOres.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MoreOres.MOD_ID,"item/" + item.getId().getPath()));
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = MoreOres.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
}

