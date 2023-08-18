package game.simulator.combatUnit.enemy;

import game.simulator.combatUnit.CombatUnit;
import game.simulator.combatUnit.characters.CombatType;

import java.util.HashSet;

public class Enemy extends CombatUnit {
    public Enemy(String name, CombatType combatType, HashSet<CombatType> weaknesses) {
        super(name, combatType);
        this.weaknesses = weaknesses;
    }
    HashSet<CombatType> weaknesses; 
}
