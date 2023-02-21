package main.Armors;

import main.Warriors.Armor;

public class Shield implements Armor {
    private int pointOfProtect = 100;

    public void setPointOfProtect(int pointOfProtect) {
        this.pointOfProtect = pointOfProtect;
    }
    @Override
    public int protect() {
        return pointOfProtect;
    }

    @Override
    public int getBreak() {
        return 0;
    }

    @Override
    public String toString() {
        return "(Щит " + "Прочность - " + protect()+")";

    }
}
