package com.sdjfoais.auto;

import net.minecraft.client.Minecraft;
public abstract class Auto {
    protected Minecraft mc = Minecraft.getMinecraft();
    protected boolean enabled = false;
    public boolean isEnabled(){
        return enabled;
    }

    public void toggle() {
        enabled = !enabled;
        if (enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }
    protected abstract void onEnable();

    protected abstract void onDisable();
}
