package characters;

import java.util.Random;

/**
 * Monster
 */
public abstract class Monster extends Character {
    protected int probability;
    // monster`s init damage 1
    protected int damage = 1;

    public Monster(int probability) {
        init();
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
        int appearProbability = new Random().nextInt(101);
        System.out.println(this.getId() + " probability: " + this.probability + "; appearProbability : " + appearProbability);
        return this.probability >= appearProbability;
    }
}
