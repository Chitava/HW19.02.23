package main.Weapons;
import main.Warriors.Weapon;

public class Sword implements Weapon {

    private int damagePoint = rnd.nextInt(100);
    private int conditionPoint = rnd.nextInt(200);


    public void setConditionPoint(int conditionPoint) {
        this.conditionPoint = conditionPoint;
    }

    @Override
    public String toString() {
        return "Меч " + "Сокрушающая сила - " + damagePoint + ", Прочность - " + conditionPoint;
    }


    @Override
    public int setDamageFromWeapon() {
        return rnd.nextInt(damagePoint);
    }

    @Override
    public int getBreak() {
        return 0;
    }
}
