
/**
* @author minkun
* @version 1.0
*/
public class Hippo extends Pet {

    private int buff;

    /**
    * this is a constructor of Hippo.
    * @param health is the health value of the Hippo
    * @param attack is the attack value of the Hippo
    * @param buff is an int that shows the amount of buff the Hippo has
    */
    public Hippo(int health, int attack, int buff) {
        super(health, attack);
        if (buff >= 0) {
            this.buff = buff;
        } else {
            this.buff = 0;
        }
    }

    /**
    * this is another constructor of Hippo.
    */
    public Hippo() {
        this(7, 4, 2);
    }

    /**
    * this is a method to gain the buff.
    */
    public void getBuffed() {
        this.setHealth(this.getHealth() + buff);
        this.setAttack(this.getAttack() + buff);
    }

    @Override
    public void attackPet(Pet someone) {
        someone.getAttacked(this.getAttack());
        if (someone.hasFainted()) {
            this.getBuffed();
        }
    }

    @Override
    public String toString() {
        String a = "Hippo:";
        String b = String.format("/%d", buff);
        return a + super.toString() + b;
    }

    /*
    public int getBuff() {
        return buff;
    }
    public void setBuff(int buff) {
        this.buff = buff;
    }
    */

}
