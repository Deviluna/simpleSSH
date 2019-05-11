package characters;

import java.util.Random;

/**
 * Created by Machenike on 2019/5/11.
 */
public abstract class Monster extends Character {
    protected int probability;
    protected int damage;

    public Monster(int probability) {
        this.probability = probability;
    }

    @Override
    protected int dealAttackDamage() {
        return this.damage + new Random().nextInt(10) + 1;
    }

    @Override
    public int defendAttack(Character enemy) {
        int d = enemy.dealAttackDamage();
        this.setHealth(this.getHealth() - d);
        return d;
    }

    public boolean appears() {
        if (0 >= this.getHealth()) {
            return false;
        }
        return this.probability <= new Random().nextInt(101);
    }
}
