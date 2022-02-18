package com.example.moviefacts1;

import Model.Movie;
import Model.MovieService;
import View.MovieDatabaseView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {
    MovieService movieService = new MovieService();
    MovieDatabaseView movieDatabaseView = new MovieDatabaseView();

    @GetMapping("/")
    public String startPage() {
        return movieDatabaseView.welcomeMessage();
    }

    @GetMapping("/getFirst")
    public String getFirst() {
       return movieDatabaseView.printGetFirst(movieService.getFirst());
    }

    @GetMapping("/getRandom")
    public String getRandom() {
        return movieDatabaseView.printGetRandom(movieService.getRandom().getTitle());
    }

    @GetMapping("/getTenSortByPopularity")
    public String getTenSortByPopularity() {
        return movieDatabaseView.printGetTenSortByPopularity(movieService.getTenSortByPopularity());
    }

    @GetMapping("/howManyWonAnAward")
    public String howManyWonAnAward() {
        return movieDatabaseView.printHowManyWonAnAward(movieService.howManyWonAnAward());
    }

    @GetMapping("/filter")
    public ArrayList<Movie> filter(@RequestParam char character, @RequestParam int amount) {
        return movieService.filterMovies(character, amount);
    }

}
