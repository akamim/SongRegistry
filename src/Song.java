public class Song {
    private String title;
    private String artist;
    int durationSeconds;

    public Song(String title, String artist, int durationSeconds){
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationsSeconds(int durationSeconds){
        if (durationSeconds > 0){
            this.durationSeconds = durationSeconds;
        }
    }

    public void printInfo() {
        System.out.println(title + " av " + artist + ". Låten är " + durationSeconds + " sekunder.");
    }

    public boolean isLongSong() {
        return durationSeconds >= 240;
    }
}
