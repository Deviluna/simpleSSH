package wieldable;

import pickups.Wieldable;

/**
 * Created by Machenike on 2019/5/11.
 */
public class Axe extends Wieldable {
    public Axe(String _description, int low, int high) {
        super(_description);
        this.low = low;
        this.high = high;
    }
}
