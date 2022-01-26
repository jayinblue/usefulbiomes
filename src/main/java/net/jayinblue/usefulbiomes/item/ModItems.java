package net.jayinblue.usefulbiomes.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jayinblue.usefulbiomes.UsefulBiomes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //amethyst items
    public static final Item AMETHYST_DUST = registerItem("amethyst_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.UBI)));

    public static final Item RAW_AMETHYST = registerItem("raw_amethyst",
            new Item(new FabricItemSettings().group(ModItemGroup.UBI)));

    public static final Item RAW_AMETHYST_INGOT = registerItem("raw_amethyst_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.UBI)));

    public static final Item AMETHYST_INGOT = registerItem("amethyst_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.UBI)));

    //food
    //once i figure out how minecraft does suspicious stew ill code shiny stew, but for now i have no idea how it works
    /*public static final Item SHINY_STEW = registerItem("shiny_stew",
            new Item(new FabricItemSettings().group(ModItemGroup.UBI)));*/

    //other
    public static final Item UBI_LOGO = registerItem("ubi_logo",
            new Item(new FabricItemSettings().group(ModItemGroup.UBI)));

    //registry thingssssssss
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(UsefulBiomes.MOD_ID, name), item);
    }

    public static void registerModitems() {
        System.out.println("Registering ModItems for UBI!");
    }

}
