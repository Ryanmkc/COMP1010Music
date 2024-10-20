public class Song {
    String songTitle;
    Artist artist;
    Album album;

    // Constructor for a song without an album (a single)
    Song(String songTitle, Artist artist) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.album = null; // No album, song is a Single
    }

    // Constructor for a song with an album
    Song(String songTitle, Artist artist, Album album) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.album = album;
    }

    String getSongTitle() {
        return songTitle;
    }

    Artist getArtist() {
        return artist;
    }

    Album getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        if (album != null) {
            return songTitle + " by " + artist.getName() + " from the album \"" + album.getTitle() + "\"";
        } else {
            return songTitle + " by " + artist.getName() + " (Single)";
        }
    }
}