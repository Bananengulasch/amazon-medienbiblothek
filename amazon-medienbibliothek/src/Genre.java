
public class Genre extends Medien{
	
	private String genre;
	
	public Genre(String name, String kommentar, String erscheinungsdatum) {
		super(name, kommentar, erscheinungsdatum);
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
