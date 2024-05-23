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
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item Tomato = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));

    public static final Item Metal_Detector = registerItem("metal_detector",new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette",
            new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EchoCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EchoCraft.LOGGER.info("Registering Mod Items for " + EchoCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
