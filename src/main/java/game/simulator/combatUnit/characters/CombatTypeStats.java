package game.simulator.combatUnit.characters;

public class CombatTypeStats {
    public CombatTypeStats() {
        Physical = 0;
        Fire = 0;
        Ice = 0;
        Lightning = 0;
        Wind = 0;
        Quantum = 0;
        Imaginary = 0;
    }

    public CombatTypeStats(double Physical, double Fire, double Ice, double Lightning,
                           double Wind, double Quantum, double Imaginary) {
        this.Physical = Physical;
        this.Fire = Fire;
        this.Ice = Ice;
        this.Lightning = Lightning;
        this.Wind = Wind;
        this.Quantum = Quantum;
        this.Imaginary = Imaginary;
    }

    double Physical, Fire, Ice, Lightning, Wind, Quantum, Imaginary;
}
