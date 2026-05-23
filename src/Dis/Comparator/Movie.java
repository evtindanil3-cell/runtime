package Dis.Comparator;

import java.util.Comparator;

public class Movie {
    String title;
    double rating;
    int year;

    public Movie(String title, double rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static final Comparator<Movie> movieComparatorRating = Comparator.comparingDouble(Movie::getRating);
    public static final Comparator<Movie> movieComparatorName = Comparator.comparing(Movie::getTitle);
    public static final Comparator<Movie> movieComparatorYear = Comparator.comparingInt(Movie::getYear);

    @Override
    public String toString() {
        return "Comparator.Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }
}
