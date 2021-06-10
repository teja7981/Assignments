package springbasics;

public class Movie {

	private String movieName;
	
	private String ratings;
	
	private String language;

	public Movie(String movieName, String ratings, String language) {
		super();
		this.movieName = movieName;
		this.ratings = ratings;
		this.language = language;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", ratings=" + ratings + ", language=" + language + "]";
	}
	
	
}
