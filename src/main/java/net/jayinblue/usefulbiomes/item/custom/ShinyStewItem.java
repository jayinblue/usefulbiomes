package net.jayinblue.usefulbiomes.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MushroomStewItem;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ShinyStewItem extends Item {

    public ShinyStewItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        if(Screen.hasShiftDown()){
            tooltip.add(new TranslatableText("tooltip.usefulbiomes.shiny_stew_shift"));
        } else {
            tooltip.add(new TranslatableText("tooltip.usefulbiomes.shiny_stew"));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}