import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create the artists
        Artist arcticMonkeys = new Artist("Arctic Monkeys");
        Artist frankOcean = new Artist("Frank Ocean");
        Artist theWeeknd = new Artist("The Weeknd");
        Artist m83 = new Artist("M83");
        Artist tameImpala = new Artist("Tame Impala");

        // Creates Albums / Singles / Songs
        Album amAlbum = new Album("AM", arcticMonkeys);
        amAlbum.addSong(new Song("R U Mine?", arcticMonkeys));
        amAlbum.addSong(new Song("Snap Out of It", arcticMonkeys));
        amAlbum.addSong(new Song("Do I Wanna Know?", arcticMonkeys));

        Album currents = new Album("Currents", tameImpala);
        currents.addSong(new Song("Let It Happen", tameImpala));
        currents.addSong(new Song("The Less I Know The Better", tameImpala));
        currents.addSong(new Song("The Moment", tameImpala));

        Song novacane = new Song("Novacane", frankOcean);

        Album afterHours = new Album("After Hours", theWeeknd);
        afterHours.addSong(new Song("Blinding Lights", theWeeknd));

        Album hurryUpWereDreaming = new Album("Hurry Up We're Dreaming", m83);
        hurryUpWereDreaming.addSong(new Song("Midnight City", m83));
        hurryUpWereDreaming.addSong(new Song("Wait", m83));


        // Creates playlist, adds songs / albums
        Playlist playlist = new Playlist();
        playlist.addAlbum(amAlbum);
        playlist.addSong(novacane);
        playlist.addAlbum(afterHours);
        playlist.addAlbum(hurryUpWereDreaming);
        playlist.addAlbum(currents);

        // Saves CSV
        playlist.savePlaylist();

        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);
        boolean programRunning = true;  // Keeps the loop running

        // Keeps prompting for commands until the user decides to stop
        while (programRunning) {
            System.out.println("Enter a command (Current, Skip, Previous, Shuffle, Stop):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("current")) {
                playlist.current();
            } else if (input.equalsIgnoreCase("skip")) {
                playlist.nextSong();
            } else if (input.equalsIgnoreCase("previous")) {
                playlist.previousSong();
            } else if (input.equalsIgnoreCase("shuffle")) {
                playlist.shufflePlay();
            } else if (input.equalsIgnoreCase("stop")) {
                programRunning = false;  // Exits loop
                System.out.println("Stopping the Music Manager");
                playlist.deleteCSV(); // Deletes CSV
            }
        }

        scanner.close();
    }
}