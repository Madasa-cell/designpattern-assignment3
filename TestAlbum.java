/* TestAlbum.java */
public class TestAlbum {

    public static void main(String[] args) {
        Album[] albums = {
                new Album("Hotel California", "Eagles", Album.Genre.ROCK),
                new Album("Best of", "J.S. Bach", Album.Genre.CLASSICAL),
                new Album("Arrival", "ABBA", Album.Genre.POP),
                new Album("Hemma hos 1", "Janne & Kjell", Album.Genre.OTHER),
                new Album("White album", "Beatles", Album.Genre.POP),
                new Album("Best of", "Mozart", Album.Genre.CLASSICAL),
                new Album("Thank you for the music", "ABBA", Album.Genre.POP)
        };
        System.out.println("|-----|-----|-----|-----|-----|-----|-----|");
        GenreFilter gf = new FilterOut();
        System.out.println("No POP Albums");
        printAlbums(albums, gf);
        System.out.println("|-----|-----|-----|-----|-----|-----|-----|");
        gf = new FilterToOnly();
        System.out.println("Only POP Albums");
        printAlbums(albums, gf);
        System.out.println("|-----|-----|-----|-----|-----|-----|-----|");
        System.out.println("Only ROCK & CLASSICAL Albums - Advanced");
        printAlbumsAdv(albums, gf, Album.Genre.ROCK);
        printAlbumsAdv(albums, gf, Album.Genre.CLASSICAL);
        System.out.println("|-----|-----|-----|-----|-----|-----|-----|");
    }

    static void printAlbums(Album[] albums, GenreFilter gf) {
        for(Album a : albums) {
            if (gf.basicPermit(a)) {
                System.out.println(a);
            }
        }
    }
    static void printAlbumsAdv(Album[] albums, GenreFilter gf, Album.Genre genre) {
        for(Album a : albums) {
            if (gf.advancedPermit(a, genre.toString())) {
                System.out.println(a);
            }
        }
    }
}