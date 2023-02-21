package main.teams;

import main.Warriors.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Warrior> {
    private List<T> team = new ArrayList<>();
    private String name;


    public Team(String name) {
        this.name = name;
    }
    public int lenth() {
        return team.size();
    }

    public Team<T> addWarriors(T warrior){
        team.add(warrior);
        return this;
    }




    @Override
    public String toString() {
        StringBuilder printTeam = new StringBuilder();
        for (T item : team) {
            printTeam.append(item.toString() + "\n");
        }
        return "Команда " + name + "\n" + "В составе: \n" + printTeam;
    }
}
