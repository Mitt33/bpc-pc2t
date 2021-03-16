package ukol5;

public class Test {

	public static void main(String[] args) {			//metoda main
		// TODO Auto-generated method stub
		Zboží[] pole = new Zboží[4];					// nové pole o velikosti 4
		pole[0] = new Potravina("Rohlík", 1.5, 1);			//plnìní pole
		pole[1] = new Náøadí("Kleštì", 278.0, 24);
		pole[2] = new Potravina("Chleba", 20.8, 6);
		pole[3] = new Potravina("Jablko", 51.0, 20);
				
		for (int i = 0; i < pole.length; i++) {		//cyklus pro vypsání položek pole a jejich nazev, cenu a trvanlivosti
			if(pole[i] instanceof Potravina)
				System.out.println(pole[i].getNazev() + " cena: "+pole[i].getCena() + " trvanlivost: "+ ((Potravina)pole[i]).getTrvanlivost() + " " + pole[i].getJednotka());

			else
				System.out.println(pole[i].getNazev() + " cena: "+pole[i].getCena() +  " zaruka: "+ ((Náøadí)pole[i]).getZaruka() + " " +pole[i].getJednotka());
		}    //podle sice dobu záruky u položek náøadí nemáme vypisovat, ale pøijde mi to užiteèné když už na to máme metodu
	}
}