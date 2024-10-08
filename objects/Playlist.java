package objects;
import java.util.ArrayList;

public class Playlist {
    // String name; the name of the class is the username no need to double up
    User creator;
    String image; // change this to an image
    Date made;
    Integer numberofsongs;
    String description;

    // add multiple users

    ArrayList<Song> songs = new ArrayList<Song>();
    ArrayList<User> Collaborators = new ArrayList<User>();
    time length;
}

