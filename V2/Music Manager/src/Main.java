public class Main {
    public static void main(String[] args) throws Exception {
        // Create the artists
        Artist arcticMonkeys = new Artist("Arctic Monkeys");
        Artist frankOcean = new Artist("Frank Ocean");
        Artist theWeeknd = new Artist("The Weeknd");

        // Creates Albums / Singles / Songs
        Album amAlbum = new Album("AM", arcticMonkeys);
        amAlbum.addSong(new Song("R U Mine?", arcticMonkeys));
        amAlbum.addSong(new Song("Snap Out of It", arcticMonkeys));
        amAlbum.addSong(new Song("Do I Wanna Know?", arcticMonkeys));

        Song novacane = new Song("Novacane", frankOcean);

        Album afterHours = new Album("After Hours", theWeeknd);
        afterHours.addSong(new Song("Blinding Lights", theWeeknd));

        // Creates playlist, adds songs / albums
        Playlist playlist = new Playlist();
        playlist.addAlbum(amAlbum);
        playlist.addSong(novacane);
        playlist.addAlbum(afterHours);

        // Saves CSV
        playlist.savePlaylist();
        
        // Uncomment one at a time to Run:

        // playlist.startPlaylist();  // Start from first song

        // playlist.nextSong();        // Skip song

        // playlist.previousSong();    // Go previous song

        // playlist.shufflePlay();     // Shuffle playlist
    }
}