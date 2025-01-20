public interface GenreFilter {
    boolean basicPermit(Album a);
    boolean advancedPermit(Album a, String genre);
}
