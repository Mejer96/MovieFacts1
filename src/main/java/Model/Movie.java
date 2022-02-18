package Model;

public class Movie implements Comparable<Movie> {
    private int year;
    private int lengthInMinutes;
    private String title;
    private String subject;
    private int popularity;
    private String awards;

    public Movie(int year, int lengthInMinutes, String title, String subject, int popularity, String awards) {
        this.year = year;
        this.lengthInMinutes = lengthInMinutes;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.awards = awards;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "year=" + year +
                ", lengthInMinutes=" + lengthInMinutes +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", popularity=" + popularity +
                ", awards='" + awards + '\'' +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        if (popularity == o.getPopularity()) {
            return 0;
        } else if (popularity > o.getPopularity()) {
            return 1;
        } else {
            return -1;
        }
    }
}
