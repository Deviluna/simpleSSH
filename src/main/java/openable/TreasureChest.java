package openable;

import pickups.Openable;
import pickups.Opener;
import pickups.Pickup;

/**
 * Created by Machenike on 2019/5/11.
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
