package io.github.frogastudios.moterials.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.frogastudios.moterials.Moterials.MODID;

public class MTItems
{
    public static final Item ENDERITE_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static void rI()
    {
        Registry.register(Registry.ITEM, new Identifier(MODID, "enderite_ingot"), ENDERITE_INGOT);
    }
}
