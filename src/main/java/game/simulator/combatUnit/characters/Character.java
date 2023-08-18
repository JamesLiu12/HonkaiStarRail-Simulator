package game.simulator.combatUnit.characters;

import game.simulator.combatUnit.CombatUnit;
import game.simulator.lightCones.LightCone;

public abstract class Character extends CombatUnit {
    public Character(String name, CombatType combatType) {
        super(name, combatType);

    }

    public Path path;
    public LightCone lightCone;
    public int eidolons;
    public Stats characterStats, basicStats, extraStats;

    public void BasicAttack(Character enemy) {}
    public void Skill(Character enemy) {}
    public void Ultimate(Character enemy) {}
    public void CalBasicStats() {
        CalBasicATK();
    }
    public void CalBasicHP() {
        this.basicStats.HP = this.characterStats.HP + this.lightCone.HP;
    }
    public void CalBasicATK() {
        this.basicStats.ATK = this.characterStats.ATK + this.lightCone.ATK;
    }
    public void CalBasicDEF() {
        this.basicStats.DEF = this.characterStats.DEF + this.lightCone.DEF;
    }

}
