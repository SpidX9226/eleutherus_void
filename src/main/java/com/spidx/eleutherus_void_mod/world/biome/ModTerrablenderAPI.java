package com.spidx.eleutherus_void_mod.world.biome;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import com.spidx.eleutherus_void_mod.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(Eleutherus_void_mod.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, Eleutherus_void_mod.MOD_ID, ModMaterialRules.makeRules());
    }
}
