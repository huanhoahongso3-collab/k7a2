
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.k7a2.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.k7a2.K7a2Mod;

import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableSet;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class K7a2ModVillagerProfessions {
	private static final Map<String, ProfessionPoiType> POI_TYPES = new HashMap<>();
	public static final DeferredRegister<VillagerProfession> PROFESSIONS = DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, K7a2Mod.MODID);
	public static final RegistryObject<VillagerProfession> K_7_A_2_PRO = registerProfession("k_7_a_2_pro", () -> K7a2ModBlocks.BLOCKOF_K_7_A_2.get(), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")));
	public static final RegistryObject<VillagerProfession> HIDDEN_VILLAGER_PRO = registerProfession("hidden_villager_pro", () -> K7a2ModBlocks.BLOCK_OF_DHP.get(),
			() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("k7a2:endermansecret")));
	public static final RegistryObject<VillagerProfession> K_7_A_2_MUSIC = registerProfession("k_7_a_2_music", () -> Blocks.JUKEBOX, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.guitar")));
	public static final RegistryObject<VillagerProfession> K_7_A_2_OP = registerProfession("k_7_a_2_op", () -> K7a2ModBlocks.K_7_A_2_RAINBOW_BLOCK.get(),
			() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.parrot.imitate.zombie_villager")));

	private static RegistryObject<VillagerProfession> registerProfession(String name, Supplier<Block> block, Supplier<SoundEvent> soundEvent) {
		POI_TYPES.put(name, new ProfessionPoiType(block, null));
		return PROFESSIONS.register(name, () -> {
			Predicate<Holder<PoiType>> poiPredicate = poiTypeHolder -> (POI_TYPES.get(name).poiType != null) && (poiTypeHolder.get() == POI_TYPES.get(name).poiType.get());
			return new VillagerProfession(K7a2Mod.MODID + ":" + name, poiPredicate, poiPredicate, ImmutableSet.of(), ImmutableSet.of(), soundEvent.get());
		});
	}

	@SubscribeEvent
	public static void registerProfessionPointsOfInterest(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.POI_TYPES, registerHelper -> {
			for (Map.Entry<String, ProfessionPoiType> entry : POI_TYPES.entrySet()) {
				Block block = entry.getValue().block.get();
				String name = entry.getKey();
				Optional<Holder<PoiType>> existingCheck = PoiTypes.forState(block.defaultBlockState());
				if (existingCheck.isPresent()) {
					K7a2Mod.LOGGER.error("Skipping villager profession " + name + " that uses POI block " + block + " that is already in use by " + existingCheck);
					continue;
				}
				PoiType poiType = new PoiType(ImmutableSet.copyOf(block.getStateDefinition().getPossibleStates()), 1, 1);
				registerHelper.register(name, poiType);
				entry.getValue().poiType = ForgeRegistries.POI_TYPES.getHolder(poiType).get();
			}
		});
	}

	private static class ProfessionPoiType {
		final Supplier<Block> block;
		Holder<PoiType> poiType;

		ProfessionPoiType(Supplier<Block> block, Holder<PoiType> poiType) {
			this.block = block;
			this.poiType = poiType;
		}
	}
}
