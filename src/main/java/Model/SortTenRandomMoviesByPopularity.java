package Model;

import java.util.ArrayList;
import java.util.Collections;

public class SortTenRandomMoviesByPopularity {
    private ArrayList<Movie> tenRandomMovies = new ArrayList<>();

    public void addMovie(Movie movie) {
        tenRandomMovies.add(movie);
    }

    public ArrayList<Movie> sortByPopularity() {
        Collections.sort(tenRandomMovies);
        return tenRandomMovies;
    }
}
