
/**
* @author minkun
* @version 1.0
*/
public abstract class Pet implements Comparable<Pet> {

    private int health;
    private int attack;

    /**
    * this is a constructor of Pet.
    * @param health is its health value
    * @param attack is its attack value
    */
    public Pet(int health, int attack) {
        if (health <= 0) {
            this.health = 1;
        } else {
            this.health = health;
        }

        if (attack < 0) {
            this.attack = 0;
        } else {
            this.attack = attack;
        }
    }

    /**
    * this is a constructor of Pet.
    * @return boolean, it shows whether a Pet has a nonpositive health value
    */
    public boolean hasFainted() {
        return health <= 0;
    }

    /**
    * this is a method to calculate the health after an attack.
    * @param damage is an integer that shows the damage it received
    */
    public void getAttacked(int damage) {
        health -= damage;
    }

    /**
    * this is a method to attack other pets.
    * @param name is the Pet that it gonna attack
    */
    public void attackPet(Pet name) {
        name.getAttacked(this.attack);
    }

    @Override
    public String toString() {
        return String.format("%d/%d", attack, health);
    }

    @Override
    public int compareTo(Pet someone) {
        if (someone == null) {
            return 1;
        } else {
            return this.health + this.attack - someone.health - someone.attack;
        }
    }

    /**
    * this is the getter of health.
    * @return an integer, the health value
    */
    public int getHealth() {
        return health;
    }
    /**
    * this is the getter of attack.
    * @return an integer, the attack value
    */
    public int getAttack() {
        return attack;
    }

    /**
    * this is the setter of health.
    * @param health is the health value we want to set
    */
    public void setHealth(int health) {
        this.health = health;
    }
    /**
    * this is the setter of attack.
    * @param attack is the attack value we want to set
    */
    public void setAttack(int attack) {
        this.attack = attack;
    }

}