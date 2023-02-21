package main.Weapons;

import main.Warriors.Weapon;

public class Bow implements Weapon {
    private int maxDistance = rnd.nextInt(50);
    private int conditionPoint = rnd.nextInt(40);
    private int damage = rnd.nextInt(100);

    public void setConditionPoint(int conditionPoint) {
        this.conditionPoint = conditionPoint;
    }

    private int getMaxDistance(){
        return maxDistance;
    }

    @Override
    public String toString() {
        return "Лук ," + "Максимальная дистанция - " + getMaxDistance() + ", Прочность - " + conditionPoint;
    }


    @Override
    public int setDamageFromWeapon() {
        return rnd.nextInt(damage);
    }

    @Override
    public int getBreak() {
        return 0;
    }
}
