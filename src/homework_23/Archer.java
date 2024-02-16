package homework_23;

import homework_23.woldOfMagic.GameCharacter;

public class Archer extends GameCharacter {

    public Archer(int health) {
        super(health);
    }

    @Override
    protected void attack() {
        System.out.println("Archer attack with " + health);
    }
}
