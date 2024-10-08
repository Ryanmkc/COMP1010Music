package objects;
import java.util.ArrayList;


public class User {

    String firstname;
    String secondname;
    // String username; the name of the class is the username no need to double up
    String password;
    String bio;

    ArrayList<Artist> followingArtist = new ArrayList<Artist>();
    ArrayList<Album> likedAlbum = new ArrayList<Album>();

    ArrayList<User> followingUser = new ArrayList<User>();
    ArrayList<User> followedByUser = new ArrayList<User>();

    ArrayList<Playlist> created = new ArrayList<Playlist>(); // every usee will have a 2 liked playlist 
    // ugh I need to make a liked playlist for podcasts
    ArrayList<Playlist> collabing = new ArrayList<Playlist>();
    ArrayList<Playlist> followingPlaylist = new ArrayList<Playlist>();

    ArrayList<studio> followingStudio = new ArrayList<studio>();
    ArrayList<Podcast> followedingPodcast = new ArrayList<Podcast>();
    //ArrayList<PodcastEp> followedByUser = new ArrayList<PodcastEp>(); this will be in liked playlist

    Date dob;
    Boolean isMinor;
    String email;
    
}