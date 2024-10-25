
public class Main {
    public static void main(String[] args) throws Exception {


        String[] objectcollection = {}; // You can pass arguments if needed
        ObjectCollection.main(objectcollection);  // Calling ClassTwo's main method

        // Saves CSV
        playlist.savePlaylist();
        
        
        // Uncomment one at a time to Run:

        // v Start Playlist v (Do Not Uncomment This Line)
        //playlist.startPlaylist();

        // v Skip Song v (Do Not Uncomment This Line)
        // playlist.nextSong();

        // v Previous Song v (Do Not Uncomment This Line)
        // playlist.previousSong();

        // v Shuffle v (Do Not Uncomment This Line)
        // playlist.shufflePlay();
    }
}