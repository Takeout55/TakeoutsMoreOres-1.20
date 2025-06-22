package net.takeout.moreores.datagen;

import net.minecraft.tags.ItemTags;
import net.takeout.moreores.MoreOres;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.takeout.moreores.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, MoreOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SAPPHIRE_HELMET.get(),
                        ModItems.SAPPHIRE_CHESTPLATE.get(),
                        ModItems.SAPPHIRE_LEGGINGS.get(),
                        ModItems.SAPPHIRE_BOOTS.get(),
                        ModItems.REFINED_DIAMOND_CHESTPLATE.get(),
                        ModItems.REFINED_DIAMOND_LEGGINGS.get(),
                        ModItems.REFINED_DIAMOND_BOOTS.get(),
                        ModItems.REFINED_DIAMOND_HELMET.get(),
                        ModItems.GLITCHITE_HELMET.get(),
                        ModItems.GLITCHITE_CHESTPLATE.get(),
                        ModItems.GLITCHITE_LEGGINGS.get(),
                        ModItems.GLITCHITE_BOOTS.get(),
                        ModItems.OCARITE_HELMET.get(),
                        ModItems.OCARITE_CHESTPLATE.get(),
                        ModItems.OCARITE_LEGGINGS.get(),
                        ModItems.OCARITE_BOOTS.get(),
                        ModItems.ZIRCON_HELMET.get(),
                        ModItems.ZIRCON_CHESTPLATE.get(),
                        ModItems.ZIRCON_LEGGINGS.get(),
                        ModItems.ZIRCON_BOOTS.get(),
                        ModItems.RUBY_HELMET.get(),
                        ModItems.RUBY_CHESTPLATE.get(),
                        ModItems.RUBY_LEGGINGS.get(),
                        ModItems.RUBY_BOOTS.get(),
                        ModItems.THIMEITE_HELMET.get(),
                        ModItems.THIMEITE_CHESTPLATE.get(),
                        ModItems.THIMEITE_LEGGINGS.get(),
                        ModItems.THIMEITE_BOOTS.get(),
                        ModItems.CHEEKIUM_HELMET.get(),
                        ModItems.CHEEKIUM_CHESTPLATE.get(),
                        ModItems.CHEEKIUM_LEGGINGS.get(),
                        ModItems.CHEEKIUM_BOOTS.get(),
                        ModItems.FLAMING_TAKEITE_HELMET.get(),
                        ModItems.FLAMING_TAKEITE_CHESTPLATE.get(),
                        ModItems.FLAMING_TAKEITE_LEGGINGS.get(),
                        ModItems.FLAMING_TAKEITE_BOOTS.get(),
                        ModItems.FROZEN_TAKEITE_HELMET.get(),
                        ModItems.FROZEN_TAKEITE_CHESTPLATE.get(),
                        ModItems.FROZEN_TAKEITE_LEGGINGS.get(),
                        ModItems.FROZEN_TAKEITE_BOOTS.get());

        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_MUSIC_DISC.get(),
                        ModItems.THIMEITE_MUSIC_DISC.get());
    }
}
