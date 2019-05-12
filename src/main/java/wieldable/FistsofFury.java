package wieldable;

import pickups.Wieldable;

/**
 * FistsofFury
 * one kind of weapon
 */
public class FistsofFury extends Wieldable {
    public FistsofFury(String _description, int low, int high) {
        super(_description);
        this.low = low;
        this.high = high;
    }
}
