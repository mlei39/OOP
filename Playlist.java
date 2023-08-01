import java.util.Scanner;

public class Playlist {


    public static void addPlaylistInfo(Scanner scan) {

        System.out.print("Enter number of songs in playlist: ");
        int numSongs = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter a playlist name: ");
        String playlistName = scan.nextLine();

        System.out.printf("Playlist created successfully. "
            + "Here are the details:\nNumber of Songs: %d\nName: %s", numSongs, playlistName);

    }

    public static int[] genreTally(String[] genreArray, String[] genres) {

        System.out.println("The following types of genres are in your playlist:");
        int[] counting = new int[genres.length];

        for (int a = 0; a < genres.length; a++) {

            for (int b = 0; b < genreArray.length; b++) {

                if (genres[a].equals(genreArray[b])) {
                    counting[a]++;
                }
            }
        }

        for (int c = 0; c < genres.length; c++) {
            System.out.printf("%s %d\n", genres[c], counting[c]);
        }

        return counting;
    }

    public static void playlistScores(String[] playlist1, String[] playlist2, String[] genres) {

        int score1 = 0;
        int score2 = 0;

        int[] counting1 = genreTally(playlist1, genres);
        int[] counting2 = genreTally(playlist2, genres);

        for (int x = 0; x < counting1.length; x++) {
            score1 += counting1[x] * x;
            //System.out.println("Score1 = " + score1);
        }

        for (int y = 0; y < counting2.length; y++) {
            score2 += counting2[y] * y;
            //System.out.println("Score2 = " + score2);
        }

        if (score1 > score2) {
            System.out.println("The first playlist is likely to have more listeners than the second.");
        } else if (score1 < score2) {
            System.out.println("The second playlist is likely to have more listeners than the first.");
        } else {
            System.out.println("The two playlists are predicted to perform equally well.");
        }

    }

    public static void main(String[] args) {

        String[] genres = {"Rap", "Pop", "Classical", "Hip Hop", "Rock", "Lo Fi"};
        String[] playlist1 = {"Rap", "Pop", "Pop", "Classical", "Classical", "Hip Hop", "Rock"};
        String[] playlist2 = {"Pop", "Pop", "Classical", "Rock", "Rock", "Lo Fi", "Lo Fi"};

        Scanner scan = new Scanner(System.in);

        addPlaylistInfo(scan);
        genreTally(playlist1, genres);
        genreTally(playlist2, genres);
        playlistScores(playlist1, playlist2, genres);

    }

}