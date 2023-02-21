package main.Warriors;

import main.Weapons.Bow;

public class Archer extends Warrior{
    private int distance = rnd.nextInt(50);

    public Archer(String name, int health, int armor, Bow weapon, Armor shield) {
        super(name, health, armor, weapon, shield);
    }


    @Override
    public int SetDamage(Warrior anemy) {
        int pointDamege = rnd.nextInt(weapon.setDamageFromWeapon()+maxDamage());
        anemy.setHealth(getHealth() - pointDamege);

        return pointDamege;
    }

    @Override
    public String toString() {
        return super.toString() + ", Лучник";
    }
}
