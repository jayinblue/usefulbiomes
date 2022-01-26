package net.jayinblue.usefulbiomes.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.jayinblue.usefulbiomes.UsefulBiomes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup UBI = FabricItemGroupBuilder.build(new Identifier(UsefulBiomes.MOD_ID, "ubi_logo"),
            () -> new ItemStack(ModItems.UBI_LOGO));
}
