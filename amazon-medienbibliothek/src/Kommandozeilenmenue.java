import java.util.Scanner;

public class Kommandozeilenmenue {
	Scanner scan;
	Medienbibliothek mb = new Medienbibliothek();
	
	
	public Kommandozeilenmenue() {
		this.scan = new Scanner(System.in);
		bisherigeMedien();
	}
	
	public void bisherigeMedien() {
		Medien m1 = new Filme("Java Wars", "Claudio Landerer", "25.10.2018", 150, true, false);
		Medien m2 = new EBooks("Cloverfield Paradox", "Julius Onah", "25.10.2018", 12345678, 120, 100000);
		Medien m3 = new Filme("Haus des Geldes", "Alex Pina", "01.11.2018", 200, false, true);
		Medien m4 = new EBooks("Poltergeist", "Tobe Hooper", "01.11.2018", 87654321, 175, 100);
	
		mb.medienHinzufuegen(m1);
		mb.medienHinzufuegen(m2);
		mb.medienHinzufuegen(m3);
		mb.medienHinzufuegen(m4);
	}


	public void MenueAnzeigen() {
		System.out.println("-------------------------");
		System.out.println("HAUPTMENÜ");
		System.out.println("1) FILME");
		System.out.println("2) EBOOKS");
		System.out.println("3) LISTE-AUSGEBEN");
		System.out.println("4) exit");
	}
	
	public void unterMenueFilm() {
		System.out.println("-------------------------");
		System.out.println("FILMMENÜ");
		System.out.println("1) HINZUFÜGEN");
		System.out.println("2) ENTFERNEN");
		System.out.println("3) LISTE-AUSGEBEN");
		System.out.println("4) Zurück");
	}
	
	public void unterMenueBook() {
		System.out.println("-------------------------");
		System.out.println("EBOOKSMENÜ");
		System.out.println("1) HINZUFÜGEN");
		System.out.println("2) ENTFERNEN");
		System.out.println("3) LISTE-AUSGEBEN");
		System.out.println("4) Zurück");
	}
	
	public void start() {
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
				start();
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
				start();
			}else {
				fehler();
			}
		}
			//Möglichkeit 3 wurde gewählt
		else if(s.equals("3")) {
			listeAusgeben();
			
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
		start();
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
        start();
	}
	
	public void filmEntfernen() {		
		System.out.println("-------------------------");
		System.out.println("Welchen Film möchten Sie entfernen?");
		System.out.println("Mögliche Eingaben:");
		System.out.println("1) Java Wars");
		System.out.println("2) Cloverfield Paradox");
		System.out.println("3) Haus des Geldes");
		System.out.println("4) Poltergeist");
		System.out.println("5) Zurück");
		
		String s = scan.nextLine();
		if(s.equals("1")) {
			mb.medienEntfernen(m1);
			start();
		}
		else if(s.equals("2")) {
			mb.medienEntfernen(m2);
			start();
		}
		else if(s.equals("3")) {
			mb.medienEntfernen(m3);
			start();
		}
		else if(s.equals("4")) {
			mb.medienEntfernen(m4);
			start();
		}
		else if(s.equals("5")) {
			start();
		}
		start();
					
	}
	
	public void filmListeAusgeben() {
		for(Filme filme : mb.alleFilmeAlsListe())
		{
			filme.anzeigen();
		}
		start();
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
        start();
	}
		
	public void bookEntfernen() {
			
	}
		
	public void bookListeAusgeben() {
		for(EBooks ebooks : mb.alleEBooksAlsListe())
		{
			ebooks.anzeigen();
		}
		start();
	}

}
