package net.spud.bloomscape.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.spud.bloomscape.Bloomscape;

public class ModBlocks {

    public static final Block RESTORED_BLOOMSCAPE = registerBlock("restored_bloomscape",
            new RestoredBloomscapeBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Bloomscape.MOD_ID, "restored_bloomscape")))
                    .strength(0.6f).sounds(BlockSoundGroup.MOSS_BLOCK).ticksRandomly()));
    public static final Block TARNISHED_BLOOMSCAPE = registerBlock("tarnished_bloomscape",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Bloomscape.MOD_ID, "restored_bloomscape")))
                    .strength(50.0f).resistance(3000.0f).sounds(BlockSoundGroup.DEEPSLATE)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(Bloomscape.MOD_ID,name), block);
    }
    private static void registerBlockItem(String name, Block block) {

        Registry.register(Registries.ITEM, Identifier.of(Bloomscape.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bloomscape.MOD_ID, name)))));

    }
    public static void registerModBlocks() {
        Bloomscape.LOGGER.info("Registering Mod Blocks for " + Bloomscape.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RESTORED_BLOOMSCAPE);
            fabricItemGroupEntries.add(TARNISHED_BLOOMSCAPE);
        });
    }
}
