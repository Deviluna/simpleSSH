package characters;

import gameplay.Inventory;
import pickups.Wieldable;

/**
 * Created by Machenike on 2019/5/11.
 */
public class Player extends Character {

    private int confidence;
    private String name;
    private Wieldable weapon;
    private Inventory inventory;

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

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
