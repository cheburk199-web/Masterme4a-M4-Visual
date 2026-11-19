package com.masterme4a;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.StringTextComponent;
import java.util.Arrays;
import java.util.List;

public class VisualMenuScreen extends Screen {
    private static final List<String> MODULES = Arrays.asList(
        "Hit Particles", "Trails", "World Particles", "Body Glow", "Custom Hand",
        "Kill Effect", "Target HUD", "Damage Numbers", "Armor HUD", "Hotkeys",
        "Custom Crosshair", "Critical Hit Effect", "Trajectory Preview", "Hitbox Helpers"
    );
    public VisualMenuScreen() { super(new StringTextComponent("MASTERME4A M4")); }
    @Override protected void init() {
        int y = 42;
        for (String module : MODULES) {
            final String label = module;
            addButton(new Button(width / 2 - 105, y, 210, 20, new StringTextComponent(label + "  [OFF]"),
                b -> b.setMessage(new StringTextComponent(label + "  [ON]"))));
            y += 23;
            if (y > height - 28) break;
        }
        addButton(new Button(width / 2 - 105, height - 26, 210, 20, new StringTextComponent("Close"), b -> onClose()));
    }
    @Override public void render(MatrixStack matrix, int mouseX, int mouseY, float partialTicks) {
        renderBackground(matrix);
        fill(matrix, 0, 0, width, height, 0xB018062D);
        fill(matrix, 0, 0, width, 4, 0xFFB65CFF);
        drawCenteredString(matrix, font, "MASTERME4A M4", width / 2, 16, 0xFFE9C8FF);
        super.render(matrix, mouseX, mouseY, partialTicks);
    }
    @Override public boolean isPauseScreen() { return false; }
}
