import java.util.ArrayList;

public class Album {
    String title;
    Artist artist;
    Song start;

    Album(String title, Artist artist, Song start) {
        //this.songs = new ArrayList<>();
    }

    // ArrayList<Song> songs; // change this to start with SONG START and delete

    Album(String title, Artist artist, Song start) {
        this.title = title;
        this.artist = artist;
        this.start = start;
        //this.songs = new ArrayList<>();
    }

    Album(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
        //this.songs = new ArrayList<>();
    }

    // Adds song to an album and sets the album reference for the song

    //void addSong(Song song) { // change this bit
    //song = new Song(song.getSongTitle(), song.getArtist(), this);
    //songs.add(song);
    //}

    String getSongs() {

        String empty = " ";

        if(this.start == null){
            return empty;
        }

        String songName = this.start.getSongTitle();

        return songName + ", " + start.next.getSongTitle();

    }

    String getTitle() {
        return title;
    }
}