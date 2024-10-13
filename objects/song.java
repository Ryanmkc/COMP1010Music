package objects;
import java.util.ArrayList;

import javax.sound.sampled.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.sql.Time;

public class song {
    //String name; the name of the class is the username no need to double up
// add album or no album
    Artist musicianName;
    Album inside;
    song next;

    Date released;
    ArrayList<String> feat = new ArrayList<String>();
    time length;
    Boolean explicit;
    String lyrics;
    
    String imagePath;
    String audioPath;
    //String image; // change this to an image
    //String Audio; // change this to an audio
    
    public song(Artist musicianName, Album inside, Date released, time length, Boolean explicit, String lyrics, String imagePath, String audioPath) {
        this.musicianName = musicianName;
        this.inside = inside;
        this.released = released;
        this.feat = new ArrayList<>();
        this.length = length;
        this.explicit = explicit;
        this.lyrics = lyrics;
        this.imagePath = imagePath;
        this.audioPath = audioPath;
    }
}

