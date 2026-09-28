public enum MusicGenre {
    POP("pop"),
    HIPHOP("hiphop"),
    KPOP("kpop"),
    ROCK("rock"),
    RNB("R&B"),
    COUNTRY("country"),
    ELECTRONIC("elektronisk"),
    EDM("EDM"),
    JAZZ("jazz"),
    CLASSICAL("klassisk "),
    METAL("metal"),
    LATIN("latin"),
    BLUES("blues"),
    REGGAE("reggae"),
    FOLK("folk"),
    ALTERNATIVE("alternativ"),
    INDIE("indie");

    private final String textGenre;

    MusicGenre(String textGenre) {
        this.textGenre = textGenre;
    }

    public String getTextGenre() {
        return textGenre;
    }
}
