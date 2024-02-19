package com.spidx.eleutherus_void_mod.world;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import com.spidx.eleutherus_void_mod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeature {

    public static final RegistryKey<ConfiguredFeature<?, ?>> RANDOM_ORE_KEY = registryKey("random_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> VOID_KEY = registryKey("void_key");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context){
        RuleTest endReplacebles = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> random_ore =
                List.of(OreFeatureConfig.createTarget(endReplacebles, ModBlocks.RANDOM_ORE_BLOCK.getDefaultState()));

        register(context, RANDOM_ORE_KEY, Feature.ORE, new OreFeatureConfig(random_ore, 12));

        register(context, VOID_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.VOID_LOG),
                new StraightTrunkPlacer(5, 4, 3),

                BlockStateProvider.of(ModBlocks.VOID_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),

                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Eleutherus_void_mod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
