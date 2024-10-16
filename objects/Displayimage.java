package objects;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Displayimage {
    String imagePath;
    BufferedImage image;

    // Constructor with image path
    public Displayimage(String imagePath) {
        this.imagePath = imagePath;
    }

    // Method to load the image
    public BufferedImage loadImage() {
        try {
            image = ImageIO.read(new File(imagePath));  // Load image from the provided path
            if (image != null) {
                System.out.println("img check");
            } else {
                System.out.println("Failed to load the image. ImageIO.read() returned null.");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
            e.printStackTrace();
        }
        return image;
    }

    // Getter for the image
    public BufferedImage getImage() {
        return image;
    }
}
