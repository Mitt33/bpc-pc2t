package u2;

public class databaze {
	private String jmeno; //bod 1 - iniciace promìnných
	private double rok, uvazek;
	private static double maxUvazek = 1; // bod 2 - statická promìnná s max úvazkem
	
	databaze(String jmeno, double rok){ // bod 3 -konstruktor tøídy, vložení roku a jmena
		this.jmeno = jmeno;
		this.rok = rok;
	}
	// bod 4 - gettery pro promìnné:
	public String getJmeno() {
		return this.jmeno;
	}
	public double getRok() {
		return this.rok;
	}
	public double getUvazek() {
		return this.uvazek;
	}
	
	public static void setMaxUvazek(double maxUV){ // bod 5 - statická metoda na nastavení max uvazku
		if (maxUV > 0) {
			maxUvazek = maxUV;
		}
		else {
			maxUvazek = 0;
			System.out.println("Zadaný úvazek asi nedává smysl");
		}
	}
	
	
	boolean zmena (double novyUvazek){ //bod 6 - metoda na kontrolu nového max úvazku
		if ((novyUvazek + this.uvazek) > maxUvazek){
			return false;
		}
		else {
			this.uvazek = novyUvazek + this.uvazek;
			return true;
		}
	}

}
