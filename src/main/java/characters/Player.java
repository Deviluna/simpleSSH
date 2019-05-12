package characters;

import gameplay.Inventory;
import pickups.Wieldable;
import wieldable.FistsofFury;

/**
 * Player
 */
public class Player extends Character {

    private int confidence;
    private String name;
    // player wires a FistsofFury init
    private Wieldable weapon = new FistsofFury("", 1, 5);
    private Inventory inventory = new Inventory();

    public Player(String name, String description, int health, int confidence) {
        this.name = name;
        this.description = description;
        this.health = health;
        this.confidence = confidence;
    }

    @Override
    protected int dealAttackDamage() {
        int h = weapon.hit();
        return h + h * confidence / 100;
    }

    @Override
    public int defendAttack(Character enemy) {
        int d = enemy.dealAttackDamage();
        this.setHealth(this.getHealth() - d / 2);
        return d;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wieldable getWeapon() {
        return weapon;
    }

    public void setWeapon(Wieldable weapon) {
        this.weapon = weapon;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void stats() {
        if (null != this.weapon) {
            System.out.println(this.name + " wires " + this.weapon.getId());
        }
        if(null != this.inventory)
            System.out.println(this.name + " has " + this.inventory.toString());

        System.out.println(this.name + " health " + this.health + "; confidence" + this.confidence);
    }
}
