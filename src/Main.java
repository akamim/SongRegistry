public class Main {
    static void main(String[] args) {
        Song song1 = new Song(
                "LEMONADE",
                "aespa",
                187);
        Song song2 = new Song(
                "Bass Persuades",
                "Miley Cyrus",
                202);

        song1.printInfo(); // Skriver ut sparad info om song1
        song2.printInfo();

        System.out.println("\n");

        System.out.println("Artist: " + song1.getArtist()); // Skriver ut artist namn på song1
        System.out.println("Title of song: " + song1.getTitle() + "\n"); // Skriver ut song1:s titel

        song1.setDurationsSeconds(160); // Ändrar låtlängd på song1 till 160s
        song1.printInfo();

        song1.setDurationsSeconds(-10); // Ogiltigt värde, gör inget.
        song1.printInfo();

        song1.setDurationsSeconds(187); // Ändrar tillbaka till låtens riktiga låtlängd

        System.out.println("\n");

        if (song1.isLongSong()){ // Baserad på om låten är >= 240 sekunder.
            System.out.println(song1.getTitle() + " är en lång låt (minst 4 min)." + " Låten är "
                    + song1.getDurationSeconds() + " sekunder.");
        } else {
            System.out.println(song1.getTitle() + ":s låtlängd är kortare än 4 min." + " Låten är "
                    + song1.getDurationSeconds() + " sekunder.");
        }
    }
}
