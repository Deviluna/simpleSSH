package openable;

import pickups.Openable;
import pickups.Opener;
import pickups.Pickup;

/**
 * TreasureChest
 * locked init
 * should have key to open it
 */
public class TreasureChest extends Openable {
    public TreasureChest(String _description) {
        super(_description);
    }

    public TreasureChest(Pickup pickup){
        super(pickup);
    }

    @Override
    public void unlockWith(Opener opener) {

    }
}
