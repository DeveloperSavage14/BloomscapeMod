package net.spud.bloomscape.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spud.bloomscape.Bloomscape;
import net.spud.bloomscape.blocks.ModBlocks;
import net.spud.bloomscape.blocks.ModFlowers;

public class ModItemGroups {

    public static final ItemGroup BLOOMSCAPE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Bloomscape.MOD_ID, "bloomscape_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DREAMERS_DUST))
                    .displayName(Text.translatable("itemgroup.bloomscape.bloomscape_items_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DREAMERS_DUST);
                    }).build());

    public static final ItemGroup BLOOMSCAPE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Bloomscape.MOD_ID, "bloomscape_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.RESTORED_BLOOMSCAPE))
                    .displayName(Text.translatable("itemgroup.bloomscape.bloomscape_blocks_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RESTORED_BLOOMSCAPE);
                        entries.add(ModBlocks.TARNISHED_BLOOMSCAPE);
                    }).build());

    public static final ItemGroup BLOOMSCAPE_FLOWERS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Bloomscape.MOD_ID, "bloomscape_flowers"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModFlowers.RESTORED_DANDELION))
                    .displayName(Text.translatable("itemgroup.bloomscape.bloomscape_blocks_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModFlowers.RESTORED_DANDELION);
                        entries.add(ModFlowers.TARNISHED_DANDELION);
                        entries.add(ModFlowers.RESTORED_POPPY);
                        entries.add(ModFlowers.TARNISHED_POPPY);
                        entries.add(ModFlowers.RESTORED_TULIP);
                        entries.add(ModFlowers.TARNISHED_TULIP);
                    }).build());

    public static void registerItemGroups(){
        Bloomscape.LOGGER.info("Registering Mod Groups for " + Bloomscape.MOD_ID);
    }
}
