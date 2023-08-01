
/**
 * A class with several recursion methods.
 * @author Minkun
 * @version 1.0
 */
public class Recursion {

    /**
     * merge sort a String arrays. This method is recursive.
     * @param haha the input array
     * @return the sorted array
     */
    public static String[] mergeSort(String[] haha) {

        String[] arr1;
        String[] arr2;

        if (haha.length <= 1) {
            return haha;
        } else {
            arr1 = RecursionUtils.copyOfRange(haha, 0, haha.length / 2);
            arr2 = RecursionUtils.copyOfRange(haha, haha.length / 2, haha.length);
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);
            return RecursionUtils.merge(arr1, arr2);
        }
    }

    /**
     * merge a 2D array into a sorted 1D arrays. This method calls a recursive helper method.
     * @param haha the input array
     * @return the sorted 1D array
     */
    public static String[] mergeAll(String[][] haha) {

        int total = 0;
        for (int i = 0; i < haha.length; i++) {
            total += haha[i].length;
        }

        String[] list = new String[total];

        int index = 0;
        for (int a = 0; a < haha.length; a++) {
            for (int b = 0; b < haha[a].length; b++) {
                list[index] = haha[a][b];
                index++;
            }
        }

        return mergeSort(list);
    }

    /**
     * count the Duplicates in a String array. This method is recursive.
     * @param haha is the input array
     * @return the number of Duplicates
     */
    public static int countDuplicates(String[] haha) {

        if (haha.length == 1 || haha.length == 0) {
            return 0;
        }

        if (haha[0].equals(haha[1])) {
            return 1 + countDuplicates(RecursionUtils.copyOfRange(haha, 1, haha.length));
        } else {
            return countDuplicates(RecursionUtils.copyOfRange(haha, 1, haha.length));
        }
    }

    /**
     * check if the array is a Palindrome. This method is recursive.
     * @param haha is the input String
     * @return true or false based on whether the array is a Palindrome
     */
    public static boolean verifyPalindrome(String haha) {

        if (haha == null) {
            return false;
        }

        if (haha.equals("")) {
            return true;
        }

        if (haha.length() == 0 || haha.length() == 1) {
            return true;
        }

        if (haha.charAt(0) == (haha.charAt(haha.length() - 1))) {
            return verifyPalindrome(haha.substring(1, haha.length() - 1));
        }

        return false;
    }

    /**
     * a method to count the number of points inside the radius. This method is recursive.
     * @param loc is the input array of points
     * @param rad is the radius
     * @return the number of points inside the radius
     */
    public static int numInteriorPoints(Point[] loc, int rad) {

        Point[] array;

        if (loc.length == 0) {
            return 0;
        }

        if (Math.sqrt(Math.pow(loc[0].getX(), 2) + Math.pow(loc[0].getY(), 2)) < rad) {
            array = new Point[loc.length - 1];
            for (int i = 0; i < loc.length - 1; i++) {
                array[i] = loc[i + 1];
            }
            return 1 + numInteriorPoints(array, rad);
        } else {
            array = new Point[loc.length - 1];
            for (int i = 0; i < loc.length - 1; i++) {
                array[i] = loc[i + 1];
            }
            return numInteriorPoints(array, rad);
        }
    }

    /*public static void main(String[] args) {
        String[] haha = {"haha", "A", "D", "z", "", "sdkjfs","3","9", "100000"};
        haha = mergeSort(haha);
        for (int i = 0; i < haha.length; i++) {
            System.out.println(haha[i]);
        }
    }*/

    /*public static void main(String[] args) {
        String[][] haha = {{"haha", "A", "D"}, {"z", ""}, {"sdkjfs","3","9"}, {"100000"}};
        String[] temp = mergeAll(haha);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }*/

    /*public static void main(String[] args) {
        String[] haha = {"A", "A", "D", "sdkjfs", "sdkjfs","0","3", "100000"};
        System.out.println(countDuplicates(haha));

        String a = "sdkjfs";
        String b = "asdsa";
        String c = "abba";
        System.out.println(verifyPalindrome(a));
        System.out.println(verifyPalindrome(b));
        System.out.println(verifyPalindrome(c));
    }*/

    /*public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        Point c = new Point(2,9);
        Point d = new Point(2,1);

        Point[] loc = {a,b,c,d};
        System.out.println(numInteriorPoints(loc, 5));
        System.out.println(Math.sqrt(Math.pow(loc[2].getX(), 2) + Math.pow(loc[2].getY(), 2)));
    }*/

}
