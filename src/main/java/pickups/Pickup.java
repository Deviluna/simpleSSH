package pickups;

import entities.Entity;

/**
 * Pickup
 * goods to eat or used
 */
public abstract class Pickup extends Entity {
    public Pickup(String _description) {
        this.description = _description;
        this.id = this.getClass().getSimpleName();
    }

    public Pickup(){}
}
