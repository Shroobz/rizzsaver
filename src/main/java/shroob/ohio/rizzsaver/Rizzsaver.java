package shroob.ohio.rizzsaver;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.text.Text;

public class Rizzsaver implements ModInitializer {

    public Rizzsaver() {

    }

    @Override
    public void onInitialize() {
        SwordAttack swordAttack = new SwordAttack();
        swordAttack.init();
    }

}

