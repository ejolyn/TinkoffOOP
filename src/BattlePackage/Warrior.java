package BattlePackage;

public class Warrior extends KhajiitRace implements MeleeWarrior {

    Warrior(String name) {
        SetName(name);
        SetSpecialization("Воин-мечник");
    }

    @Override
    public void HandPunch() {
        System.out.println(GetName() + " вскрикивает и бьет кулаком наугад");
    }

    @Override
    public void SwordHit() {
        System.out.println(GetSpecialization() + " размахивается мечом и рубит наотмашь");
    }

    @Override
    public void BattleRage() {
        System.out.println(GetName() + " проглатывает мухомор и грызет свой деревянный щит, приводя себя в боевую ярость");
    }

    @Override
    public void ShieldDefence() {
        System.out.println(GetName() + " быстро укрывается за щитом");
    }

    @Override
    public void run() {
        System.out.println("Воины не бегают, они медленно передислоцируются");
    }
}
