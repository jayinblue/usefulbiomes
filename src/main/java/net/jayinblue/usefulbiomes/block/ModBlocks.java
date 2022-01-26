package net.jayinblue.usefulbiomes.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jayinblue.usefulbiomes.UsefulBiomes;
import net.jayinblue.usefulbiomes.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //amethyst blocks
    public static final Block AMETHYST_ORE = registerBlock("amethyst_ore",
            new Block(FabricBlockSettings.of(Material.AMETHYST).breakByHand(false).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(3, 3).requiresTool()));

    public static final Block RAW_AMETHYST_BLOCK = registerBlock("raw_amethyst_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).breakByHand(false).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4, 5).requiresTool()));

    //registry things againnnnnnnnnnnnnnn
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(UsefulBiomes.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(UsefulBiomes.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.UBI)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for UBI!");
    }

}
