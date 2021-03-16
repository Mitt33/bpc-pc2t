package ukol5;

public class Potravina extends Zboží{ //tøída potravona rozšiøující zboží
	private int trvanlivost;		//celé èíslo trvanlivosti
	public Potravina(String nazev, double cena, int trvanlivost) { //konstruktor pro zadání trvanlivosti
		super(nazev, cena);
		this.trvanlivost = trvanlivost;
	}
	public int getTrvanlivost() {		//getter a setter trv anlivosti
		return trvanlivost;
	}
	public void setTrvanlivost(int trvanlivost) {
		this.trvanlivost = trvanlivost;
	}
	
	@Override
	public String getJednotka() {		//implementace metody getjednotka
		if (trvanlivost == 1) {				// ošetøení správného skloòování jednotky
			return "den";
		}
		if (trvanlivost <= 4 && trvanlivost >= 2) {
			return "dny";
		}
		else
			return "dnù";
	}
}
