
/**
* @author minkun
* @version 1.0
*/
public class PetBattlefield {

    private Pet[] firstTeam = new Pet[5];
    private Pet[] secondTeam = new Pet[5];

    /**
    * this is a constructor of PetBattlefield.
    * @param firstTeam is an array that contains all the pets in the first team
    * @param secondTeam is an array that contains all the pets in the second team
    */
    public PetBattlefield(Pet[] firstTeam, Pet[] secondTeam) {

        if (firstTeam.length > 5 || secondTeam.length > 5) {
            this.firstTeam = new Pet[] {};
            this.secondTeam = new Pet[] {};
        } else {
            this.firstTeam = firstTeam;
            this.secondTeam = secondTeam;
        }
    }

    @Override
    public String toString() {

        String a = "First Team: ";
        String b = " vs Second Team: ";

        for (int i = 0; i < firstTeam.length; i++) {
            if (firstTeam[i] == null) {
                a += "Empty, ";
            } else {
                a += firstTeam[i].toString() + ", ";
            }
        }

        for (int i = 0; i < secondTeam.length; i++) {
            if (secondTeam[i] == null) {
                b += "Empty, ";
            } else {
                b += secondTeam[i].toString() + ", ";
            }
        }

        return a.substring(0, a.length() - 2) + b.substring(0, b.length() - 2);
    }

    /**
    * this is a method to predict the team with a higher possiblity to win.
    */
    public void compareTeams() {

        int lth;

        if (firstTeam.length > secondTeam.length) {
            lth = secondTeam.length;
        } else {
            lth = firstTeam.length;
        }

        int firstWin = 0;
        int secondWin = 0;

        for (int i = 0; i < lth; i++) {

            if (firstTeam[i] == null && secondTeam[i] == null) {
                firstWin++;
                secondWin++;
            } else if (firstTeam[i] == null) {
                secondWin++;
            } else if (secondTeam[i] == null) {
                firstWin++;
            } else {
                if (firstTeam[i].compareTo(secondTeam[i]) > 0) {
                    firstWin++;
                }
                if (firstTeam[i].compareTo(secondTeam[i]) < 0) {
                    secondWin++;
                }
            }
        }

        firstWin += firstTeam.length - lth;
        secondWin += secondTeam.length - lth;

        if (firstWin > secondWin) {
            System.out.println("The first team will probably win.");
        } else if (firstWin < secondWin) {
            System.out.println("The second team will probably win.");
        } else {
            System.out.println("It is an even match.");
        }
    }

    /**
    * this is a method that simulates the fight between the Pets of team1 and team2.
    */
    public void battle() {

        int index1 = 0;
        int index2 = 0;

        while (index1 < firstTeam.length && index2 < secondTeam.length) {

            firstTeam[index1].attackPet(secondTeam[index2]);
            secondTeam[index2].attackPet(firstTeam[index1]);

            if (firstTeam[index1].hasFainted()) {
                firstTeam[index1] = null;
                index1++;
            }
            if (secondTeam[index2].hasFainted()) {
                secondTeam[index2] = null;
                index2++;
            }
        }

        if (index1 == firstTeam.length && index2 == secondTeam.length) {
            System.out.println("Both teams fainted.");
        }
        if (index2 == secondTeam.length) {
            System.out.println("The first team won!");
        }
        if (index1 == firstTeam.length) {
            System.out.println("The second team won!");
        }
    }

    /**
     * this is the main method.
     * @author minkun
     * @version 1.0
     * @param args is the command-line arguments in a String array
     */
    public static void main(String[] args) {

        Pet aaa = new Skunk();
        Pet bbb = new Hippo();
        Pet ccc = new Turtle();
        Pet kkk = new Skunk(6, 4, 2);
        Pet hhh = new Hippo(9, 5, 3);
        Pet lll = new Turtle(4, 10, true);

        aaa.toString();
        bbb.toString();
        ccc.toString();
        kkk.toString();
        hhh.toString();
        lll.toString();

        Pet[] team1 = {aaa, bbb, null, ccc, null};
        Pet[] team2 = {null, kkk, null, hhh, lll};

        PetBattlefield haha = new PetBattlefield(team1, team2);

        haha.toString();
        haha.compareTeams();
        haha.battle();

    }
}
