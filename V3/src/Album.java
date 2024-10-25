import java.util.ArrayList;

public class Album {
    String title;
    Artist artist;
    Song firstSong; //First node/song of album

    Album(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
        this.firstSong = null;
    }

    //Adds a song to the album and sets the next song in the chain
    void addSong(Song song) {
        if (firstSong == null) {
            firstSong = song; // Sets the first song
        } else {
            Song current = firstSong;
            while (current.getNextSong() != null) {
                current = current.getNextSong();
            }
            current.setNextSong(song);
        }
        song.setAlbum(this);
    }

    // List of songs in linked-list structure of album
    ArrayList<Song> getSongs() {
        ArrayList<Song> songs = new ArrayList<>();
        Song current = firstSong;
        while (current != null) {
            songs.add(current);
            current = current.getNextSong();
        }
        return songs;
    }

    String getTitle() {
        return title;
    }
}