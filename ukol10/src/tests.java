
public class tests {   //testovaci trida s metodou main, ktera nebyla soucasti ukolu

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velikost = 2;  //testovaci pole o velikosti2
		Pole pole = new Pole(velikost);
		
		pole.zadejHranol();
		pole.zadejHranol();
		pole.zadejHranol();     //zkouska tvorby i objektu mimo velikost pole 
		pole.vypoctiObsahPodstavy();   // test pocitani obsahu a objemu s vypisem
		pole.vypoctiObjem();
			
		
		System.out.println(" nejmensi objem je " +pole.najdiNejmensiObjem());    //vypis nejmensiho objemu a poctu drevenych
		System.out.println(" pocet drevenych je " +pole.zjistiPocetDrevenych());
	
		
		
	}

}
