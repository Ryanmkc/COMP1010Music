package objects;
import java.util.ArrayList;

public class User {

    String firstname;
    String secondname;
    String username;
    String password;

    ArrayList<Artist> followingArtist = new ArrayList<Artist>();
    ArrayList<User> followingUser = new ArrayList<User>();
    ArrayList<User> followedByUser = new ArrayList<User>();
    ArrayList<playList> created = new ArrayList<playList>();
    ArrayList<playList> collabing = new ArrayList<playList>();
    ArrayList<playList> followingPlaylist = new ArrayList<playList>();
    ArrayList<Album> likedAlbum = new ArrayList<Album>();
    ArrayList<song> likedSong = new ArrayList<song>();

    Date dob;
    boolean explicitcontentallowed;
    String email;
    
    // add arraylist of fav artists and saved playlists
    // i need to make objects for both
}