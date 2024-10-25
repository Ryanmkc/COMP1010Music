import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Playlist {
    ArrayList<Song> songs;
    int currentIndex;

    // Initialize playlist
    Playlist() throws Exception {
        songs = new ArrayList<>();
        loadPlaylist();
        if (songs.isEmpty()) {
            currentIndex = 0; // Defaults at 0
        }
    }

    // Adds songs to playlist
    void addSong(Song song) {
        songs.add(song);
    }

    // Adds albums to playlist
    void addAlbum(Album album) {
        songs.addAll(album.getSongs());
    }

    // Start playlist from the first song
    void current() {
        System.out.println("Now Playing: " + songs.get(currentIndex)); // Play song at current index
    }

    // Skip to next song and update index
    void nextSong() throws Exception {
        currentIndex = (currentIndex + 1) % songs.size();
        current();
        savePlaylist();
    }

    // Go back to the previous song and update index
    void previousSong() throws Exception {
        currentIndex = (currentIndex - 1 + songs.size()) % songs.size();
        current();
        savePlaylist();
    }

    // Shuffle playlist and update index
    void shufflePlay() throws Exception {
        currentIndex = (int) (Math.random() * songs.size());
        current();
        savePlaylist();
    }

    // Saves current index and playlist to the CSV file, overwriting each time
    void savePlaylist() throws Exception {
        FileWriter writer = new FileWriter("MusicLibraryCSV.csv", false); // Overwrite the file

        // Writes current index as first line
        writer.write(currentIndex + "\n");

        // Writes song data to CSV file
        for (Song song : songs) {
            String albumName = (song.getAlbum() != null) ? song.getAlbum().getTitle() : "Single";
            writer.write(song.getSongTitle() + "," + song.getArtist().getName() + "," + albumName + "\n");
        }

        writer.close();
    }
    // Method to delete the CSV file
    void deleteCSV() {
        File file = new File("MusicLibraryCSV.csv");
        if (file.exists()) {
            file.delete();  // Delete the file if it exists
        }
    }    

    // Loads the playlist from the CSV file
    void loadPlaylist() throws Exception {
        File file = new File("MusicLibraryCSV.csv");

        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            // Reads currentIndex from line 1 of CSV file
            line = reader.readLine();
            if (line != null && !line.isEmpty()) {
                currentIndex = Integer.parseInt(line);  // Set currentIndex
            } else {
                currentIndex = 0;  // Default to 0 if no valid index is found
            }

            // Reads the rest of the playlist data from CSV
            while ((line = reader.readLine()) != null) {
                String[] songData = line.split(",");
                String songTitle = songData[0];
                String artistName = songData[1];
                String albumTitle = songData[2];

                Artist artist = new Artist(artistName);
                Album album = albumTitle.equals("Single") ? null : new Album(albumTitle, artist);
                Song song = new Song(songTitle, artist, album);

                songs.add(song);  // Add the song to the playlist
            }
            reader.close();
        }
    }
}