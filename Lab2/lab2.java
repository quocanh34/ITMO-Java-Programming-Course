package Mylab2;

import ru.ifmo.se.pokemon.*;

public class lab2{
    public static void main(String[] args) {
        Battle battle = new Battle ();

        Pokemon p1 = new Volcanion("Volcanion", 1);
        Pokemon p2 = new Snorunt("Snorunt", 1);
        Pokemon p3 = new Glalie("Glalie", 1);
        Pokemon p4 = new Litten("Litten", 1);
        Pokemon p5 = new Torracat("Torracat", 1);
        Pokemon p6 = new Incineroar("Incineroar", 1);

        battle.addAlly(p1);
        battle.addAlly(p2);
        battle.addAlly(p3);
        battle.addFoe(p4);
        battle.addFoe(p5);
        battle.addFoe(p6);

        battle.go();
    }
}
class Volcanion extends Pokemon{
    public Volcanion(String name, int level){
        super(name, level);
        setStats(80, 110, 120, 130, 90, 70);
        setType(Type.FIRE, Type.WATER);
        setMove(new ShadowClaw(), new CrossChop(), new VacuumWave(), new Confide());
    }
}

class Snorunt extends Pokemon{
    public Snorunt(String name, int level){
        super(name, level);
        setStats(50,50,50,50,50,50);
        setType(Type.ICE);
        setMove(new Rest(), new Confide(), new Facade());
    }
}

class Glalie extends Pokemon{
    public Glalie(String name, int level){
        super(name, level);
        setStats(80,80,80,80,80,80);
        setType(Type.ICE);
        setMove(new Rest(), new Confide(), new Facade(), new FakeTears());
    }
}

class Litten extends Pokemon{
    public Litten(String name, int level){
        super(name, level);
        setStats(45,65,40,60,40,70);
        setType(Type.FIRE);
        setMove(new Swagger(), new Rest());
    }
}

class Torracat extends Pokemon{
    public Torracat(String name, int level){
        super(name, level);
        setStats(65,85,50,80,50,90);
        setType(Type.FIRE);
        setMove(new Swagger(), new Rest(), new RockTomb());
    }
}
class Incineroar extends Pokemon{
    public Incineroar(String name, int level){
        super(name, level);
        setStats(95,115,90,80,90,60);
        setType(Type.FIRE, Type.DARK);
        setMove(new Swagger(), new Rest(), new RockTomb(), new SteelWing());
    }
}

class SteelWing extends PhysicalMove{
    public SteelWing(){
        super(Type.STEEL, 70, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if(Math.random() < 0.1){
            p.setMod(Stat.DEFENSE, +1);
        }
    }
    @Override
    protected String describe(){
        return "Steel Wing raised self defense +1!";
    }
}

class ShadowClaw extends PhysicalMove{
    public ShadowClaw(){
        super(Type.GHOST, 70, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +1/8);
        }
    @Override
    protected String describe(){
        return "Shadow Claw raised self hit ratio +1/8!";
    }
}

class CrossChop extends PhysicalMove{
    public CrossChop(){
        super(Type.FIGHTING, 100, 80);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +1/8);
        }
    @Override
    protected String describe(){
        return "Cross Chop raised self hit ratio +1/8!";
    }

}
class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected String describe(){
        return "Using Facade!";
    }
}

class RockTomb extends PhysicalMove{
    public RockTomb(){
        super(Type.ROCK, 60, 95);
    }
    @Override
    protected void applyOppEffects (Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe(){
        return "Rock Tomb lowered opponent speed -1!";
    }
}

class VacuumWave extends SpecialMove{
    public VacuumWave(){
        super(Type.FIGHTING, 40, 100);
    }
    @Override
    protected String describe(){
        return "Using Vacuum Wave!";
    }
}

class Confide extends StatusMove{
    public Confide(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects (Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected String describe(){
        return "Confide lowered self attack -1! ";
    }
}

class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected String describe(){
        return "Using Rest! ";
    }
}

class FakeTears extends StatusMove{
    public FakeTears(){
        super(Type.DARK, 0, 100);
    }
    @Override
    protected void applyOppEffects (Pokemon p) {
        p.setMod(Stat.DEFENSE, -2);
    }
    @Override
    protected String describe(){
        return "Fake Tears lowered opponent defense -2! ";
    }
}

class Swagger extends StatusMove{
    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects (Pokemon p) {
        p.setMod(Stat.ATTACK, +2);
    }
    @Override
    protected String describe(){
        return "Swagger raised opponent attack +2! ";
    }
}