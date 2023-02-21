package main.Warriors;

import main.Weapons.Sword;

public class Palladin extends Warrior{


    public Palladin(String name, int health, int armor, Sword weapon, Armor shield) {
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
        return super.toString() + ", Палладин";
    }
}
