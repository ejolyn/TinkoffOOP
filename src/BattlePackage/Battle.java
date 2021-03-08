package BattlePackage;

public class Battle {

    public void start() {
        Warrior warrior = new Warrior("Конан");
        Rogue rogue = new Rogue("Гаррет");
        System.out.println("Начинается битва.");
        System.out.println("C одной стороны: " + warrior.GetSpecialization() + " " + warrior.GetName());
        System.out.println("C другой стороны: " + rogue.GetSpecialization() + " " + rogue.GetName());
        warrior.BattleRage();
        rogue.Invisibility();
        rogue.BackStab();
        warrior.HandPunch();
        rogue.Dodge();
        warrior.SwordHit();
        rogue.death();
        System.out.println("Битва закончилась победой Конана");
    }
}
