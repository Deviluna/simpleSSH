package pickups;

/**
 * Wieldable
 * weapons that would add player`s damage
 */
public class Wieldable extends Pickup {
    public Wieldable(String _description) {
        super(_description);
    }

    // player`s init damage 1-5
    protected int high = 5;
    protected int low = 1;

    public int hit() {
        return getRandomInt(low, high);
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }
}
