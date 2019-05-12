package wieldable;

import pickups.Wieldable;

/**
 * Sword
 * one kind of weapon
 */
public class Sword extends Wieldable {
    public Sword(String _description, int low, int high) {
        super(_description);
        this.low = low;
        this.high = high;
    }
}
