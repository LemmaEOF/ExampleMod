package com.example.examplemod;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import org.dimdev.rift.listener.BlockAdder;
import org.dimdev.rift.listener.ItemAdder;
import org.dimdev.rift.listener.TIleEntityTypeAdder;

public class ExampleMod implements BlockAdder, ItemAdder, TileEntityTypeAdder {

    public static final BlockExample EXAMPLE_BLOCK = BlockExample(Block.Builder.create(Material.ROCK, MapColor.STONE).hardnessAndResistance(2f, 3f).sound(SoundType.METAL));

    public static final Item EXAMPLE_ITEM = Item(Item.Builder().group(ItemGroup.DECORATION).rarity(EnumRarity.RARE));

    public static TileEntityType<TileEntityExample> EXAMPLE_TE;

    @Override
    public void registerBlocks() {
        Block.register(new ResourceLocation("examplemod:example_block"), EXAMPLE_BLOCK);
    }

    @Override
    public void registerItems() {
        Item.registerItemBlock(EXAMPLE_BLOCK, ItemGroup.DECORATION);
        Item.registerItem(new ResourceLocation("examplemod:example_item"), EXAMPLE_ITEM);
    }

    @Override
    public void registerTileEntityTypes() {
        EXAMPLE_TE = TileEntityType.registerTileEntityType("examplemod:example_block", TileEntityType.Builder.create(TileEntityExample::new));
    }
}
