package net.thatdudekondd.eldritch.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thatdudekondd.eldritch.EldritchDepths;

public class ModItems {
    public static final Item ELDRITCH_TOME = registerItem("eldritch_tome", new Item(new Item.Settings()));
    public static final Item ELDRITCH_GRIMOIRE = registerItem("eldritch_grimoire", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EldritchDepths.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EldritchDepths.LOGGER.info("Register Mod Items work :)");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ELDRITCH_TOME);
            fabricItemGroupEntries.add(ELDRITCH_GRIMOIRE);
        });
    }
}