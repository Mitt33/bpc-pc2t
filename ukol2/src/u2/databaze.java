package u2;

public class databaze {
	private String jmeno; //bod 1 - iniciace prom�nn�ch
	private double rok, uvazek;
	private static double maxUvazek = 1; // bod 2 - statick� prom�nn� s max �vazkem
	
	databaze(String jmeno, double rok){ // bod 3 -konstruktor t��dy, vlo�en� roku a jmena
		this.jmeno = jmeno;
		this.rok = rok;
	}
	// bod 4 - gettery pro prom�nn�:
	public String getJmeno() {
		return this.jmeno;
	}
	public double getRok() {
		return this.rok;
	}
	public double getUvazek() {
		return this.uvazek;
	}
	
	public static void setMaxUvazek(double maxUV){ // bod 5 - statick� metoda na nastaven� max uvazku
		if (maxUV > 0) {
			maxUvazek = maxUV;
		}
		else {
			maxUvazek = 0;
			System.out.println("Zadan� �vazek asi ned�v� smysl");
		}
	}
	
	
	boolean zmena (double novyUvazek){ //bod 6 - metoda na kontrolu nov�ho max �vazku
		if ((novyUvazek + this.uvazek) > maxUvazek){
			return false;
		}
		else {
			this.uvazek = novyUvazek + this.uvazek;
			return true;
		}
	}

}
