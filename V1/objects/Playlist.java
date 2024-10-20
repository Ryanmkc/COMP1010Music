package objects;
import java.util.ArrayList;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Playlist {

    String imagePath;

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

