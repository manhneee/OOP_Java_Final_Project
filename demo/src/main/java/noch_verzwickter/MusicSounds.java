package noch_verzwickter;

import java.net.URL;

import javax.sound.sampled.*;

public class MusicSounds {
    Clip clip;
    URL soundURL[] = new URL[10];

    public MusicSounds() {
        soundURL[0] = getClass().getResource("/Music/Give My Regards To Broadway - Freedom Trail Studio.wav");
        soundURL[1] = getClass().getResource("/Music/Quarter Mix - Freedom Trail Studio.wav");
        soundURL[2] = getClass().getResource("/Music/320181__dland__hint.wav");
        soundURL[3] = getClass().getResource("/Music/card_sound.wav");
        soundURL[4] = getClass().getResource("/Music/341732__sgtpepperarc360__wrong-answer.wav");
        soundURL[5] = getClass().getResource("/Music/256128__jimhancock__tada.wav");
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
    public void setVolume(float volume) {
        if (clip != null) {
            try {
                FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                float min = volumeControl.getMinimum();
                float max = volumeControl.getMaximum();
                float scaledVolume = min + (max - min) * volume; // Scale volume (0.0 to 1.0)
                volumeControl.setValue(scaledVolume);
            } catch (IllegalArgumentException e) {
                System.out.println("Volume control not supported.");
            }
        }
    }
    public boolean isPlaying() {
        return clip != null && clip.isRunning();
    }
}
