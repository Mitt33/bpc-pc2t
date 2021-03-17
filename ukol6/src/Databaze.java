import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Databaze {
	public Databaze(int pocetPrvku)
	{
		prvkyDatabaze=new Student[pocetPrvku];  // vytvoøení databaze o veikosti na základì vstupu uživatele
		sc=new Scanner(System.in);
	}
	
	public void setStudent(){  //setter pro vložení jména a roku studenta
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno=sc.next();
		int rok=Test.pouzeCelaCisla(sc);
		prvkyDatabaze[posledniStudent++]=new Student(jmeno,rok);
	}
	
	public Student getStudent(int idx) {   // getter pto prvky databaze
		return prvkyDatabaze[idx];
	}
	
	public void setPrumer(int idx, float prumer) throws Vyjimky{ //setter pro prùmìr, vyjimku ale pøedáváme do vyšší tøídy a tam jí øešíme
		prvkyDatabaze[idx].setStudijniPrumer(prumer);
	}
	
	public void vypisDatabazi() throws Vyjimky  //metoda pro vypis databze (nesla mi vytvorit bez toho aniz by odkazovala na tridu Vyjimky)
	{
		for (int i=0;i<prvkyDatabaze.length;i++){ //cyklus for prochazejici prvky databaze a u kazdeho indexu vypise informace
			if (prvkyDatabaze[i]!=null)
				System.out.println(i+". jmeno: "+prvkyDatabaze[i].getJmeno() +", narozen: " + prvkyDatabaze[i].getRocnik() +", prumer: " +prvkyDatabaze[i].getStudijniPrumer());
			else
				System.out.println(i+". "+"zadne zaznamy"); //vypis ze o stdentovi nejsou zaznamy 
		}
	}
	
	public boolean ulozDatabazi(String jmenoSouboru) throws Vyjimky //metoda pro ulozeni databaze
	{
		try {
			FileWriter fw = new FileWriter(jmenoSouboru);  //filewriter s parametrem nazvu souboru
			BufferedWriter out = new BufferedWriter(fw);	// buffered writer a v parametru fw
			for (int i=0;i<prvkyDatabaze.length;i++){ //cyklus prochazejici prvky databaze ktery vzdy vypise dane informace o studentovi do souboru
				if (prvkyDatabaze[i]!=null)      //foramtovani je oddeleno stredniky - aby se poudeji rozlisilo ktera hodnota je jmeno, rok atd
					out.write(prvkyDatabaze[i].getJmeno() +";" + prvkyDatabaze[i].getRocnik() +";" + prvkyDatabaze[i].getStudijniPrumer());
				else
					out.write("null"); 
				out.newLine(); // formatovani - novy radek po kazdem studentovi
			}
			out.close();  //zavreni filewriteru a bufferedWriteru
			fw.close();
		}
		catch (IOException e) {   
			System.out.println("Soubor nelze vytvorit");  // chyceni vyjimek kdyz soubor nejde vytvorit
			return false;
		}
		return true;  //navrat true, ktery znamena, ze metoda v mainu vypise ze databaze byla ulozena
	}
	
	public boolean nactiDatabazi(String jmenoSouboru) { //metoda pro nacteni databaze ze souboru
		FileReader fr=null;
		BufferedReader in=null;
		int pocetRadku = 0; //databaze bude velka jako pcoet radku v souboru
		try {
			fr = new FileReader(jmenoSouboru);
			in = new BufferedReader(fr);
			while (in.readLine()!= null) {
				pocetRadku++; //pocitani radku
			}
			in.close();
			fr.close();
			fr = new FileReader(jmenoSouboru);  //fr a br zavreme a otevreme a tim se dostaneme opet na zacatek souboru
			in = new BufferedReader(fr);
			this.prvkyDatabaze = new Student[pocetRadku]; //vytvoreni databaze o velikosti poctu radku
			for (int i = 0; i < pocetRadku; i++) { //cyklus ktery projde databazi po radcich
				String line = in.readLine();
				String []lineSplit = line.split(";"); //nacteni radku a rozdeleni pomoci ; vloženeho pri zapisu
				int rok = Integer.parseInt(lineSplit[1]); //vime ze druha polozka je rok
				this.prvkyDatabaze[i] = new Student(lineSplit[0], rok); //vytvoreni studenta
				float prumer = Float.parseFloat(lineSplit[2]); //treti polozak je prumer
				if (prumer !=0) {
					this.prvkyDatabaze[i].setStudijniPrumer(prumer); //nahrani prumeru
					}
				this.posledniStudent = pocetRadku;
			}
		}
		catch (IOException e) {    //osetreni ruznych typu vyjimek
			System.out.println("Soubor  nelze otevøít"); //vypsani chybové hlášky a návratova hodnota nastavena na false
			return false;
		} 
		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Chyba formatu dat");
			return false;
		} 
		catch (Vyjimky e) {
			// TODO Auto-generated catch block
			System.out.println("Nespravna data v souboru");
			return false;
		}
		finally   //blok ktery se vzdy provede jako posledni
		{
			try
			{	if (in!=null) //kontrola jestli je buufer reader prazdny a pote se zavre
				{
					in.close();
					fr.close();
				}
			}
			catch (IOException e) {
				System.out.println("Soubor  nelze zavrit");
				return false;
			} 
		}
		
		return true; //navratova hodnota true pokud nedoslo k zadne vyjimce
	}
	
	
	
	private Scanner sc;
	private Student [] prvkyDatabaze;
	private int posledniStudent;
}