package space.bbkr.zeropoint;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class TileEntityExample extends TileEntity {

    public TileEntityExample(TileEntityType<?> type) {
        super(type);
    }

    public TileEntityExample() {
        this(ExampleMod.EXAMPLE_TE);
    }
}
