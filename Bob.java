
import java.util.ArrayList;

/**
* @author minkun
* @version 1.0
*/
public class Bob {

    /**
    * this is a method to compare the desserts in two stores.
    * @param x is the first store
    * @param y is the first store
    * @return is a boolean that shows whether x and y are the same
    */
    public static boolean compareStores(Store x, Store y) {
        ArrayList<Dessert> d1 = x.getDesserts();
        Dessert haha;

        for (int i = 0; i < d1.size(); i++) {
            haha = d1.get(i);
            if (y.findDessert(haha) == null) {
                return false;
            }
        }

        return true;
    }

    /**
    * this is a method to find a specific dessert in a store.
    * @param sss is the store
    * @param ddd is the target desert
    * @return is a boolean that shows whether ddd is in the store sss
    */
    public static boolean shop(Store sss, Dessert ddd) {
        sss.sortStore();
        if (sss.findDessert(ddd) == null) {
            return false;
        }
        return true;
    }

}
