public class App{
	
	public static void main(String[] args) {
		
		Medien m1 = new Filme("Java Wars", "Claudio Landerer", "25.10.2018", 150, true, false);
		Medien m2 = new EBooks("Java Wars", "Claudio Landerer", "25.10.2018", 12345678, 120, 100000);
		
		Medienbibliothek mb = new Medienbibliothek();
		
		mb.medienHinzufuegen(m1);
		mb.medienHinzufuegen(m2);
		mb.anzeigen();
	}
}
