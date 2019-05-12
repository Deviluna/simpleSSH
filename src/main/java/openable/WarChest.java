package openable;

import pickups.Openable;
import pickups.Opener;
import pickups.Pickup;

/**
 * WarChest
 * locked init
 * should have a key to open it
 */
public class WarChest extends Openable {
    public WarChest(String _description) {
        super(_description);
    }

    public WarChest(Pickup pickup) {
        super(pickup);
    }

    @Override
    public void unlockWith(Opener opener) {

    }
}
