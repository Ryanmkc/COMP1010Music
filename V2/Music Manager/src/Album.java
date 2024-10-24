import java.util.ArrayList;

public class Album {
    String title;
    Artist artist;
    ArrayList<Song> songs;

    Album(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    // Adds song to an album and sets the album reference for the song
    void addSong(Song song) {
        song = new Song(song.getSongTitle(), song.getArtist(), this);
        songs.add(song);
    }

    ArrayList<Song> getSongs() {
        return songs;
    }

    String getTitle() {
        return title;
    }
}