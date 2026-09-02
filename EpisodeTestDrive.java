class Episode {
    int serieNumber;
    int episodeNumber;

    void skipIntro(){
        System.out.println("Skipping intro...");
    }
    void play(){
        System.out.println("Playing episode " + episodeNumber);
    }

    void skipToNext(){
        System.out.println("Loading next episode... ");
    }
}

public class EpisodeTestDrive {
    public static void main(String[] args) {
        
        Episode episode = new Episode();
        episode.serieNumber = 4;
        episode.episodeNumber = 3;
        episode.play();
        episode.skipIntro();
    }
}
