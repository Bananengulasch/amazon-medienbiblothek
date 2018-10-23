public class Urheber {
	
	private String vorname;
	private String nachname;
	private String firmenname;
	
	public Urheber(String vorname, String nachname, String firmenname) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.firmenname = firmenname;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getFirmenname() {
		return firmenname;
	}
	public void setFirmenname(String firmenname) {
		this.firmenname = firmenname;
	}
	@Override
	public String toString() {
		return "Urheber [vorname=" + vorname + ", nachname=" + nachname + ", firmenname=" + firmenname + "]";
	}
	
	
}
