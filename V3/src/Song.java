public class Song {
    String songTitle;
    Artist artist;
    Album album;
    Song nextSong;  // Reference to the next song (for recursive structure)

    // Constructor for a song without an album (a single)
    Song(String songTitle, Artist artist) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.album = null;
        this.nextSong = null; // No album, song is a Single, nextSong is null
    }

    // Constructor for a song with an album
    Song(String songTitle, Artist artist, Album album) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.album = album;
        this.nextSong = null; // Default next song is null
    }

    // Set the album for the song
    public void setAlbum(Album album) {
        this.album = album;
    }

    // Getters for writing to CSV
    String getSongTitle() {
        return songTitle;
    }
    Artist getArtist() {
        return artist;
    }
    Album getAlbum() {
        return album;
    }

    // Sets next song in recursive list
    void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    // Gets next song in recursive list
    Song getNextSong() {
        return nextSong;
    }

    // Prints song name + album/single + artist name
    public String toString() {
        if (album != null) {
            return songTitle + " by " + artist.getName() + " from the album \"" + album.getTitle() + "\"";
        } else {
            return songTitle + " by " + artist.getName() + " (Single)";
        }
    }
}