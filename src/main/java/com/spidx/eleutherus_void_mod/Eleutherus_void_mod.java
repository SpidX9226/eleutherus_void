package com.spidx.eleutherus_void_mod;

import com.spidx.eleutherus_void_mod.block.ModBlocks;
import com.spidx.eleutherus_void_mod.enchantments.ModEnchantments;
import com.spidx.eleutherus_void_mod.entity.ModEntities;
import com.spidx.eleutherus_void_mod.entity.custom.VoidAlbino;
import com.spidx.eleutherus_void_mod.fluid.ModFluids;
import com.spidx.eleutherus_void_mod.item.ModItemGroups;
import com.spidx.eleutherus_void_mod.item.ModItems;
import com.spidx.eleutherus_void_mod.painting.ModPainting;
import com.spidx.eleutherus_void_mod.particle.ModParticles;
import com.spidx.eleutherus_void_mod.util.ModLootTableModifiers;
import com.spidx.eleutherus_void_mod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class Eleutherus_void_mod implements ModInitializer {
	public static final String MOD_ID = "eleutherus_void_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final RegistryKey<PlacedFeature> ORE_TUNGSTEN_SMALL = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Eleutherus_void_mod.MOD_ID,"ore_tungsten_small"));
	public static final RegistryKey<PlacedFeature> ORE_TUNGSTEN_MEDIUM = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Eleutherus_void_mod.MOD_ID,"ore_tungsten_medium"));
	public static final RegistryKey<PlacedFeature> ORE_TUNGSTEN_LARGE = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Eleutherus_void_mod.MOD_ID,"ore_tungsten_large"));
	public static final RegistryKey<PlacedFeature> ORE_TUNGSTEN_BURIED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Eleutherus_void_mod.MOD_ID,"ore_tungsten_buried"));


	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		StrippableBlockRegistry.register(ModBlocks.ELEUTHERUS_LOG, ModBlocks.STRIPPED_ELEUTHERUS_LOG);
		StrippableBlockRegistry.register(ModBlocks.ELEUTHERUS_WOOD, ModBlocks.STRIPPED_ELEUTHERUS_WOOD);
		StrippableBlockRegistry.register(ModBlocks.VOID_LOG, ModBlocks.STRIPPED_VOID_LOG);
		StrippableBlockRegistry.register(ModBlocks.VOID_WOOD, ModBlocks.STRIPPED_VOID_WOOD);

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModEnchantments.registerModEnchantments();
		ModParticles.registerParticles();
		ModPainting.registerPaintings();
		ModFluids.register();

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_TUNGSTEN_SMALL);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_TUNGSTEN_MEDIUM);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_TUNGSTEN_LARGE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_TUNGSTEN_BURIED);

		ModWorldGeneration.generateModWorldGen();

		FabricDefaultAttributeRegistry.register(ModEntities.VOID_ALBINO, VoidAlbino.createEndermanAttributes());

		GeckoLib.initialize();
	}
}