package com.sdjfoais.utils;

import net.minecraft.util.*;
import net.minecraft.item.ItemStack;
import net.minecraft.client.Minecraft;

public class PlayerUtils {
    private static final Minecraft mc = Minecraft.getMinecraft();

    public static int getItemInHotbar(boolean returnErrorCode, final String... itemName) {
        for (int i = 0; i < 8; ++i) {
            final ItemStack is = mc.thePlayer.inventory.getStackInSlot(i);
            for (String s : itemName) {
                if (is != null && StringUtils.stripControlCodes(is.getDisplayName()).contains(s)) {
                    return i;
                }
            }
        }
        return returnErrorCode ? -1 : 0;
    }
}
