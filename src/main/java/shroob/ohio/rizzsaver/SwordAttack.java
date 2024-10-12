// Source code is decompiled from a .class file using FernFlower decompiler.
package shroob.ohio.rizzsaver;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public class SwordAttack {

    private boolean hasEnchantments(ItemStack item) {
        ItemEnchantmentsComponent enchantments = EnchantmentHelper.getEnchantments(item);
        return enchantments != null && !enchantments.isEmpty();
    }

    public void init() {
        AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
            ItemStack heldItem = player.getMainHandStack();
            if (EnchantmentHelper.hasEnchantments(heldItem)) {
                if (heldItem.getDamage() >= heldItem.getMaxDamage() - 2) {
                    player.sendMessage(Text.literal("§4Event canceled, repair your shit"), true);
                    return ActionResult.FAIL;
                }
            }
            return ActionResult.PASS;
        });
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            ItemStack heldItem = player.getMainHandStack();
            if (EnchantmentHelper.hasEnchantments(heldItem)) {
                if (heldItem.getDamage() >= heldItem.getMaxDamage() - 2) {
                    player.sendMessage(Text.literal("§4Event canceled, repair your shit"), true);
                    return ActionResult.FAIL;
                }
            }
            return ActionResult.PASS;
        });
    }
}
