package pickups;

/**
 * Created by Machenike on 2019/5/11.
 */
public abstract class Consumable extends Pickup {
    public Consumable(String _description) {
        super(_description);
    }

    private boolean variable;
}
