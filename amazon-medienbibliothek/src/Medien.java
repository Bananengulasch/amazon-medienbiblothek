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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((erscheinungsdatum == null) ? 0 : erscheinungsdatum.hashCode());
		result = prime * result + id;
		result = prime * result + ((kommentar == null) ? 0 : kommentar.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medien other = (Medien) obj;
		if (erscheinungsdatum == null) {
			if (other.erscheinungsdatum != null)
				return false;
		} else if (!erscheinungsdatum.equals(other.erscheinungsdatum))
			return false;
		if (id != other.id)
			return false;
		if (kommentar == null) {
			if (other.kommentar != null)
				return false;
		} else if (!kommentar.equals(other.kommentar))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public  void anzeigen()
	{
		System.out.println("\n"+"-----------------------------------------"+"\n"+"\n"+"[Medium]:"+"\n"+ "ID -->                " + this.getId() + "\n"+ "Name -->              " + this.getName() + "\n"  + "Kommentar -->         " + this.getKommentar()+ "\n"  + "Erscheinungsdatum --> " + this.getErscheinungsdatum());
	}
	
	public void entfernungsBeschreibung() {
		System.out.println("ID, Name, Typ -->     " + this.getId()+ ", " + this.getClass() + ", "+ this.getName());
	}
}
