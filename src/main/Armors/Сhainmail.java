package main.Armors;

import main.Warriors.Armor;

public class Сhainmail implements Armor {
    private int pointOfProtect = 300;

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
        return "(Кольчуга, " + "Прочность - " + protect() + ")";
    }
}
