package models;

import java.util.List;
import java.util.stream.Collectors;

public class MovieLibrary {
    private List<Movie> movies;

    public MovieLibrary() {
    }

    public MovieLibrary(List<Movie> movies) {
        this.movies = movies;
    }


    @Override
    public String toString() {
        return "All movies in library:\r\n" + movies.stream().map(Movie::toString).collect(Collectors.joining());
    }
}
