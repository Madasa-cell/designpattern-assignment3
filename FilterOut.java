public class FilterOut implements GenreFilter {
    @Override
    public boolean basicPermit(Album a) {
        return !a.genre().equalsIgnoreCase(Album.Genre.POP.toString());
    }

    @Override
    public boolean advancedPermit(Album a, String genre) {
        return !a.genre().equalsIgnoreCase(genre);
    }
}