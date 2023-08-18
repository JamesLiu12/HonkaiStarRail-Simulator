package game.simulator.combatUnit.characters;

public class Stats {
    public Stats(double HP, double ATK, double DEF, double SPD, double CritRate, double CritDMG,
                 double BreakEffect, double HealingBoost, double MaxEnergy, double EnergyRegenerationRate,
                 double EffectHitRate, double EffectRES, CombatTypeStats DMGBoost, CombatTypeStats RESBoost) {
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
        this.SPD = SPD;
        this.CritRate = CritRate;
        this.CritDMG = CritDMG;
        this.BreakEffect = BreakEffect;
        this.HealingBoost = HealingBoost;
        this.MaxEnergy = MaxEnergy;
        this.EnergyRegenerationRate = EnergyRegenerationRate;
        this.EffectHitRate = EffectHitRate;
        this.EffectRES = EffectRES;
        this.DMGBoost = DMGBoost;
        this.RESBoost = RESBoost;
    }
    double HP, ATK, DEF, SPD, CritRate, CritDMG, BreakEffect, HealingBoost, MaxEnergy,
            EnergyRegenerationRate, EffectHitRate, EffectRES;
    CombatTypeStats DMGBoost, RESBoost, RESPenetrate;
}
