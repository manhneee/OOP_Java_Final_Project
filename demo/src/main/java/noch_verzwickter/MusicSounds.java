package noch_verzwickter;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineListener;

public class MusicSounds {
    Clip clip;
    URL soundURL[] = new URL[10];

    public MusicSounds() {
        soundURL[0] = getClass().getResource("/Music/Give My Regards To Broadway - Freedom Trail Studio.wav");
        soundURL[1] = getClass().getResource("/Music/Quarter Mix - Freedom Trail Studio.wav");
        soundURL[2] = getClass().getResource("/Music/320181__dland__hint.wav");
        soundURL[3] = getClass().getResource("/Music/card_sound.wav");
    }

    public void setFile(int i) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {
            System.err.println("Error loading audio file: " + soundURL[i]);
            e.printStackTrace();
        }
    }

    public void play() {
        clip.start();
    }

    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {
        clip.stop();
    }

    public void addLineListener(@SuppressWarnings("exports") LineListener listener) {
        if (clip != null) {
            clip.addLineListener(listener);
        }
    }

    public boolean isPlaying() {
        return clip != null && clip.isRunning();
    }
}
