package objects;
import java.util.ArrayList;

public class User {

    String firstname;
    String secondname;
    // String username; the name of the class is the username no need to double up
    String password;
    String bio;

    ArrayList<Artist> followingArtist = new ArrayList<Artist>();
    ArrayList<User> followingUser = new ArrayList<User>();
    ArrayList<User> followedByUser = new ArrayList<User>();

    ArrayList<Playlist> created = new ArrayList<Playlist>();
    ArrayList<Playlist> collabing = new ArrayList<Playlist>();
    ArrayList<Playlist> followingPlaylist = new ArrayList<Playlist>();

    ArrayList<Album> likedAlbum = new ArrayList<Album>();
    ArrayList<song> likedSong = new ArrayList<song>();

    Date dob;
    boolean isMinor;
    String email;
    
}