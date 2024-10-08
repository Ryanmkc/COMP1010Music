package objects;
import java.util.ArrayList;

public class Podcast {
    // String name; the name of the class is the username no need to double up

    studio studioName;
   // String image; // change this to an image
    Date created;
    
    Integer numberofeps;
    Boolean explicit;
    String bio;

    Double Rating;
    Integer Ratings;
    
    ArrayList<String> genre = new ArrayList<String>();
    ArrayList<PodcastEp> Episodes = new ArrayList<PodcastEp>();
}
