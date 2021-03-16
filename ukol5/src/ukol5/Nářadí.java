package ukol5;

public class Náøadí extends Zboí{		//class náøadí potomek zboí
	int zaruka;  //parametr záruèní doby
	public Náøadí(String nazev, double cena, int zaruka) {	//kontruktor pro zadání doby záruky
		super(nazev, cena);
		this.zaruka = zaruka;
	}
	
	public int getZaruka() {    	//getter a setter zaruky
		return zaruka;
	}
	public void setZaruka(int zaruka) {
		this.zaruka = zaruka;
	}
	
	@Override
	public String getJednotka() {		//implementace metody getjednotka 
		if (zaruka == 1) {					//navrat poctu mesicu osetren o sklonování
			return "mìsíc";
		}
		if (zaruka >= 2 && zaruka <= 4) {
			return "mìsíce";
		}
		else
			return "mìsícù";
	}
}
