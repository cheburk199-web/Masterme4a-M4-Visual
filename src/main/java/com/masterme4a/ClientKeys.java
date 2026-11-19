package com.masterme4a;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber(modid="masterme4a", bus=Mod.EventBusSubscriber.Bus.FORGE)
public final class ClientKeys {
    public static KeyBinding OPEN_MENU;
    private ClientKeys() {}
    public static void register() {
        OPEN_MENU = new KeyBinding("key.masterme4a.menu", GLFW.GLFW_KEY_K, "key.categories.masterme4a");
        ClientRegistry.registerKeyBinding(OPEN_MENU);
    }
    @SubscribeEvent
    public static void onKey(InputEvent.KeyInputEvent event) {
        if (OPEN_MENU != null && OPEN_MENU.isPressed()) {
            net.minecraft.client.Minecraft.getInstance().displayGuiScreen(new VisualMenuScreen());
        }
    }
}
