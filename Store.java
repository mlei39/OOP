
import java.util.ArrayList;

/**
* @author minkun
* @version 1.0
*/
public class Store {

    private String name;
    private ArrayList<Dessert> desserts;

    /**
    * this is a constructor of Store.
    * @param name is the name of the Store
    */
    public Store(String name) {
        this.name = name;
        this.desserts = new ArrayList<>();
    }

    /**
    * this is a method to add a Dessert.
    * @param haha is the Dessert to be added
    */
    public void addDessert(Dessert haha) {
        this.desserts.add(haha);
    }

    /**
    * this is a method to remove a Dessert.
    * @param haha is the Dessert to be removed
    * @return the Dessert that is removed
    */
    public Dessert removeDessert(Dessert haha) {
        for (int i = 0; i < desserts.size(); i++) {
            if (desserts.get(i).equals(haha)) {
                this.desserts.remove(haha);
                return haha;
            }
        }
        return null;
    }

    /**
    * this is a method to find a Dessert.
    * @param haha is the Dessert to be found
    * @return the Dessert that is found
    */
    public Dessert findDessert(Dessert haha) {
        int minIndex = 0;
        int maxIndex = desserts.size() - 1;
        int midIndex = 0;
        boolean found = false;
        while (!found && minIndex < maxIndex) {
            midIndex = (minIndex + maxIndex) / 2;
            if (desserts.get(midIndex).compareTo(haha) == 0) {
                found = true;
            } else if (haha.compareTo(desserts.get(midIndex)) < 0) {
                maxIndex = midIndex - 1;
            } else {
                minIndex = midIndex + 1;
            }
        }
        if (!found) {
            return null;
        }
        return desserts.get(midIndex);
    }

    /**
    * this is a method to sort a store.
    */
    public void sortStore() {
        for (int a = 0; a < desserts.size(); a++) {
            for (int b = a + 1; b < desserts.size(); b++) {
                if (desserts.get(a).compareTo(desserts.get(b)) > 0) {
                    Dessert hold = desserts.get(a);
                    desserts.set(a, desserts.get(b));
                    desserts.set(b, hold);
                }
            }
        }
    }

    /**
    * this is a method to check a store.
    * @param haha is the Dessert to be checked
    * @return the number of haha that is found
    */
    public int checkStore(Dessert haha) {
        int count = 0;
        for (int i = 0; i < desserts.size(); i++) {
            if (desserts.get(i).compareTo(haha) >= 0) {
                count++;
            }
        }
        return count;
    }

    /**
    * this is the getter of desserts.
    * @return the Arraylist desserts
    */
    public ArrayList<Dessert> getDesserts() {
        return desserts;
    }

}
