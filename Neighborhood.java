
public class Neighborhood {

    private int numHouses;
    private House[] houses;

    public Neighborhood(House[] houses) {
        this.houses = houses;
        numHouses = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                numHouses += 1;
            }
        }
    }

    public Neighborhood() {
        this(new House[5]);
    }

    public void displayNewHouses(int year) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getYearBuilt() >= year) {

                String have;
                if (houses[i].getIsRenovated()) {
                    have = "has";
                } else {
                    have = "has not";
                }

                System.out.printf("House located at %s was built in %d, "
                    + "has %f number of bathrooms, and %s been renovated recently.\n",
                    houses[i].getAddress(), houses[i].getYearBuilt(), houses[i].getNumBaths(), have);
            }
        }
    }

    public House addHouse(int ind, House haha) {

        if (houses[ind] == null || ind < 0 || ind >= houses.length) {
            return null;
        }

        House store = houses[ind];
        houses[ind] = haha;

        if (store == null) {
            numHouses++;
        }

        return store;
    }

    public House removeHouse(int ind) {

        if (houses[ind] == null || ind < 0 || ind >= houses.length) {
            return null;
        }

        House store2 = houses[ind];
        houses[ind] = null;
        numHouses--;

        return store2;
    }

    public boolean isFull() {
        return numHouses == houses.length;
    }

}
