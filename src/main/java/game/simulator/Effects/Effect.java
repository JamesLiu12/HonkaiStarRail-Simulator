package game.simulator.Effects;

public abstract class Effect {
    String name;
    int duration;
    DurationUnit durationUnit;

    public void Load() {}
    public void Unload() {}
}

enum DurationUnit {
    Round, Move;
}