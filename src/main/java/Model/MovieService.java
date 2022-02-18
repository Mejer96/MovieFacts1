package Model;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class MovieService {
    MovieDatabase readMovieFile = new MovieDatabase();


    public String getFirst() {
        return readMovieFile.movies.get(0).getTitle();
    }
    public Movie getRandom() {
        Random random = new Random();
        return readMovieFile.movies.get(random.nextInt(readMovieFile.movies.size()));
    }

    public ArrayList<Movie> getTenSortByPopularity() {
        SortTenRandomMoviesByPopularity sortTenRandomMoviesByPopularity = new SortTenRandomMoviesByPopularity();

        for (int i = 0; i < 10; i++) {
            sortTenRandomMoviesByPopularity.addMovie(getRandom());
        }
        return sortTenRandomMoviesByPopularity.sortByPopularity();
    }

    public ArrayList<Movie> filterMovies(char character, int amount) {
        ArrayList<Movie> filteredMovies = new ArrayList<>();

        for (Movie movie: readMovieFile.readMovies()) {
            if (movie.getTitle().toLowerCase(Locale.ROOT).contains(Character.toString(character))) {
                int counter = 0;
                boolean counterIsHigherThanAmount = false;
                char[] array = movie.getTitle().toCharArray();

                for (char c: array) {
                    if (counter > amount) {
                        counterIsHigherThanAmount = true;
                        break;
                    } else if (c == character) {
                        counter++;
                    }
                }
                if (!counterIsHigherThanAmount && counter == amount) {
                    filteredMovies.add(movie);
                }
            }
        }
        return filteredMovies;
    }

    public int howManyWonAnAward() {
        int counter = 0;

        for (Movie movie: readMovieFile.readMovies()) {
            if (movie.getAwards().equals("Yes")) {
                counter++;
            }
        }
        return counter;
    }
}

