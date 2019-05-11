package characters;

import entities.Entity;

/**
 * Created by Machenike on 2019/5/11.
 */
public abstract class Character extends Entity {
    protected int unhealthPoint;
    protected int health;
    protected abstract int dealAttackDamage();
    public abstract int defendAttack(Character enemy);

    public int getUnhealthPoint() {
        return unhealthPoint;
    }

    public void setUnhealthPoint(int unhealthPoint) {
        this.unhealthPoint = unhealthPoint;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
