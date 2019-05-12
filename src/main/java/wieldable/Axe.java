package wieldable;

import pickups.Wieldable;

/**
 * Axe
 * one kind of weapon
 */
public class Axe extends Wieldable {
    public Axe(String _description, int low, int high) {
        super(_description);
        this.low = low;
        this.high = high;
    }
}
