package io.github.frogastudios.moterials.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static io.github.frogastudios.moterials.Moterials.MODID;

public class MTBlocks
{
    public static final Block ENDERITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static void rB()
    {
        Registry.register(Registry.BLOCK, new Identifier(MODID, "enderite_block"), ENDERITE_BLOCK);
    }
}
