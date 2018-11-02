import java.util.ArrayList;

public class Medienbibliothek {
	
	//Erstellen aller ArrayListen
	ArrayList<Medien> mediumsliste = new ArrayList<Medien>();
	ArrayList<Filme> filmliste = new ArrayList<Filme>();
	ArrayList<EBooks> ebookliste = new ArrayList<EBooks>();

	public void medienHinzufuegen(Medien m) {
		mediumsliste.add(m);
	}
	
	public void medienEntfernenBeschreibung() {
		for(Medien m : mediumsliste) {
			m.entfernungsBeschreibung();
		}
	}
	
	public void gleicheId(int id) { 
		if(this.id == id) {
			medienEntfernen(id);
		}else {
			System.out.println("Dieses Medium existiert nicht!");
		}
	}
	
	public void medienEntfernen(int id) {
				System.out.println("Dieses Medium wurde entfernt!");
				mediumsliste.remove(id);
	}
	
//	public void medienEntfernen(Object m) {
//		if(m.equals(m)) {
//			mediumsliste.remove(m);
//		}else {
//			System.out.println("Dieses Medium existiert nicht!");
//		}
//	}

	//Ausgeben aller Medien
	public void anzeigen() {
		for(Medien m : mediumsliste) {
				m.anzeigen();
		}
	}
	
	//Filtern nach Filmen
	public ArrayList<Filme> alleFilmeAlsListe(){
		for (Medien m : mediumsliste)
		{
	       if (m instanceof Filme) {
	    	   filmliste.add((Filme)m);
	       }
		}
		return filmliste;
	}
	
	//Filtern nach EBooks
	public ArrayList<EBooks> alleEBooksAlsListe(){
		for (Medien m : mediumsliste)
		{
	       if (m instanceof EBooks) {
	    	   ebookliste.add((EBooks)m);
	       }
		}
		return ebookliste;
	}
}