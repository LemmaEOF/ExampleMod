package com.example.examplemod;

        import net.minecraft.block.ITileEntityProvider;
        import net.minecraft.tileentity.TileEntity;

public class BlockExample extends Block implements ITileEntityProvider {

    public BlockGenerator(Builder builder) {
        super(builder);
    }

    @Override
    public boolean hasTileEntity() {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader world) {
        return new TileEntityExample();
    }

}
