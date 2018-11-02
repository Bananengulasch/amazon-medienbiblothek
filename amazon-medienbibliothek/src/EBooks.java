public class EBooks extends Medien{
	
	private int isbn;
	private int seiten;
	private int auflage;

	public EBooks(String name, String kommentar, String erscheinungsdatum, int isbn, int seiten, int auflage) {
		super(name, kommentar, erscheinungsdatum);
		this.isbn = isbn;
		this.seiten = seiten;
		this.auflage = auflage;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getSeiten() {
		return seiten;
	}

	public void setSeiten(int seiten) {
		this.seiten = seiten;
	}

	public int getAuflage() {
		return auflage;
	}

	public void setAuflage(int auflage) {
		this.auflage = auflage;
	}
	
	public void anzeigen()
	{
        super.anzeigen();
        System.out.println("[eBookinfos]:"+"\n"+ "ISBN -->              " + this.getIsbn() + "\n"  + "Seitenanzahl -->      "+ this.getSeiten()+ "\n"  + "Auflage -->           "+ this.getAuflage());
	}
}
