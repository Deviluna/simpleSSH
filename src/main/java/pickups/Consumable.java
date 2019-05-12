package pickups;

/**
 * Consumable
 */
public abstract class Consumable extends Pickup {
    public Consumable(String _description) {
        super(_description);
    }

    private boolean variable;
}
