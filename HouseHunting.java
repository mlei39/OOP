public class HouseHunting {

    public static void main(String[] args) {

        House haha = new House("hhhhhhhh", 4.6);
        House xixi = new House();
        House llll = new House("lsdkjf",-10000);
        House bbbb = new House("8    8", 0);
        House aaaa = new House();

        House[] array = {haha,xixi,llll,bbbb};
        Neighborhood minkun = new Neighborhood(array);

        System.out.println(minkun.removeHouse(3));
        minkun.displayNewHouses(1800);

        System.out.println(minkun.isFull());
    }
    
}
