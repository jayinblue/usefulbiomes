package net.jayinblue.usefulbiomes.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jayinblue.usefulbiomes.UsefulBiomes;
import net.jayinblue.usefulbiomes.item.custom.ModAxeItem;
import net.jayinblue.usefulbiomes.item.custom.ModHoeItem;
import net.jayinblue.usefulbiomes.item.custom.ModPickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
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

    //amethyst reinforced diamond tools
    public static final Item AMETHYST_REINFORCED_DIAMOND_SWORD = registerItem("amethyst_reinforced_diamond_sword",
            new SwordItem(ModToolMaterial.AMETHYST_REINFORCED_DIAMOND, 3, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.UBI)));

    public static final Item AMETHYST_REINFORCED_DIAMOND_AXE = registerItem("amethyst_reinforced_diamond_axe",
            new ModAxeItem(ModToolMaterial.AMETHYST_REINFORCED_DIAMOND, 5.5f, -3.0f,
                    new FabricItemSettings().group(ModItemGroup.UBI)));

    public static final Item AMETHYST_REINFORCED_DIAMOND_PICKAXE = registerItem("amethyst_reinforced_diamond_pickaxe",
            new ModPickaxeItem(ModToolMaterial.AMETHYST_REINFORCED_DIAMOND, 1, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.UBI)));

    public static final Item AAMETHYST_REINFORCED_DIAMOND_SHOVEL = registerItem("amethyst_reinforced_diamond_shovel",
            new ShovelItem(ModToolMaterial.AMETHYST_REINFORCED_DIAMOND, 2f, -3.0f,
                    new FabricItemSettings().group(ModItemGroup.UBI)));

    public static final Item AMETHYST_REINFORCED_DIAMOND_HOE = registerItem("amethyst_reinforced_diamond_hoe",
            new ModHoeItem(ModToolMaterial.AMETHYST_REINFORCED_DIAMOND, -3, 0.0f,
                    new FabricItemSettings().group(ModItemGroup.UBI)));

    //amethyst reinforced netherite tools
    public static final Item AMETHYST_REINFORCED_NETHERITE_SWORD = registerItem("amethyst_reinforced_netherite_sword",
            new SwordItem(ModToolMaterial.AMETHYST_REINFORCED_NETHERITE, 3, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.UBI)));

    public static final Item AMETHYST_REINFORCED_NETHERITE_AXE = registerItem("amethyst_reinforced_netherite_axe",
            new ModAxeItem(ModToolMaterial.AMETHYST_REINFORCED_NETHERITE, 5.5f, -3.0f,
                    new FabricItemSettings().group(ModItemGroup.UBI)));

    public static final Item AMETHYST_REINFORCED_NETHERITE_PICKAXE = registerItem("amethyst_reinforced_netherite_pickaxe",
            new ModPickaxeItem(ModToolMaterial.AMETHYST_REINFORCED_NETHERITE, 1, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.UBI)));

    public static final Item AAMETHYST_REINFORCED_NETHERITE_SHOVEL = registerItem("amethyst_reinforced_netherite_shovel",
            new ShovelItem(ModToolMaterial.AMETHYST_REINFORCED_NETHERITE, 2f, -3.0f,
                    new FabricItemSettings().group(ModItemGroup.UBI)));

    public static final Item AMETHYST_REINFORCED_NETHERITE_HOE = registerItem("amethyst_reinforced_netherite_hoe",
            new ModHoeItem(ModToolMaterial.AMETHYST_REINFORCED_NETHERITE, -3, 0.0f,
                    new FabricItemSettings().group(ModItemGroup.UBI)));

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
