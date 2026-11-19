package com.masterme4a;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid="masterme4a", value=Dist.CLIENT, bus=Mod.EventBusSubscriber.Bus.FORGE)
public final class MainMenuPurpleTheme {
    private MainMenuPurpleTheme() {}
    @SubscribeEvent
    public static void onTitleBackground(GuiScreenEvent.BackgroundDrawnEvent event) {
        if (!(event.getGui() instanceof MainMenuScreen)) return;
        MatrixStack matrix = event.getMatrixStack();
        int w = event.getGui().width, h = event.getGui().height;
        AbstractGui.fill(matrix, 0, 0, w, h, 0xB0200638);
        AbstractGui.fill(matrix, 0, 0, w, 3, 0xFFB45CFF);
        AbstractGui.fill(matrix, 0, h-3, w, h, 0xFF9B45FF);
        AbstractGui.fill(matrix, 0, 0, 3, h, 0xCC8A35E8);
        AbstractGui.fill(matrix, w-3, 0, w, h, 0xCC8A35E8);
    }
}
