package objects;
import java.util.ArrayList;

import java.awt.image.BufferedImage;
import java.sql.Time;

import javax.imageio.ImageIO;

public class Playlist {

    String imagePath;

    // String name; the name of the class is the username no need to double up
    User creator;
    String image; // change this to an image
    Date made;
    Integer numberOfSongs;
    String description;

    // add multiple users

    ArrayList<song> songs = new ArrayList<song>();
    ArrayList<User> collaborators = new ArrayList<User>();
    time length;

    public Playlist(String imagePath, User creator, Date made, Integer numberOfSongs, String description, time length) {
        this.imagePath = imagePath;
        this.creator = creator;
        this.made = made;
        this.numberOfSongs = numberOfSongs;
        this.description = description;
        this.songs = new ArrayList<>();
        this.collaborators = new ArrayList<>();
        this.length = length;
    }
}

