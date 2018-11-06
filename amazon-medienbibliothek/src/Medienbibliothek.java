import java.util.ArrayList;

public class Medienbibliothek {
	
	//Erstellen aller ArrayListen
	ArrayList<Medien> mediumsliste = new ArrayList<Medien>();
	ArrayList<Filme> filmliste = new ArrayList<Filme>();
	ArrayList<EBooks> ebookliste = new ArrayList<EBooks>();

	public void medienHinzufuegen(Medien m) {
		mediumsliste.add(m);
	}
	
	public void medienEntfernen(String name) {
		for (Medien m : mediumsliste)
		{
	       if (m.getName().toLowerCase().equals(name.toLowerCase())) {
	    	   mediumsliste.remove(m);
	    	   System.out.println("Medium erfolgreich entfernt!");
	    	   break;
	       }else {
	    	   System.out.println("Dieses Medium existiert nicht!");
	       }
		}
	}
	
	public void kurzBeschreibung() {
		for(Medien m : mediumsliste) {
			m.entfernungsBeschreibung();
		}
	}
	
	public void medienEntfernen1(Medien m) {
		if(equals(m) == true) {
			System.out.println("Medium erfolgreich entfernt!");
			mediumsliste.remove(m);
		}else {
			System.out.println("Dieses Medium existiert nicht!");
		}
	}

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
	
	public void mediumFiltern(String name) {
		for (Medien m : mediumsliste)
		{
	       if (m.getName().toLowerCase().equals(name.toLowerCase())) {
	    	   m.anzeigen();
	       }
		}
	}
}