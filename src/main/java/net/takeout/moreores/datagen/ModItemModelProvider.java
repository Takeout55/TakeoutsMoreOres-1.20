package net.takeout.moreores.datagen;

import net.minecraft.world.level.block.Block;
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

public class ModItemModelProvider extends ItemModelProvider {
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
        simpleBlockItem(ModBlocks.SAPPHIRE_DOOR);

        fenceItem(ModBlocks.SAPPHIRE_FENCE, ModBlocks.SAPPHIRE_BLOCK);
        buttonItem(ModBlocks.SAPPHIRE_BUTTON, ModBlocks.SAPPHIRE_BLOCK);
        wallItem(ModBlocks.SAPPHIRE_WALL, ModBlocks.SAPPHIRE_BLOCK);

        evenSimplerBlockItem(ModBlocks.SAPPHIRE_STAIRS);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_SLAB);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_FENCE_GATE);

        trapdoorItem(ModBlocks.SAPPHIRE_TRAPDOOR);

        fenceItem(ModBlocks.ZIRCON_FENCE, ModBlocks.ZIRCON_BLOCK);
        buttonItem(ModBlocks.ZIRCON_BUTTON, ModBlocks.ZIRCON_BLOCK);
        wallItem(ModBlocks.ZIRCON_WALL, ModBlocks.ZIRCON_BLOCK);

        evenSimplerBlockItem(ModBlocks.ZIRCON_STAIRS);
        evenSimplerBlockItem(ModBlocks.ZIRCON_SLAB);
        evenSimplerBlockItem(ModBlocks.ZIRCON_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.ZIRCON_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.NETHER_BRICK_FENCE_GATE);

        handheldItem(ModItems.SAPPHIRE_SWORD);
        handheldItem(ModItems.SAPPHIRE_PICKAXE);
        handheldItem(ModItems.SAPPHIRE_AXE);
        handheldItem(ModItems.SAPPHIRE_HOE);
        handheldItem(ModItems.SAPPHIRE_SHOVEL);

        fenceItem(ModBlocks.REFINED_DIAMOND_FENCE, ModBlocks.REFINED_DIAMOND_BLOCK);
        buttonItem(ModBlocks.REFINED_DIAMOND_BUTTON, ModBlocks.REFINED_DIAMOND_BLOCK);
        wallItem(ModBlocks.REFINED_DIAMOND_WALL, ModBlocks.REFINED_DIAMOND_BLOCK);

        evenSimplerBlockItem(ModBlocks.REFINED_DIAMOND_STAIRS);
        evenSimplerBlockItem(ModBlocks.REFINED_DIAMOND_SLAB);
        evenSimplerBlockItem(ModBlocks.REFINED_DIAMOND_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.REFINED_DIAMOND_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.NETHER_BRICK_FENCE_GATE);

       // trapdoorItem(ModBlocks.ZIRCON_TRAPDOOR);
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

}

