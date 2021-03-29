import java.util.Scanner;


public class Test {

	public static int pouzeCelaCisla(Scanner sc) 
	{
		int cislo = 0;
		try
		{
			cislo = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}
	


	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze();
		int rok;   //deklarace novým promenných = rok a prumer, index jsem smazal, protože se orientujeme podle jmena
		float prumer;
		int volba;
		String jmeno;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni noveho studenta");
			System.out.println("2 .. nastaveni prumeru studenta");
			System.out.println("3 .. vypis informace o studentovi");
			System.out.println("4 .. odstraneni studenta");   //aktualizace volby o nové možnosti
			System.out.println("5 .. vypis vsech studentu");
			System.out.println("6 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					System.out.println("Zadejte jmeno studenta, rok narozeni"); 
					jmeno=sc.next();
					rok=Test.pouzeCelaCisla(sc);				
					if (!mojeDatabaze.setStudent(jmeno,rok))
						System.out.println("Student v databazi jiz existuje");
					break;
				case 2:
					System.out.println("Zadejte jmeno a prumer studenta");
					jmeno=sc.next();
					prumer = sc.nextFloat();
					mojeDatabaze.setPrumer(jmeno,prumer);
					break;
				case 3:
					System.out.println("Zadejte jmeno studenta"); //vypis infa o studentovi na zaklade  vlozeneho jmena
					jmeno=sc.next();
					Student info = null;
					info=mojeDatabaze.getStudent(jmeno);
					if (info!=null)
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
					else
						System.out.println("Vybrany student neexistuje");
					break;
				case 4:
					System.out.println("Zadejte jmeno studenta k odstraneni"); //odstraneni studenta na zaklade vlozeneho jmena
					jmeno=sc.next();
					if (mojeDatabaze.odstranStudenta(jmeno))
						System.out.println(jmeno + " odstranen ");
					else
						System.out.println(jmeno + " neni v databazi ");
					break;
				case 5:
						mojeDatabaze.vypisDatabaze();  //vypis databaze - zavolani metody
					break;
				case 6:
					run=false; //ukonceni
					break;
			}
			
		}
	}

}
