package objects;
import java.util.ArrayList;

public class Album {
    // String name; the name of the class is the username no need to double up
    Artist MusicianName;
   // String image; // change this to an image
    String genre;
    Date released;
    Integer numberofsongs;
    Boolean explicit;
    String description;

    ArrayList<Song> songs = new ArrayList<Song>();

    Boolean single;
    ArrayList<String> feat = new ArrayList<String>();
    time length;
    
}
