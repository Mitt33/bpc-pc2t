package u2;
import java.util.Scanner;

public class databaseOperation {
	public static void main(String[] args) 
	{
	 databaze []poleDatabaze = new databaze[3];                //bod 1 - pole databaze o veliksoti 3
	 for(int i=0; i<poleDatabaze.length; i++) {                 // bod 2 - naplneni pole hodnotami jmeno a rok
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadej jméno "+(i+1)+". èlovìka: ");
		String jmeno = sc.nextLine();
		System.out.println("Zadejte rok narození "+(i+1)+". èlovìka:");
		int rok = sc.nextInt();
		poleDatabaze[i] = new databaze(jmeno, rok);
	 	}
	 
	
	//bod 3 - zadani maximalniho povoleneho uvazku
    Scanner sc = new Scanner(System.in);
	System.out.println("Zadejte maximální výši úvazku: ");
	databaze.setMaxUvazek(sc.nextDouble());

	// bod 4 - smyèka vypisující na požádání skrz index jmeno, rok a uvazek (dosažení max úvazku) jednotlivých osob
		while (true){
			System.out.println("Zadejte index osoby:");
			int index = sc.nextInt();
			if (index < poleDatabaze.length && index >=0){
				System.out.println("Jméno osoby je: "+poleDatabaze[index].getJmeno()+" (narozen roku "+poleDatabaze[index].getRok()+").\nAktuální úvazek je: "+poleDatabaze[index].getUvazek());
				System.out.println("Zadejte výši nového úvazku:");
				double novyUvazek = sc.nextDouble();
				if (poleDatabaze[index].zmena(novyUvazek)){
					System.out.println("Nový úvazek je: "+poleDatabaze[index].getUvazek());
					}
				else{
					System.out.println("Úvazek pøekraèuje maximální možnou hodnotu! \nnynìjší úvazek je:" +poleDatabaze[index].getUvazek());
					}
			}
		
		}
	}
}




