import java.util.Scanner;

public class Kommandozeilenmenue {
	Scanner scan;
	Medienbibliothek mb = new Medienbibliothek();
	
	
	public Kommandozeilenmenue() {
		this.scan = new Scanner(System.in);
	}
	
	public void bisherigeMedien() {
		Medien m1 = new Filme("Java Wars", "Claudio Landerer", "25.10.2018", 150, true, false);
		Medien m2 = new EBooks("Krieg der Zangerle", "Claudio Landerer", "25.10.2018", 12345678, 120, 100000);
		Medien m3 = new Filme("Der Hobbit", "Paul Zangerle", "01.11.2018", 200, false, false);
		Medien m4 = new EBooks("French Defense", "Stefan Frenchie", "01.11.2018", 87654321, 175, 100);
	
		mb.medienHinzufuegen(m1);
		mb.medienHinzufuegen(m2);
		mb.medienHinzufuegen(m3);
		mb.medienHinzufuegen(m4);
	}


	public void MenueAnzeigen() {
		System.out.println("-------------------------");
		System.out.println("MENÜ");
		System.out.println("1) FILME");
		System.out.println("2) EBOOKS");
		System.out.println("3) LISTE-AUSGEBEN");
		System.out.println("4) exit");
	}
	
	public void unterMenueFilm() {
		System.out.println("-------------------------");
		System.out.println("Filmmenü");
		System.out.println("1) HINZUFÜGEN");
		System.out.println("2) ENTFERNEN");
		System.out.println("3) LISTE-AUSGEBEN");
		System.out.println("4) exit");
	}
	
	public void unterMenueBook() {
		System.out.println("-------------------------");
		System.out.println("eBooksmenü");
		System.out.println("1) HINZUFÜGEN");
		System.out.println("2) ENTFERNEN");
		System.out.println("3) LISTE-AUSGEBEN");
		System.out.println("4) exit");
	}
	
	public void start() {
		bisherigeMedien();
		MenueAnzeigen();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		//Möglichkeit 1 wurde gewählt
		if(s.equals("1")) {
			unterMenueFilm();
			s = scan.nextLine();
			if(s.equals("1")) {
				filmHinzufügen();
			}else if(s.equals("2")) {
				filmEntfernen();
			}else if(s.equals("3")) {
				filmListeAusgeben();
			}else if(s.equals("4")) {
				System.out.println("Auf Wiedersehen!");
			}else {
				fehler();
			}
		}
		//Möglichkeit 2 wurde gewählt
		else if(s.equals("2")) {
			unterMenueBook();
			s = scan.nextLine();
			if(s.equals("1")) {
				bookHinzufügen();
			}else if(s.equals("2")) {
				bookEntfernen();
			}else if(s.equals("3")) {
				bookListeAusgeben();
			}else if(s.equals("4")) {
				System.out.println("Auf Wiedersehen!");
			}else {
				fehler();
			}
		}
			//Möglichkeit 3 wurde gewählt
		else if(s.equals("3")) {
			mb.anzeigen();
		}
			//Möglichkeit 4 wurde gewählt
		else if(s.equals("4")) {
			System.out.println("Auf Wiedersehen!");
		}
		//Fehlermeldung bei ungültiger Eingabe
		else {
			fehler();
		}
		scan.close();
	}

	
	public void listeAusgeben() {
		mb.anzeigen();
	}
	
	public void fehler()
	{
		System.out.println("Sie können nur 1, 2, 3 oder 4 eingeben!");
	}
	
	//Wenn Fall 1 eintritt --> weitere Entscheidungsmöglichkeiten
	public void filmHinzufügen() {
		System.out.println("-------------------------");
		System.out.println("Bitte geben Sie den Namen des neuen Films ein:");
		String name = scan.nextLine();
		System.out.println("Bitte geben Sie einen Kommentar zu dem neuen Film ein:");
        String kommentar = scan.nextLine();
        System.out.println("Bitte geben Sie das Erscheinungsdatum des neuen Films ein:");
        String datum = scan.nextLine();
        System.out.println("Bitte geben Sie die Spielzeit des neuen Films ein:");
        int spielzeit = scan.nextInt();
        System.out.println("Ist der Film UHD?");
        boolean uhd = scan.nextBoolean();
        System.out.println("Ist der Film HD?");
        boolean hd = scan.nextBoolean();
        
        Medien m5 = new Filme(name, kommentar, datum, spielzeit, uhd, hd);
        mb.medienHinzufuegen(m5);
        mb.anzeigen();
	}
	
	public void filmEntfernen() {
		System.out.println("Welchen Film möchten Sie entfernen?");
		System.out.println("Mögliche Eingaben: 1, 2, 3, 4, 5, 6");
		String s = scan.nextLine();
	}
	
	public void filmListeAusgeben() {
		for(Filme filme : mb.alleFilmeAlsListe())
		{
			filme.anzeigen();
		}
	}
	
	//Wenn Fall 2 eintritt --> weitere Entscheidungsmöglichkeiten
	public void bookHinzufügen() {
		System.out.println("-------------------------");
		System.out.println("Bitte geben Sie den Namen des neuen eBooks ein:");
		String name = scan.nextLine();
		System.out.println("Bitte geben Sie einen Kommentar zu dem neuen eBook ein:");
        String kommentar = scan.nextLine();
        System.out.println("Bitte geben Sie das Erscheinungsdatum des neuen eBooks ein:");
        String datum = scan.nextLine();
        System.out.println("Bitte geben Sie die ISBN-Nummer des neuen eBooks ein:");
        int isbn = scan.nextInt();
        System.out.println("Bitte geben Sie die Seitenanzahl des neuen eBooks ein:");
        int seiten = scan.nextInt();
        System.out.println("Bitte geben Sie die Auflagszahl des neuen eBooks ein:");
        int auflage = scan.nextInt();
        
        Medien m6 = new EBooks(name, kommentar, datum, isbn, seiten, auflage);
        mb.medienHinzufuegen(m6);
        mb.anzeigen();
	}
		
	public void bookEntfernen() {
			
	}
		
	public void bookListeAusgeben() {
		for(EBooks ebooks : mb.alleEBooksAlsListe())
		{
			ebooks.anzeigen();
		}
	}

}
