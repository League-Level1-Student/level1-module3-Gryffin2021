package _04_netflix;

public class NetflixYes {
	public static void main(String[] args){
		Movie Marmaduke = new Movie("Marmaduke", 1);
		Movie Morbius = new Movie("Morbuis", 2);
		Movie Eternals = new Movie("Eternals", 3);
		Movie Gorrila = new Movie("Gorrila Tag 2: Return of Le Monk", 5);
		Movie Minions = new Movie("Minions: The Rise of Gru", 4);
		Movie PacificRim = new Movie("Pacific Rim", 0);
		Marmaduke.getTicketPrice();
		Morbius.getTicketPrice();
		Eternals.getTicketPrice();
		Gorrila.getTicketPrice();
		Minions.getTicketPrice();
		PacificRim.getTicketPrice();
		NetflixQueue net = new NetflixQueue();
		net.addMovie(Marmaduke);
		net.addMovie(Morbius);
		net.addMovie(Eternals);
		net.addMovie(Gorrila);
		net.addMovie(Minions);
		net.addMovie(PacificRim);
		net.printMovies();
		net.sortMoviesByRating();
		System.out.println("The best movie is... " + (net.getBestMovie()) + "!");
		System.out.println("The second best movie is... " + (net.getMovie(1)) + "!");
		System.out.println("The worst movie ever created is... " + (net.getMovie(5)) + "! Wow that really sucked!");
	}
}

