package ukol5;

public class Potravina extends Zbo��{ //t��da potravona roz�i�uj�c� zbo��
	private int trvanlivost;		//cel� ��slo trvanlivosti
	public Potravina(String nazev, double cena, int trvanlivost) { //konstruktor pro zad�n� trvanlivosti
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
		if (trvanlivost == 1) {				// o�et�en� spr�vn�ho sklo�ov�n� jednotky
			return "den";
		}
		if (trvanlivost <= 4 && trvanlivost >= 2) {
			return "dny";
		}
		else
			return "dn�";
	}
}
