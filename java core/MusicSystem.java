interface Playable {
    
    void play();
    void stop();
}

class MP3Player implements Playable {
    boolean isPlaying = false;

    public void play() {
        if(!isPlaying){
            System.out.println("MP3 player is playing.");
            isPlaying = true;
        }
        else{
            System.out.println("MP3 player is already playing.");
            isPlaying = false;
        }
        
    }
    public void stop() {
        if(isPlaying){
            System.out.println("MP3 player is stopped.");
            isPlaying = false;
        }
        else{
            System.out.println("MP3 player is already stopped.");
            isPlaying = true;
        }
        
    }
}

class Radio implements Playable {
    boolean isPlaying = false;

    public void play() {
        if(!isPlaying){
            System.out.println("Radio is playing.");
            isPlaying = true;
        }
        else{
            System.out.println("Radio is already playing.");
            isPlaying = false;
        }
        
    }
    public void stop() {
        if(isPlaying){
            System.out.println("Radio is stopped.");
            isPlaying = false;
        }
        else{
            System.out.println("Radio is already stopped.");
            isPlaying = true;
        }
        
    }
}

public class MusicSystem {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        Radio radio = new Radio();

        mp3Player.play();
        mp3Player.stop();
        mp3Player.stop();

        radio.play();
        radio.play();
        radio.stop();
    }
}