
/**
* @author minkun
* @version 1.0
*/
public class Skunk extends Pet {

    private int numSpray;

    /**
    * this is a constructor of Skunk.
    * @param health is the health value of the Skunk
    * @param attack is the attack value of the Skunk
    * @param numSpray is the number of Spray that the Skunk has
    */
    public Skunk(int health, int attack, int numSpray) {
        super(health, attack);
        if (numSpray >= 0) {
            this.numSpray = numSpray;
        } else {
            this.numSpray = 0;
        }
    }

    /**
    * this is another constructor of Skunk.
    */
    public Skunk() {
        this(5, 3, 1);
    }

    /**
    * this is a method to spray other pets.
    * @param someone is the Pet that it wants to spray
    */
    public void sprayPet(Pet someone) {
        if (someone != null || numSpray > 0) {
            someone.setHealth(someone.getHealth() - someone.getHealth() / 3);
            someone.setAttack(someone.getAttack() - someone.getAttack() / 3);
            numSpray--;
        }
    }

    @Override
    public void attackPet(Pet someone) {
        sprayPet(someone);
        someone.getAttacked(this.getAttack());
    }

    @Override
    public String toString() {
        String a = "Skunk:";
        String b = String.format("/%d", numSpray);
        return a + super.toString() + b;
    }

    /*
    public int getNumSpray() {
        return numSpray;
    }
    public void setNumSpray(int numSpray) {
        this.numSpray = numSpray;
    }
    */
}