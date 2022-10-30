package L01.InterfaceComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestMovie {

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>(); 
		list.add(new Movie("Force Awakens", 8.3, 2015)); 
		list.add(new Movie("Star Wars", 8.7, 1977)); 
		list.add(new Movie("Empire Strikes Back", 8.7, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983)); 

		// Sort by rating : (1) Create an object of ratingCompare 
		//                  (2) Call Collections.sort 
		//                  (3) Print Sorted list 
		System.out.println("Sorted by name"); 
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (Movie movie: list) 
			System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
		///////////
		//Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator())
		System.out.println("\nSorted by rating and then by name");
		Comparator<Movie> mComp = new RatingCompare().thenComparing(nameCompare);
		Collections.sort(list, mComp);
		for (Movie movie: list)
			System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
	}

}
