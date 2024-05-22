package de.cyrex.echocraft.item;

import de.cyrex.echocraft.EchoCraft;
import de.cyrex.echocraft.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Scythe = registerItem("scythe", new Item(new FabricItemSettings()));
    public static final Item AsuraSword = registerItem("asura_sword", new Item(new FabricItemSettings()));
    public static final Item Redstonecanon = registerItem("redstone_canon", new Item(new FabricItemSettings()));
    public static final Item WormHammer = registerItem("worm_hammer", new Item(new FabricItemSettings()));
    public static final Item Metal_Detector = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(32)));


    public static final Item Ruby = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item Raw_Ruby = registerItem("raw_ruby", new Item(new FabricItemSettings()));


    public static final Item Blue_Apple = registerItem("blue_apple", new Item(new FabricItemSettings().food(ModFoodComponents.Blue_Apple)));




    private static void addItemsToIngredienttabItemGroup(FabricItemGroupEntries entries) {
        entries.add(Scythe);
        entries.add(AsuraSword);
        entries.add(Redstonecanon);
        entries.add(WormHammer);
        entries.add(Metal_Detector);


        entries.add(Blue_Apple);



        entries.add(Ruby);
        entries.add(Raw_Ruby);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EchoCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EchoCraft.LOGGER.info("Registering Mod Items for" + EchoCraft.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredienttabItemGroup);
    }
}
