package openable;

import pickups.Openable;
import pickups.Opener;
import pickups.Pickup;

/**
 * Created by Machenike on 2019/5/11.
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
