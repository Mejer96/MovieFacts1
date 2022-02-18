package Model;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieDatabase {
    File file = new File("/Users/carl/Downloads/imdb-data.csv");
    ArrayList<Movie> movies = new ArrayList<>();

    public ArrayList<Movie> readMovies() {
        int counter = 0;

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currentLineFromFile = scanner.nextLine();
                if (counter > 0) {
                    String[] movieAttributes = currentLineFromFile.split(";");
                    movies.add(new Movie
                            (Integer.parseInt(movieAttributes[0]),
                            Integer.parseInt(movieAttributes[1]),
                            movieAttributes[2],
                            movieAttributes[3],
                            Integer.parseInt(movieAttributes[4]),
                            movieAttributes[5]));
                }
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return movies;
    }
}
