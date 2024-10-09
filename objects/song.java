package objects;
import java.util.ArrayList;

import javax.sound.sampled.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Song {
    //String name; the name of the class is the username no need to double up
// add album or no album
    Artist MusicianName;
    Album inside;
    Song next;

    Date released;
    ArrayList<String> feat = new ArrayList<String>();
    time length;
    Boolean explicit;
    String lyrics;
    
    String imagePath;
    String audioPath;
    //String image; // change this to an image
    //String Audio; // change this to an audio
    
}
