public class Song {
    private String title;
    private String artist;
    private int durationSeconds;
    private MusicGenre genre;

    public Song(String title, String artist, int durationSeconds, MusicGenre genre){
        setTitle(title);
        setArtist(artist);
        setDurationSeconds(durationSeconds);
        setGenre(genre);
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("Titel måste anges.");
        }
        this.title = title;
    }

    public void setArtist(String artist) {
        if (artist == null || artist.isBlank()){
            throw new IllegalArgumentException("Artist måste anges.");
        }
        this.artist = artist;
    }

    public void setGenre(MusicGenre genre) {
        if (genre == null){
            throw new IllegalArgumentException("Genre måste anges.");
        }
        this.genre = genre;
    }

    public void setDurationSeconds(int durationSeconds) {
        if (durationSeconds <= 0){
            throw new IllegalArgumentException("Ogiltig duration.");
        }
        this.durationSeconds = durationSeconds;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public MusicGenre getGenre() {
        return genre;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public String getDurationText(){
        String minutes = String.valueOf(durationSeconds / 60);
        String seconds = String.valueOf(durationSeconds % 60);
        if ((durationSeconds % 60) < 10){ // Lägger till 0 före siffran om seconds är mindre än 10.
            seconds = "0" + String.valueOf(durationSeconds % 60);
        }
        return minutes + ":" + seconds;
    }

    public void printInfo() {
        System.out.println(title + " av " + artist + ". Låten är " + durationSeconds + " sekunder.");
    }

    public boolean isLongSong() {
        return durationSeconds >= 190;
    }

    @Override
    public String toString(){
        return title + ", " + artist + ", " + durationSeconds + " sekunder, " + genre + " låt.";
    }

}
