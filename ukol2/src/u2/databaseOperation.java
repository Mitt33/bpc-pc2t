package u2;
import java.util.Scanner;

public class databaseOperation {
	public static void main(String[] args) 
	{
	 databaze []poleDatabaze = new databaze[3];                //bod 1 - pole databaze o veliksoti 3
	 for(int i=0; i<poleDatabaze.length; i++) {                 // bod 2 - naplneni pole hodnotami jmeno a rok
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadej jm�no "+(i+1)+". �lov�ka: ");
		String jmeno = sc.nextLine();
		System.out.println("Zadejte rok narozen� "+(i+1)+". �lov�ka:");
		int rok = sc.nextInt();
		poleDatabaze[i] = new databaze(jmeno, rok);
	 	}
	 
	
	//bod 3 - zadani maximalniho povoleneho uvazku
    Scanner sc = new Scanner(System.in);
	System.out.println("Zadejte maxim�ln� v��i �vazku: ");
	databaze.setMaxUvazek(sc.nextDouble());

	// bod 4 - smy�ka vypisuj�c� na po��d�n� skrz index jmeno, rok a uvazek (dosa�en� max �vazku) jednotliv�ch osob
		while (true){
			System.out.println("Zadejte index osoby:");
			int index = sc.nextInt();
			if (index < poleDatabaze.length && index >=0){
				System.out.println("Jm�no osoby je: "+poleDatabaze[index].getJmeno()+" (narozen roku "+poleDatabaze[index].getRok()+").\nAktu�ln� �vazek je: "+poleDatabaze[index].getUvazek());
				System.out.println("Zadejte v��i nov�ho �vazku:");
				double novyUvazek = sc.nextDouble();
				if (poleDatabaze[index].zmena(novyUvazek)){
					System.out.println("Nov� �vazek je: "+poleDatabaze[index].getUvazek());
					}
				else{
					System.out.println("�vazek p�ekra�uje maxim�ln� mo�nou hodnotu! \nnyn�j�� �vazek je:" +poleDatabaze[index].getUvazek());
					}
			}
		
		}
	}
}




