
    /**
     * @author minkun
     * @version 1.0
     */
public class TrickOrTreater {

    protected String name;
    protected String neighborhood;
    protected int numCandy;
    protected static int totalCandy;

    /**
     * @param name is a string
     * @param neighborhood is a string
     * @param numCandy is an integer
     */
    public TrickOrTreater(String name, String neighborhood, int numCandy) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.numCandy = numCandy;
        totalCandy += numCandy;
    }
    /**
     * it chains to the constructor wrote above using "this".
     */
    public TrickOrTreater() {
        this("Agnes", "Halloweentown", 0);
    }


    /**
     * @param luck is the amount of luck that a TrickOrTreater have for getting candy
     */
    public void seekCandy(int luck) {
        numCandy += 3 * luck;
        totalCandy += 3 * luck;
    }



    /**
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * @return String
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * @return integer
     */
    public int getNumCandy() {
        return numCandy;
    }

    /**
     * @return integer
     */
    public static int getTotalCandy() {
        return totalCandy;
    }



    /**
     * @param name is the name we want to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param neighborhood is the neighborhood we want to set
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * @param numCandy is the number of candy we want to set
     */
    public void setNumCandy(int numCandy) {
        if (this.numCandy < numCandy) {
            totalCandy += (numCandy - this.numCandy);
            this.numCandy = numCandy;
        }
    }

    /**
     * @param tc is the input totalnumber of candy
     */
    public static void setTotalCandy(int tc) {
        if (totalCandy < tc) {
            totalCandy = tc;
        }
    }

}
