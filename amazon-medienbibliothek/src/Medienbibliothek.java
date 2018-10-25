import java.util.ArrayList;

public class Medienbibliothek {
	
	ArrayList<Medien> mediumsliste = new ArrayList<Medien>();

public void medienHinzufuegen(Medien m) {
	mediumsliste.add(m);
}

public void anzeigen() {
	for(Medien m : mediumsliste) {
		m.anzeigen();
	}
}

}