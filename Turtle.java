
/**
* @author minkun
* @version 1.0
*/
public class Turtle extends Pet {

    private boolean melonArmor;

    /**
    * this is a constructor of Turtle.
    * @param health is the health value of the Turtle
    * @param attack is the attack value of the Turtle
    * @param melonArmor is a boolean, meaning whether the Turtle has its defense ability
    */
    public Turtle(int health, int attack, boolean melonArmor) {
        super(health, attack);
        this.melonArmor = melonArmor;
    }

    /**
    * this is another constructor of Turtle.
    */
    public Turtle() {
        this(4, 2, true);
    }

    @Override
    public void getAttacked(int damage) {
        if (melonArmor) {
            if (damage > 20) {
                this.setHealth(this.getHealth() - (damage - 20));
            }
        } else {
            this.setHealth(this.getHealth() - damage);
        }
    }

    @Override
    public String toString() {
        String a = "Turtle:";
        String b = String.format("/%b", melonArmor);
        return a + super.toString() + b;
    }

    /*
    public boolean getMelonArmor() {
        return melonArmor;
    }
    public void setMelonArmor(boolean melonArmor) {
        this.melonArmor = melonArmor;
    }
    */
}