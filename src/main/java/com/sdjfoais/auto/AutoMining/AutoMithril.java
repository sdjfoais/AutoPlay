package com.sdjfoais.auto.AutoMining;

import com.sdjfoais.utils.LogUtils;
import com.sdjfoais.utils.PlayerUtils;
import com.sdjfoais.handlers.*;
import com.sdjfoais.auto.Auto;

public class AutoMithril extends Auto{
    protected void onEnable() {
        LogUtils.addMessage("AutoMithril Enabled");
        int tool = PlayerUtils.getItemInHotbar(false, "Pick", "Gauntlet", "Drill");
        if (tool == -1) {
            LogUtils.addMessage("No Pickaxe");
            MacroHandler.disableScript();
            return;
        }
    }
    @Override
    protected void onDisable() {
        LogUtils.addMessage("AutoMithril Disabled");
        KeybindHandler.resetKeybindState();
    }
}
