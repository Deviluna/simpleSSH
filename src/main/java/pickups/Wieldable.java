package pickups;

/**
 * Created by Machenike on 2019/5/11.
 */
public class Wieldable extends Pickup {
    public Wieldable(String _description) {
        super(_description);
    }

    protected int high;
    protected int low;

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
