package ukol5;

public class Test {

	public static void main(String[] args) {			//metoda main
		// TODO Auto-generated method stub
		Zbo��[] pole = new Zbo��[4];					// nov� pole o velikosti 4
		pole[0] = new Potravina("Rohl�k", 1.5, 1);			//pln�n� pole
		pole[1] = new N��ad�("Kle�t�", 278.0, 24);
		pole[2] = new Potravina("Chleba", 20.8, 6);
		pole[3] = new Potravina("Jablko", 51.0, 20);
				
		for (int i = 0; i < pole.length; i++) {		//cyklus pro vyps�n� polo�ek pole a jejich nazev, cenu a trvanlivosti
			if(pole[i] instanceof Potravina)
				System.out.println(pole[i].getNazev() + " cena: "+pole[i].getCena() + " trvanlivost: "+ ((Potravina)pole[i]).getTrvanlivost() + " " + pole[i].getJednotka());

			else
				System.out.println(pole[i].getNazev() + " cena: "+pole[i].getCena() +  " zaruka: "+ ((N��ad�)pole[i]).getZaruka() + " " +pole[i].getJednotka());
		}    //podle sice dobu z�ruky u polo�ek n��ad� nem�me vypisovat, ale p�ijde mi to u�ite�n� kdy� u� na to m�me metodu
	}
}