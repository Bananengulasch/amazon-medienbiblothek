
public class Genre{
	
	private String genre;
	
	public Genre(String genre) {
		this.genre = genre;
	}

	public String getName() {
		return genre;
	}

	public void setName(String name) {
		this.genre = name;
	}

	@Override
	public String toString() {
		return "Genre [genre=" + genre + "]";
	}
	
	
}
