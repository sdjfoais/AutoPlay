package com.sdjfoais.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
public class LogUtils {
    static Minecraft mc = Minecraft.getMinecraft();
    public static void addMessage(String message) {
        mc.thePlayer.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "AutoPlay» " + message));
    }
}
