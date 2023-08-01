
/**
* @author minkun
* @version 1.0
*/
public abstract class Dessert implements Comparable<Dessert> { // should this be an interface ?????????

    private String flavor;
    private double sweetness;

    /**
    * this is a constructor of Dessert.
    * @param flavor tells the flavor of the Dessert
    * @param sweetness tells the sweetness of the Dessert
    */
    public Dessert(String flavor, double sweetness) {
        this.flavor = flavor;
        this.sweetness = sweetness;
    }

    /**
    * this is a default constructor of Dessert.
    */
    public Dessert() {
        this.flavor = "vanilla";
        this.sweetness = 25.0;
    }

    @Override
    public String toString() {
        return String.format("This is a %s dessert with a sweetness of %.2f.", flavor, sweetness);
    }

    @Override
    public boolean equals(Object haha) {
        if (haha == null) {
            return false;
        }

        if (haha instanceof Dessert) {
            if (this.flavor.equals(((Dessert) haha).flavor) && this.sweetness == ((Dessert) haha).sweetness) {
                return true;
            }
        }

        return false;
    }

    /**
    * this is a method to compare two Desserts.
    * @param haha is one of the dessert to be compared
    * @return an integer, showing the bigger Dessert
    */
    public int compareTo(Dessert haha) {
        if (haha == null) {
            return 1;
        } else if (this.sweetness == haha.sweetness) {
            return this.flavor.compareTo(haha.flavor);
        } else {
            return (int) (this.sweetness - haha.sweetness);
        }
    }

    /**
    * this is the getter of flavor.
    * @return a String, the flavor value
    */
    public String getFlavor() {
        return flavor;
    }
    /**
    * this is the getter of sweetness.
    * @return a double, the sweetness value
    */
    public double getSweetness() {
        return sweetness;
    }

}

