package game.simulator.combatUnit;

import game.simulator.combatUnit.characters.CombatType;

public abstract class CombatUnit {
    public CombatUnit(String name, CombatType combatType) {
        this.name = name;
        this.combatType = combatType;
        distanceLeft = 1;
    }

    public String name;
    public CombatType combatType;
    public double distanceLeft;

    public void move(double distance) {
        distanceLeft -= distance;
    }
}
