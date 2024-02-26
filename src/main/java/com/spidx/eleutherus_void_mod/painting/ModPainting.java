package com.spidx.eleutherus_void_mod.painting;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPainting {

    public static final PaintingVariant VOID_HOLE = registerPainting("void_hole", new PaintingVariant(16, 16));

    public static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant){
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(Eleutherus_void_mod.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings(){
        Eleutherus_void_mod.LOGGER.debug("Registering Paintings for " + Eleutherus_void_mod.MOD_ID);
    }

}
