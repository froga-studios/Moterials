package io.github.frogastudios.moterials;

import net.fabricmc.api.ModInitializer;

import static io.github.frogastudios.moterials.registry.MTBlocks.rB;
import static io.github.frogastudios.moterials.registry.MTItems.rI;

public class Moterials implements ModInitializer {

    public static String MODID = "moterials";

    @Override
    public void onInitialize() {
    rB();
    rI();
    }
}
