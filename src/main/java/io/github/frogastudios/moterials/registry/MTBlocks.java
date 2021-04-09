package io.github.frogastudios.moterials.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static io.github.frogastudios.moterials.Moterials.MODID;

public class MTBlocks
{
    public static final Block ENDERITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static void rB()
    {
        Registry.register(Registry.BLOCK, new Identifier(MODID, "enderite_block"), ENDERITE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MODID, "enderite_block"), new BlockItem(ENDERITE_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
