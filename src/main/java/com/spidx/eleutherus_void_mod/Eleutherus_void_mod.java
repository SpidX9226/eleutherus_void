package com.spidx.eleutherus_void_mod;

import com.spidx.eleutherus_void_mod.block.ModBlocks;
import com.spidx.eleutherus_void_mod.enchantments.ModEnchantments;
import com.spidx.eleutherus_void_mod.entity.ModEntities;
import com.spidx.eleutherus_void_mod.entity.custom.VoidAlbino;
import com.spidx.eleutherus_void_mod.item.ModItemGroups;
import com.spidx.eleutherus_void_mod.item.ModItems;
import com.spidx.eleutherus_void_mod.painting.ModPainting;
import com.spidx.eleutherus_void_mod.particle.ModParticles;
import com.spidx.eleutherus_void_mod.util.ModLootTableModifiers;
import com.spidx.eleutherus_void_mod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Eleutherus_void_mod implements ModInitializer {
	public static final String MOD_ID = "eleutherus_void_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

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

		ModWorldGeneration.generateModWorldGen();

		FabricDefaultAttributeRegistry.register(ModEntities.VOID_ALBINO, VoidAlbino.createEndermanAttributes());
	}
}