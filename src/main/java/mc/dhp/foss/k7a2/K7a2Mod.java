package mc.dhp.foss.k7a2;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import mc.dhp.foss.k7a2.world.features.StructureFeature;
import mc.dhp.foss.k7a2.init.K7a2ModVillagerProfessions;
import mc.dhp.foss.k7a2.init.K7a2ModTabs;
import mc.dhp.foss.k7a2.init.K7a2ModSounds;
import mc.dhp.foss.k7a2.init.K7a2ModPotions;
import mc.dhp.foss.k7a2.init.K7a2ModParticleTypes;
import mc.dhp.foss.k7a2.init.K7a2ModPaintings;
import mc.dhp.foss.k7a2.init.K7a2ModMobEffects;
import mc.dhp.foss.k7a2.init.K7a2ModItems;
import mc.dhp.foss.k7a2.init.K7a2ModFluids;
import mc.dhp.foss.k7a2.init.K7a2ModFluidTypes;
import mc.dhp.foss.k7a2.init.K7a2ModEntities;
import mc.dhp.foss.k7a2.init.K7a2ModBlocks;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("k7a2")
public class K7a2Mod {
	public static final Logger LOGGER = LogManager.getLogger(K7a2Mod.class);
	public static final String MODID = "k7a2";

	public K7a2Mod(FMLJavaModLoadingContext context) {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = context.getModEventBus();
		K7a2ModSounds.REGISTRY.register(bus);
		K7a2ModBlocks.REGISTRY.register(bus);

		K7a2ModItems.REGISTRY.register(bus);
		K7a2ModEntities.REGISTRY.register(bus);

		K7a2ModTabs.REGISTRY.register(bus);

		StructureFeature.REGISTRY.register(bus);
		K7a2ModMobEffects.REGISTRY.register(bus);
		K7a2ModPotions.REGISTRY.register(bus);
		K7a2ModPaintings.REGISTRY.register(bus);
		K7a2ModParticleTypes.REGISTRY.register(bus);
		K7a2ModVillagerProfessions.PROFESSIONS.register(bus);

		K7a2ModFluids.REGISTRY.register(bus);
		K7a2ModFluidTypes.REGISTRY.register(bus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(ResourceLocation.fromNamespaceAndPath(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}