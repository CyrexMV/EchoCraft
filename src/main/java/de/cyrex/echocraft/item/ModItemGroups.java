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
    public static final ItemGroup Ruby_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EchoCraft.MOD_ID,"scythe"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.scythe"))
                    .icon(() -> new ItemStack(ModItems.Scythe)).entries((displayContext, entries) -> {
                        entries.add(ModItems.Scythe);
                        entries.add(ModItems.AsuraSword);
                        entries.add(ModItems.Redstonecanon);
                        entries.add(ModItems.WormHammer);
                        entries.add(ModItems.Metal_Detector);



                        entries.add(ModItems.Ruby);
                        entries.add(ModItems.Raw_Ruby);



                        entries.add(ModItems.Blue_Apple);

                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.RUBY_ORE);


                    }).build());

    public static void registerItemgroups() {
        EchoCraft.LOGGER.info("Registering Item Groups for" + EchoCraft.MOD_ID);
    }
}
