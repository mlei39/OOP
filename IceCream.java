
/**
* @author minkun
* @version 1.0
*/
public class IceCream extends Dessert {

    private int scoops;
    private boolean cone;

    /**
    * this is a constructor of IceCream.
    * @param flavor tells the flavor of the IceCream
    * @param sweetness tells the sweetness of the IceCream
    * @param scoops tells the amount of the IceCream
    * @param cone tells whether the IceCream has a cone
    */
    public IceCream(String flavor, double sweetness, int scoops, boolean cone) {
        super(flavor, sweetness);
        this.scoops = scoops;
        this.cone = cone;
    }

    /**
    * this is another constructor of IceCream.
    * @param scoops tells the amount of the IceCream
    * @param cone tells whether the IceCream has a cone
    */
    public IceCream(int scoops, boolean cone) {
        this("vanilla", 45.0, scoops, cone);
    }

    /**
    * this is a default constructor of IceCream.
    */
    public IceCream() {
        this("vanilla", 45.0, 1, false);
    }

    @Override
    public String toString() {
        String hasCone;
        if (cone) {
            hasCone = "has";
        } else {
            hasCone = "does not have";
        }
        return String.format("This is a %s ice cream with %d scoops and %s a cone.",
            this.getFlavor(), scoops, hasCone);
    }

    @Override
    public boolean equals(Object haha) {
        if (haha == null) {
            return false;
        }

        if (haha instanceof IceCream) {
            if (this.getFlavor().equals(((IceCream) haha).getFlavor())
                && this.getSweetness() == ((IceCream) haha).getSweetness()
                && this.scoops == ((IceCream) haha).scoops
                && this.cone == ((IceCream) haha).cone) {
                return true;
            }
        }

        return false;
    }

}
