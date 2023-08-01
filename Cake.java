
/**
* @author minkun
* @version 1.0
*/
public class Cake extends Dessert {

    private String frosting;
    /**
    * this is a constructor of Cake.
    * @param flavor tells the flavor of the Cake
    * @param sweetness tells the sweetness of the Cake
    * @param frosting tells the frosting of the Cake
    */
    public Cake(String flavor, double sweetness, String frosting) {
        super(flavor, sweetness);
        this.frosting = frosting;
    }

    /**
    * this is another constructor of Cake.
    * @param flavor tells the flavor of the Cake
    */
    public Cake(String flavor) {
        this(flavor, 45.0, "vanilla");
    }

    @Override
    public String toString() {
        return String.format("This is a %s cake with a %s frosting and has a sweetness of %.2f.",
            this.getFlavor(), frosting, this.getSweetness());
    }

    @Override
    public boolean equals(Object haha) {
        if (haha == null) {
            return false;
        }

        if (haha instanceof Cake) {
            if (this.getFlavor().equals(((Cake) haha).getFlavor())
                && this.getSweetness() == ((Cake) haha).getSweetness()
                && this.frosting.equals(((Cake) haha).frosting)) {
                return true;
            }
        }

        return false;
    }

}
