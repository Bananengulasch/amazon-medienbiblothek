public class Filme extends Medien{
	
	private int spielzeit;
	private boolean uhd;
	private boolean hd;
	
	public Filme(String name, String kommentar, String erscheinungsdatum, int spielzeit, boolean uhd, boolean hd) {
		super(name, kommentar, erscheinungsdatum);
		// TODO Auto-generated constructor stub
		this.spielzeit = spielzeit;
		this.uhd = uhd;
		this.hd = hd;
	}

	public int getSpielzeit() {
		return spielzeit;
	}

	public void setSpielzeit(int spielzeit) {
		this.spielzeit = spielzeit;
	}

	public boolean isUhd() {
		return uhd;
	}

	public void setUhd(boolean uhd) {
		this.uhd = uhd;
	}

	public boolean isHd() {
		return hd;
	}

	public void setHd(boolean hd) {
		this.hd = hd;
	}
	
	public  void anzeigen()
	{
	         super.anzeigen();
	         System.out.println("[Filme]:"+"\n"+ "Spielzeit--> " + this.getSpielzeit() + "\n"  + "UHD ja/nein--> "+ this.isUhd()+ "\n"  + "HD ja/nein--> "+ this.isHd());
	}
}
	
