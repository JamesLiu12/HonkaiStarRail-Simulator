package game.simulator.lightCones;
import game.simulator.combatUnit.characters.Path;

public class LightCone {
    public LightCone(String name, Path path, double HP, double ATK, double DEF) {
        this.name = name;
        this.path = path;
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
    }
    public String name;
    public Path path;
    public double HP, ATK, DEF;
    public void Ability() {}
}
