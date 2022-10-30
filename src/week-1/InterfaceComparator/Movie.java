package L01.InterfaceComparator;

import java.util.Comparator;

public class Movie {
    private double rating;
    private String name;
    private int year;

    // Constructor
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getter methods for accessing private data
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }


}

//Class to compare Movies by ratings 
class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}

//Class to compare Movies by name 
class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }
} 