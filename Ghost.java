
/**
 * @author minkun
 * @version 1.0
 */
public class Ghost extends TrickOrTreater {

    private int transparency;

    /**
     * @param name a String, name of the Ghost
     * @param neighborhood a String, neighborhood of the Ghost
     * @param numCandy an integer, number of candy the Ghost have
     * @param transparency an integer, the transparency level of the Ghost
     */
    public Ghost(String name, String neighborhood, int numCandy, int transparency) {
        super(name, neighborhood, numCandy);
        this.transparency = transparency;
    }
    /**
     * @param transparency an integer, the transparency level of the Ghost
     */
    public Ghost(int transparency) {
        this("Agnes", "Halloweentown", 0, transparency);
    }
    /**
     * @param other an Ghost object we input
     */
    public Ghost(Ghost other) {
        this(other.name, other.neighborhood, other.numCandy, other.transparency);
    }


    /**
     * spook method, with 3 conditions inside.
     */
    public void spook() {
        if (transparency >= 10) {
            System.out.println("Very spooky");
        }
        if (transparency >= 3 && transparency <= 9) {
            System.out.println("Boo!");
        }
        if (transparency <= 2) {
            System.out.println("Not very spooky");
        }
    }



    /**
     * @return an integer, the transparency level of the ghost
     */
    public int getTransparency() {
        return transparency;
    }

    /**
     * @param transparency is the transparency level that we want to set
     */
    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

}