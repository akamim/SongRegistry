import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        // Skapar minst fyra Song-objekt + lagrar dem i ArrayList<Song>
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("LEMONADE", "aespa", 187, MusicGenre.KPOP));
        songs.add(new Song("Bass Persuades", "Miley Cyrus", 202, MusicGenre.POP));
        songs.add(new Song("Good For The Soul", "Madonna", 188, MusicGenre.POP));
        songs.add(new Song("Crash Out", "Tinashe", 190, MusicGenre.HIPHOP));

        // Null-genre
        try {
            songs.add(new Song("title", "artist", 190, null));
        } catch (RuntimeException e) {
            System.out.println("Ogiltig inmatning. " + e.getMessage());
        }

        emptyLine();

        System.out.println("Antal låtar: " + songs.size());

        emptyLine();

        // Loopa med for-each: Skriver ut låtar och dess info
        for (Song song : songs){
            song.printInfo();
        }

        emptyLine();

        // Skriver ut låten om den är längre än 190 sekunder
        System.out.println("___ Låtar som är längre än 190 sekunder ___");
        for (Song song : songs){
            if (song.isLongSong()){
                System.out.println(song);
            }
        }

        emptyLine();

        // Räknar total längd
        int sumDuration = 0;
        for (Song song : songs){
            sumDuration += song.getDurationSeconds();
        }

        // Skriver ut total längd
        System.out.println("Total längd: " + sumDuration + " sekunder.");

        emptyLine();

        // Hitta längsta låten + skriver ut den
        int indexLongestSong = 0;

        for (int i = 0; i < songs.size(); i++){
            if (songs.get(i).getDurationSeconds() > songs.get(indexLongestSong).getDurationSeconds()){
                indexLongestSong = i;
            }
        }
        System.out.println(songs.get(indexLongestSong).getTitle() + " är längst.");

        emptyLine();

        // Skriver ut en numrerad lista med vanlig for-loop
        for (int i = 0; i < songs.size(); i++){
            Song song = songs.get(i);
            System.out.println(i + 1 + ". " + song);
        }

        emptyLine();

        // Filtrerar och skriver ut KPOP-låtar
        for (Song song : songs){
            if (song.getGenre() == MusicGenre.KPOP){
                System.out.println(song.getTitle() + " är en KPOP låt.");
            }
        }

        emptyLine();

        // Skriver ut låt 1:s längd som MM:SS
        System.out.println(songs.get(0).getTitle() + " är " + songs.get(0).getDurationText());

    }

    public static void emptyLine(){
        System.out.print("\n");
    }
}
