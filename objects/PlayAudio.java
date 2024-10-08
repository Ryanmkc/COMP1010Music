package objects;
import java.util.ArrayList;

import javax.sound.sampled.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class PlayAudio {
    String Audio;

    PlayAudio(){}

    PlayAudio(String i){
        Audio = i;
    }

    private void loadImage() {
        
            image = ImageIO.read(new File(imagePath));  // Load image from the provided path
        
    }
}
