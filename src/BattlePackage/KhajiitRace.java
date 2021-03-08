package BattlePackage;

public abstract class KhajiitRace {
    private String name;
    private String specialization;

    public abstract void run();

    protected void death() {
        System.out.println(name + " со стоном оседает на землю");
    }

    protected void SetName(String name) {
        this.name = name;
    }

    protected void SetSpecialization(String specialization) {
        this.specialization = specialization;
    }

    protected String GetName() {
        return (this.name);
    }

    protected String GetSpecialization() {
        return (this.specialization);
    }
}
