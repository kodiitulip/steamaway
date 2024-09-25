package io.github.kodiitulip.init;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.LinkedHashMap;
import java.util.Map;

import static io.github.kodiitulip.SteamAway.*;

@SuppressWarnings("unused")
public interface ModItems {
    Map<Item, Identifier> ITEMS = new LinkedHashMap<>();

    Item COPPER_SHEET = registerItem("copper_sheet", new Item(new Item.Settings()));

    private static <T extends Item> T registerItem(String name, T item){
        ITEMS.put(item, getNameIdentifier(name));
        return item;
    }

    static void initialize(){
        ITEMS.keySet().forEach(item -> Registry.register(Registries.ITEM, ITEMS.get(item), item));
        LOGGER.info("Registering mod items for " + MOD_ID);
    }
}
