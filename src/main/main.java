package main;

import main.Armors.Shield;
import main.Armors.Сhainmail;
import main.Warriors.Archer;
import main.Warriors.Armor;
import main.Warriors.Palladin;
import main.Warriors.Warrior;
import main.Weapons.Bow;
import main.Weapons.Sword;
import main.teams.Team;

import java.util.Iterator;
import java.util.ListIterator;

public class main {
    public static void main(String[] args) {

        Team<Warrior> firstTeam = new Team<>("Задиры");
        firstTeam.addWarriors(new Archer("Вася", 100, 100, new Bow(), new Сhainmail()))
                .addWarriors(new Archer("Петя", 100, 100, new Bow(), new Сhainmail()))
                .addWarriors(new Archer("Федя", 100, 100, new Bow(), new Сhainmail()))
                .addWarriors(new Palladin("Коля", 100, 100, new Sword(), new Shield()))
                .addWarriors(new Palladin("Серж", 100, 100, new Sword(), new Shield()))
                .addWarriors(new Palladin("Серж", 100, 100, new Sword(), new Shield()));
        Team<Warrior> secondTeam = new Team<>("Драчуны");
        secondTeam.addWarriors(new Palladin("Степа", 100, 100, new Sword(), new Shield()))
                .addWarriors(new Palladin("Дмитрий", 100, 100, new Sword(), new Shield()))
                .addWarriors(new Palladin("Сема", 100, 100, new Sword(), new Shield()))
                .addWarriors(new Archer("Вовка", 100, 100, new Bow(), new Сhainmail()))
                .addWarriors(new Archer("Колька", 100, 100, new Bow(), new Сhainmail()))
                .addWarriors(new Archer("Колька", 100, 100, new Bow(), new Сhainmail()));

        Warrior don = new Palladin("Дмитрий", 100, 100, new Sword(), new Shield());
        Warrior ser = new Archer("Вовка", 100, 100, new Bow(), new Сhainmail());
        while (don.getHealth() >= 0 && ser.getHealth() >= 0) {
            int kickDon = don.SetDamage(ser);
            System.out.println("Воин " + ser.getName() + " получил урон - " + kickDon + " сейчас у него - " + ser.getHealth() + " очков жизни \n");
            int kickSer = ser.SetDamage(don);
            System.out.println("Воин " + don.getName() + " получил урон - " + kickSer + " сейчас у него - " + don.getHealth() + " очков жизни \n");
        }
        System.out.println(don);
        System.out.println(ser);
    }
}


