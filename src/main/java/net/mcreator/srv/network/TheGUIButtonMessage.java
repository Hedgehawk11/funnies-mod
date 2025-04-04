
package net.mcreator.srv.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.srv.world.inventory.TheGUIMenu;
import net.mcreator.srv.procedures.TakeNightVisionProcedure;
import net.mcreator.srv.procedures.MuteLeroyProcedure;
import net.mcreator.srv.procedures.HungerResetProcedure;
import net.mcreator.srv.procedures.GiveNightVisionProcedure;
import net.mcreator.srv.FunniesMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheGUIButtonMessage {
	private final int buttonID, x, y, z;

	public TheGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public TheGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(TheGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(TheGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = TheGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GiveNightVisionProcedure.execute(entity);
		}
		if (buttonID == 1) {

			TakeNightVisionProcedure.execute(entity);
		}
		if (buttonID == 2) {

			HungerResetProcedure.execute(world, x, y, z);
		}
		if (buttonID == 3) {

			MuteLeroyProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FunniesMod.addNetworkMessage(TheGUIButtonMessage.class, TheGUIButtonMessage::buffer, TheGUIButtonMessage::new, TheGUIButtonMessage::handler);
	}
}
