
import java.util.ArrayList;

public class Artist {
    String name;
    ArrayList<Album> Albums = new ArrayList<Album>();

    Artist(String name) {}

    // Constructor
    Artist(String name) {
        this.name = name;
    }

    // Returns name of the artist
    String getName() {
        return name;
    }
}