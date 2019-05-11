package food;


import pickups.Consumable;

/**
 * Created by Machenike on 2019/5/11.
 */
public abstract class Food extends Consumable {
    public Food(String _description, int health) {
        super(_description);
        this.health = health;
    }

    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
