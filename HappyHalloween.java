
/**
* @author minkun
* @version 1.0
*/
public class HappyHalloween {


    /**
    * @param args is the command-line arguments in a String array
    */
    public static void main(String[] args) {

        BlackCat cat1 = new BlackCat("miao", true);
        BlackCat cat2 = new BlackCat("wow", false);

        Witch w1 = new Witch("hhh", "nnn", 10, "sss", cat1);
        Witch w2 = new Witch("h", "s", cat2);
        Witch w3 = new Witch(w2);

        Ghost g1 = new Ghost(0);
        Ghost g2 = new Ghost(1000);
        Ghost g3 = new Ghost(g2);                     // why do I need new??? why not compile
        Ghost g4 = new Ghost("abcd", "efg", 5, 200);

        w1.seekCandy(10);
        w2.seekCandy(10);
        w3.seekCandy(10);

        g1.seekCandy(10);
        g2.seekCandy(10);
        g3.seekCandy(10);
        g4.seekCandy(10);

        System.out.print(TrickOrTreater.getTotalCandy());

    }
}