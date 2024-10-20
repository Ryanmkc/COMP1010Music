package objects;
import java.util.ArrayList;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Artist {

    String imagePath;
    // add bands
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
