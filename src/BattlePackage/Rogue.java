package BattlePackage;

public class Rogue extends KhajiitRace implements RogueSkills {

    Rogue(String name){
        SetName(name);
        SetSpecialization("Вор-ассасин");
    }
    @Override
    public void DaggerHit() {
        System.out.println("Вор " + GetName() + " не особо парится и тыкает перед собой кинжалом");
    }

    @Override
    public void Invisibility() {
        System.out.println("Вор " + GetName() + " пугается и растворяется в тенях");
    }

    @Override
    public void Dodge() {
        System.out.println(GetName() + " зевает и неторопливо уклоняется от атаки");
    }

    @Override
    public void BackStab() {
        System.out.println(GetName() + " подкрадывается сзади и втыкает противнику в спину кинжал");
    }

    @Override
    public void run() {
        System.out.println("Вор бежит, путаясь в собственных ногах");
    }
}
