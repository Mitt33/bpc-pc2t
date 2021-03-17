import java.util.Scanner;


public class Test {

	public static int pouzeCelaCisla(Scanner sc) //metoda na kontrolu celych cisel
	{
		int cislo = 0;
		try               //try catch na vlozeni c�sla jestli je typu int nebo ne
		{
			cislo = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);  //opakov�ni dokud coslo nebude bez vyjimek
		}
		return cislo;
	}
	
	public static float pouzeCisla(Scanner sc)    //kontrola jestli bylo zadano cislo
	{
		float cislo = 0;
		try
		{
			cislo = sc.nextFloat();			//try na vlo�en� ��slo
		}
		catch(Exception e)                  //catch jestli se jedn� o ��slo
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cislo ");
			sc.nextLine();
			cislo = pouzeCisla(sc);
		}
		return cislo;
	}

	public static void main(String[] args) throws Vyjimky {	
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze(1);
		int idx;
		float prumer;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. vypis databaze");
			System.out.println("6 .. ulozeni databaze do souboru");
			System.out.println("7 .. nacteni databaze ze souboru");
			System.out.println("8 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					System.out.println("Zadejte pocet studentu");
					mojeDatabaze=new Databaze(pouzeCelaCisla(sc));
					break;
				case 2:
					try								//try catch jestli nen� datab�ze pln�
					{
						mojeDatabaze.setStudent();
					}
					catch (ArrayIndexOutOfBoundsException e)
					{
						System.out.println("datab�ze je pln�, nelze p�idat dal��ho studenta");
					}
					break;
				case 3:
					System.out.println("Zadejte index a prumer studenta");
					idx= pouzeCelaCisla(sc);   //o�et�e� jestli je index cele ��slo a pr�m�r ��slo
					prumer = pouzeCisla(sc);
					try			//o�et�en� vstupu indexu studenta a jeho pr�m�ru
					{
						mojeDatabaze.setPrumer(idx,prumer);
					}
					catch(ArrayIndexOutOfBoundsException e)  //catch jestli je v rozsahu databaze
					{
						System.out.println("Vybrana polozka mimo rozsah databaze");
					}
					catch (NullPointerException e) 		//catch jestli jeho index existuje
					{
						System.out.println("Vybrana polozka neexistuje");
					} 
					catch (Vyjimky e) {   		//catch pro ostatn� p��pady
						System.out.println(e.getMessage());
					}
					break;
				case 4:
					System.out.println("Zadejte index studenta");
					idx=pouzeCelaCisla(sc);			//o�et�en� zad�n� indexu studenta, jen cel� ��sla
					Student info = null;   
					try 
					{	
						info=mojeDatabaze.getStudent(idx);
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
					}
					catch (Vyjimky e) //catch pro vyjimku nezadani prumeru
					{
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer nezadan");
					}
					catch(ArrayIndexOutOfBoundsException e) //catch pro vyjimku vybrani studenta mimo databazi
					{
						System.out.println("Vybrana polozka mimo rozsah databaze");
					}
					catch (NullPointerException e)			//catch pro neexistujici polozku
					{
						System.out.println("Vybrana polozka neexistuje");
					}
					break;
				case 5:    //zavolan� metody na vypis databaze
					mojeDatabaze.vypisDatabazi();
					break;
				case 6:
					System.out.println("Zadejte jmeno souboru ktery bude vytvoren pro ulozeni databaze");  // popt�n� jm�na souboru pro ulo�en�
					if (mojeDatabaze.ulozDatabazi(sc.next()))  //metoda volajici ulozeni databaze s parametrem nazvu souboru zadaneho uzivatelem
						System.out.println("Databaze ulozena");  //kladne potvrzeni pri ulozeni
					else
						System.out.println("Databazi nebylo mozno ulozit");  //chybova hlaska pri neuspechu
					break;
				case 7: 
					System.out.println("Zadejte jmeno souboru ze ktereho bude nactena databaze"); //poptani nazvu souboru ze ktereho se ma databaze nacist
					if (mojeDatabaze.nactiDatabazi(sc.next()))  //volani nacteni databaze s parametrem ktery je uzivatelsky svstup
						System.out.println("Databaze nactena ze souboru");
					else
						System.out.println("Databazi nebylo mozno nacist"); //chybova hlaska kdyz soubor napr neexistuje
					break;
				case 8:
					run=false;  //ukonceni programu
					break;
			}
			
		}
	}

}

