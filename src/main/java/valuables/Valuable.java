package valuables;


import pickups.Consumable;

/**
 * Created by Machenike on 2019/5/11.
 */
public abstract class Valuable extends Consumable {
    public Valuable(String _description, int value) {
        super(_description);
        this.value = value;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
