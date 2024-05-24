package de.cyrex.echocraft.item;

import de.cyrex.echocraft.EchoCraft;
import de.cyrex.echocraft.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BlockGroup = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EchoCraft.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.echocraftblocks"))
                    .icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.SOUND_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);

                        entries.add(ModBlocks.RUBY_STAIRS);
                        entries.add(ModBlocks.RUBY_SLAB);
                        entries.add(ModBlocks.RUBY_FENCE);
                        entries.add(ModBlocks.RUBY_FENCE_GATE);
                        entries.add(ModBlocks.RUBY_WALL);
                        entries.add(ModBlocks.RUBY_BUTTON);
                        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);
                        entries.add(ModBlocks.RUBY_DOOR);
                        entries.add(ModBlocks.RUBY_TRAPDOOR);
                    }).build());

    public static final ItemGroup ToolsGroup= Registry.register(Registries.ITEM_GROUP,
            new Identifier(EchoCraft.MOD_ID, "armor"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.echocrafttools"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.COAL_BRIQUETTE);
                        entries.add(ModItems.Tomato);
                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.Metal_Detector);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                    }).build());


    public static void registerItemGroups() {
        EchoCraft.LOGGER.info("Registering Item Groups for " + EchoCraft.MOD_ID);
    }
}
