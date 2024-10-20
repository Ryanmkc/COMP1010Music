package objects;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Displayaudio {
    String audioPath;
    Clip audioClip;  

    public Displayaudio() {}

    public Displayaudio(String p) {
        audioPath = p;
    }

    public void loadAudio() {
        try {
            File audioFile = new File(audioPath);

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            audioClip = AudioSystem.getClip();

            audioClip.open(audioStream);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void play() {
            audioClip.start();  
    }

    public void stop() {
            audioClip.stop();
    }

    public void loop(int t) {
            audioClip.loop(t);
    }
}
