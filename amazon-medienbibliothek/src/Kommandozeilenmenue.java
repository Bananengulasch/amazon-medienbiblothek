import java.util.Scanner;

public class Kommandozeilenmenue {

	Scanner scan;
	Medienbibliothek mb = new Medienbibliothek();

	public Kommandozeilenmenue() {
		this.scan = new Scanner(System.in);
	}

	public void MenueAnzeigen() {
		System.out.println("MENÜ");
		System.out.println("1) FILME");
		System.out.println("2) EBOOKS");
		System.out.println("3) LISTE-AUSGEBEN");
		System.out.println("4) exit");
	}

	public void start() {
		System.out.println("---------------");
		String s = "-";
		while (!s.equals("4")) {
			MenueAnzeigen();
			s = scan.nextLine();
			switch(s)
			{
			case "1":
				this.filmeHinzufügen();
				break;
			case "2":
				this.booksEntscheidung();
				break;
			case "3":
				this.listeAusgeben();
				break;
			case "4":
				break;
			default:
				this.fehler();
				break;
			}
		}
		scan.close();
	}
	
	//Wenn einer der möglichen Fälle eintritt --> weitere Entscheidungsmöglichkeiten
	
	public void filmEntscheidung()
	{
		System.out.println("---------------");	
	}
	
	public void booksEntscheidung()
	{
		System.out.println("---------------");
	}
	
	public void fehler()
	{
		System.out.println("Sie können nur 1, 2, 3 oder 4 eingeben!");
	}
	
	public void listeAusgeben() {
		
	}
	
	//Wenn Fall 1 eintritt --> weitere Entscheidungsmöglichkeiten
	public void filmeHinzufügen() {
		
	}
	
	
	public void filmeAusgeben() {
		
	}


}
