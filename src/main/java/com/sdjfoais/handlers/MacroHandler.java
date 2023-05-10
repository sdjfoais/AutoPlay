package com.sdjfoais.handlers;

import com.sdjfoais.auto.AutoMining.*;
import com.sdjfoais.auto.Auto;
import com.sdjfoais.utils.LogUtils;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.List;

public class MacroHandler {
    public static boolean enabled = false;
    public static List<Auto> macros = new ArrayList<>();
    public static Minecraft mc = Minecraft.getMinecraft();
    public static void initializeMacro(){
        macros.add(new AutoMithril());
    }
    public static void startScript(Auto macro){
        if(!macro.isEnabled()) {
            LogUtils.addMessage("Enabled script");
            macro.toggle();
            enabled = true;
        }
    }
    public static void disableScript() {
        for (Auto macro : macros) {
            if (macro.isEnabled()) {
                LogUtils.addMessage("Disabled script");
                macro.toggle();
                enabled = false;
            }
        }
    }
    public static void startScript(int index){
        startScript(macros.get(index));
    }
}
