public class Medien{
	
	private int id;
	protected String name;
	private String kommentar;
	private String erscheinungsdatum;
	private static int counter;
	
	public Medien(String name, String kommentar, String erscheinungsdatum) {
		super();
		counter++;
		this.id = counter;
		this.name = name;
		this.kommentar = kommentar;
		this.erscheinungsdatum = erscheinungsdatum;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKommentar() {
		return kommentar;
	}

	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}

	public String getErscheinungsdatum() {
		return erscheinungsdatum;
	}

	public void setErscheinungsdatum(String erscheinungsdatum) {
		this.erscheinungsdatum = erscheinungsdatum;
	}
	
	public void gleicheId(int id) { 
		if(this.id == id) {
			
		}else {
			System.out.println("Dieses Medium existiert nicht!");
		}
	}
	
	public  void anzeigen()
	{
		System.out.println("\n"+"-----------------------------------------"+"\n"+"\n"+"[Medium]:"+"\n"+ "ID -->                " + this.getId() + "\n"+ "Name -->              " + this.getName() + "\n"  + "Kommentar -->         " + this.getKommentar()+ "\n"  + "Erscheinungsdatum --> " + this.getErscheinungsdatum());
	}
	
	public void entfernungsBeschreibung() {
		System.out.println("ID & Name -->         " + this.getId()+ ", " + this.getName());
	}
}
