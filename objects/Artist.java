package objects;
import java.util.ArrayList;

public class Artist {
    String firstname;
    String secondname;
    // String username; the name of the class is the username no need to double up
    Date dob;
    String email;
    String password;
    Integer monthlyListners;
    String bio;
    ArrayList<Album> createdAlbums = new ArrayList<Album>();
   
}
