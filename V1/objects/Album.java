package objects;
import java.util.ArrayList;

import java.awt.image.BufferedImage;
import java.sql.Time;

import javax.imageio.ImageIO;

public class Album {

    String imagePath;
    // String name; the name of the class is the username no need to double up
    Artist musicianName;
   // String image; // change this to an image
    String genre;
    Date released;
    Integer numberOfSongs;
    Boolean explicit;
    String description;

    ArrayList<song> songs = new ArrayList<song>();

    Boolean single;
    ArrayList<String> feat = new ArrayList<String>();
    time length;
    
    public Album(String imagePath, Artist musicianName, String genre, Date released, Integer numberOfSongs, Boolean explicit, String description, Boolean single, time length) {
        this.imagePath = imagePath;
        this.musicianName = musicianName;
        this.genre = genre;
        this.released = released;
        this.numberOfSongs = numberOfSongs;
        this.explicit = explicit;
        this.description = description;
        this.songs = new ArrayList<>();
        this.feat = new ArrayList<>();
        this.single = single;
        this.length = length;
    }

}
