import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("LEMONADE", "aespa", 187));
        songs.add(new Song("Bass Persuades", "Miley Cyrus", 202));
        songs.add(new Song("Good For The Soul", "Madonna", 188));
        songs.add(new Song("Crash Out", "Tinashe", 190));

        System.out.println("Antal låter: " + songs.size());

        for (Song song : songs){
            song.printInfo();
        }

        System.out.println("\n");

        for (Song song : songs){
            if (song.isLongSong()){
                System.out.println(song);
            }
        }

        System.out.println("\n");

        int sumDuration = 0;
        for (Song song : songs){
            sumDuration += song.durationSeconds;
        }

        System.out.println("Total längd: " + sumDuration);

        int indexLongestSong = 0;

        for (int i = 0; i < songs.size(); i++){
            if (songs.get(i).getDurationSeconds() > songs.get(indexLongestSong).getDurationSeconds()){
                indexLongestSong = i;
            }
        }
        System.out.println(songs.get(indexLongestSong).getTitle() + " är längst.");

        System.out.println("\n");

        for (int i = 0; i < songs.size(); i++){
            Song song = songs.get(i);
            System.out.println(i + 1 + ". " + song);
        }
    }
}
