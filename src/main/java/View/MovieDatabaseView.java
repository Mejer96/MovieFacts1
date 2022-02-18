package View;

import Model.Movie;

import java.util.ArrayList;

public class MovieDatabaseView {

    public String welcomeMessage() {
        return "Hello and welcome to the movie database!";
    }

    public String printGetFirst(String movieTitle) {
        return "First movie on the list is: " + movieTitle;
    }

    public String printGetRandom(String movieTitle) {
        return "The title of the random movie fetched from the database is: " + movieTitle;
    }

    public String printGetTenSortByPopularity(ArrayList<Movie> tenRandomMovies) {
        String randomMoviesString = "";

        for (Movie movie: tenRandomMovies ) {
            randomMoviesString += movie.getTitle() + ", Popularity: " + movie.getPopularity() + ". ";
        }
        return randomMoviesString;
    }

    public String printHowManyWonAnAward(int numberOfAwards) {
        return "Amount of movies with an award in the database: " + numberOfAwards;
    }

}
