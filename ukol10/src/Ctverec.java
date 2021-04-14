class Ctverec {

	private float hrana;
	// vypocet obsahu ctverce
	float vypoctiObsah(){							//chyba 0.5 - nevim duvod proè z nasobeni floatu dìlat int
		return hrana*hrana;		
	}
	// zjisteni delky hrany ctverce
	float getHrana(){					
		return hrana;
	}
	// nastaveni delky hrany ctverce
	void setHrana(float delka){			
		hrana=delka;
	}
	// konstruktor se zadanim delky hrany ctverce
	Ctverec(float hrana){				
		this.hrana=hrana;							//chyba 1 -  dopsano "this." pred levou stranu
	}
}
