package ukol5;

public abstract class Zbo�� {
	private String nazev;				//string nazev zbozi
	private double cena;				//cislo cena
	private static double dph = 21;	   //dph 21%
	
	Zbo��(String nazev, double cena){ 		//konstruktor pro zad�n� nazev a cenu bez dph
		this.nazev = nazev;
		this.cena = cena;
	}

	
	public String getNazev() {					//getter a setter nazvu
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	
	
	public double getCena() {				//getter a setter ceny
		return (cena + cena * (dph/100));
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	
	public static double getDph() {			//getter a setter dph
		return dph;
	}

	public static void setDph(double dph) {
		Zbo��.dph = dph;
	}


	public abstract String getJednotka();		//abstraktni metoda bez parametru vracejici string
		
	
}
