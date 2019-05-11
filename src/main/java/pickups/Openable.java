package pickups;



/**
 * Created by Machenike on 2019/5/11.
 */
public abstract class Openable extends Pickup {
    public Openable(String _description) {
        super(_description);
        this.locked = true;
    }

    public Openable(Pickup pickup) {
        super();
        this.pickup = pickup;
    }

    private boolean locked;
    private Pickup pickup;

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public abstract void unlockWith(Opener opener);

    public Pickup getPickup() {
        return pickup;
    }

    public void setPickup(Pickup pickup) {
        this.pickup = pickup;
    }
}
