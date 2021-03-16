package ukol5;

public class N��ad� extends Zbo��{		//class n��ad� potomek zbo��
	int zaruka;  //parametr z�ru�n� doby
	public N��ad�(String nazev, double cena, int zaruka) {	//kontruktor pro zad�n� doby z�ruky
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
		if (zaruka == 1) {					//navrat poctu mesicu osetren o sklonov�n�
			return "m�s�c";
		}
		if (zaruka >= 2 && zaruka <= 4) {
			return "m�s�ce";
		}
		else
			return "m�s�c�";
	}
}
