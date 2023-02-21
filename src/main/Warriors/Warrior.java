package main.Warriors;

import main.teams.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Warrior {
    private String name;
    private int damage;
    private int health;
    private int armor;
    protected Weapon weapon;
    protected Armor shield;
    protected Random rnd =new Random();


    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public Warrior(String name, int health, int armor, Weapon weapon, Armor shield) {
        this.name = name;
        this.damage = rnd.nextInt(20);
        this.health = health;
        this.armor = armor;
        this.weapon = weapon;
        this.shield = shield;
    }

    public abstract int SetDamage(Warrior anemy);

    public int maxShield(){
        return shield.protect();
    }
    public int maxDamage(){
        return damage;
    }

    public int getHealth(){
        return health;
    }




    @Override
    public String toString() {
        return "Воин " + name + ", Здоровье - " + health + ", оружие - " + weapon + ", броня - " + shield + ", Сила удара - " + maxDamage() +
                ", защита - " + maxShield();
    }
}
