package net.mcreator.srv.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.srv.world.inventory.TheGUIMenu;
import net.mcreator.srv.network.TheGUIButtonMessage;
import net.mcreator.srv.FunniesMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TheGUIScreen extends AbstractContainerScreen<TheGUIMenu> {
	private final static HashMap<String, Object> guistate = TheGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_get_fullbright;
	Button button_delete_fullbright;
	Button button_hunger_reset;
	Button button_mute_loud_noises;

	public TheGUIScreen(TheGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 202;
		this.imageHeight = 166;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("funnies:textures/screens/the_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_get_fullbright = Button.builder(Component.translatable("gui.funnies.the_gui.button_get_fullbright"), e -> {
			if (true) {
				FunniesMod.PACKET_HANDLER.sendToServer(new TheGUIButtonMessage(0, x, y, z));
				TheGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 55, this.topPos + 43, 98, 20).build();
		guistate.put("button:button_get_fullbright", button_get_fullbright);
		this.addRenderableWidget(button_get_fullbright);
		button_delete_fullbright = Button.builder(Component.translatable("gui.funnies.the_gui.button_delete_fullbright"), e -> {
			if (true) {
				FunniesMod.PACKET_HANDLER.sendToServer(new TheGUIButtonMessage(1, x, y, z));
				TheGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 46, this.topPos + 70, 114, 20).build();
		guistate.put("button:button_delete_fullbright", button_delete_fullbright);
		this.addRenderableWidget(button_delete_fullbright);
		button_hunger_reset = Button.builder(Component.translatable("gui.funnies.the_gui.button_hunger_reset"), e -> {
			if (true) {
				FunniesMod.PACKET_HANDLER.sendToServer(new TheGUIButtonMessage(2, x, y, z));
				TheGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 59, this.topPos + 123, 87, 20).build();
		guistate.put("button:button_hunger_reset", button_hunger_reset);
		this.addRenderableWidget(button_hunger_reset);
		button_mute_loud_noises = Button.builder(Component.translatable("gui.funnies.the_gui.button_mute_loud_noises"), e -> {
			if (true) {
				FunniesMod.PACKET_HANDLER.sendToServer(new TheGUIButtonMessage(3, x, y, z));
				TheGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 48, this.topPos + 97, 108, 20).build();
		guistate.put("button:button_mute_loud_noises", button_mute_loud_noises);
		this.addRenderableWidget(button_mute_loud_noises);
	}
}
