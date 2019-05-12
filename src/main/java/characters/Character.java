package characters;

import entities.Entity;

/**
 * Character
 *
 */
public abstract class Character extends Entity {
    protected int unhealthPoint = 10;
    protected int health = 100;
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
