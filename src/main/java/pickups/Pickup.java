package pickups;

import entities.Entity;

/**
 * Created by Machenike on 2019/5/11.
 */
public abstract class Pickup extends Entity {
    public Pickup(String _description) {
        this.description = _description;
        this.id = this.getClass().getSimpleName();
    }

    public Pickup(){}
}
