import java.util.Scanner;


public class Pole {
		// Konstruktor s velikosti pole
	Pole(int velikost)
	{
		mojeHranoly=new Hranol[velikost];
		sc=new Scanner(System.in);
	}
	
	// vlozeni hranolu do pole na prvni volnou pozici
	void zadejHranol(){
		boolean drevena=false;
		float delka=0;
		float vyska=0;
		System.out.println("Zadejte delku podstavy hranolu");
		while(!sc.hasNextFloat())
		{
			sc.next();
		}
		delka=sc.nextFloat();
		System.out.println("Zadejte vysku hranolu");
		while(!sc.hasNextFloat())
		{
			sc.next();
		}
		vyska=sc.nextFloat();
		System.out.println("Je drevena?");
		while(!sc.hasNextBoolean())                                                      //chyba 6 - drevenost je boolean ne float
		{
			sc.next();
		}
		drevena=sc.nextBoolean();
		if (Hranol.getPocetHranolu() == mojeHranoly.length)									//chyba 7 - pocet hranolu nemohl byt vetsi nez velikost pole, opraveno na ==
		{
			System.out.println("Pole uz je zaplneno");									
			return;
		}
		
		mojeHranoly[Hranol.getPocetHranolu()] = new Hranol(delka,vyska,drevena);           //chyba 8 - netvorili se objekty, vytvoreni objektu a rovnou prirazeni do pole
		
		/*	mojeHranoly[Hranol.getPocetHranolu()].setHrana(delka);			
		mojeHranoly[Hranol.getPocetHranolu()].setHrana(vyska);
		mojeHranoly[Hranol.getPocetHranolu()].setDreveny(drevena); */
	}
	
	// vypis objemu vsech hranolu
	void vypoctiObjem()
	{
		for (int i=0;i<Hranol.getPocetHranolu();i++) 
			System.out.println("Objem " +i+ " hranolu je " + mojeHranoly[i].vypoctiObjem());		  //chyba 9 - mojeHranoly[i].vypoctiObjem()  a ne vypoctiObsah, opraven vypis o jaky hranol se jedna
	}
	
	// vypis obsahu podstavy vsech hranolu
	void vypoctiObsahPodstavy()
	{
		for (int i=0;i<Hranol.getPocetHranolu();i++)
			System.out.println("Obsah " +i+ " hranolu je " + mojeHranoly[i].vypoctiObsah());       //chyba 10 - mojeHranoly[i].vypoctiObsah()  a ne vypoctiObjem, vypis
	}
	// nalezeni indexu nejmensiho hranolu
	int najdiNejmensiObjem()
	{
		float min= Float.MAX_VALUE;																//chyba 11 - zacinal bych na maximalni hoodnote, aby byl vzdycky nejaky mensi					
		int idx=0;										
		for (int i=0;i<Hranol.getPocetHranolu();i++)
		{
			if (mojeHranoly[i].vypoctiObjem()<min){
				min=mojeHranoly[i].vypoctiObjem();
				idx=i;
			}
		}
		return idx;
	}
	
	// zjisteni celkoveho poctu drevenych kostek
	int zjistiPocetDrevenych(){
		int pocetDrevenych=0;
		for (int i=0;i<Hranol.getPocetHranolu();i++)   												//chyba 12 - cely cyklus byl nesmyslne poskladan         					
		{
			if (mojeHranoly[i].zeDreva == true)														//chyba 13 - spatny operator, pridano ==
				pocetDrevenych++;
		}
		return pocetDrevenych;
	}
	
	

	private Scanner sc;
	private Hranol []mojeHranoly;
}

