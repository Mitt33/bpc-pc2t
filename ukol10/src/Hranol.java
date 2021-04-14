
public class Hranol extends Ctverec{ 										//chyba 2 - preklep extends Ctverce

	// konstruktor se zadanim delky hrany, vysky a materialu
	Hranol(float podstava,float vyska, boolean drevena){
		super(podstava);													//chyba 3 - chybelo super(podstava)
		hrana=vyska;
		zeDreva=drevena;
		pocetHranolu++;
	}
	
	// vypocet objemu hranolu
	float vypoctiObjem() {
		return this.hrana*vypoctiObsah();										//chyba 4- opraven vypocet objemu (pocital vyska^3)
	}
	
	// nastaveni materialu
	void setDreveny(boolean dreveny){
		zeDreva=dreveny;
	}
	
	// zjisteni materialu
	boolean jeDreveny(){
		return zeDreva;
	}
	
	// zjisteni celkoveho poctu existujicich kostek
	static int getPocetHranolu(){
		return pocetHranolu; 											//chyba 5 - pocetHranolu nebylo static 
	}
	
	// zjisteni vysky hranolu
	float getHrana(){					
		return hrana;
	}
	// nastaveni vysky hranolu
	void setHrana(float delka){			
		hrana=delka;
	}
		
	private float hrana;
	boolean zeDreva;
	static int pocetHranolu=0;										//chyba 5* - final nahrazeno static
	
	
}
