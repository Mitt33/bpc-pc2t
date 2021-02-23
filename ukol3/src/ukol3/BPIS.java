package ukol3;

public class BPIS implements Pøedmìt{
	private int PocetBodu;
	
	public String getJmeno() {
		return "BPIS";
	}
	
	public int getBody() {
		return PocetBodu;
	}
	
	public void getInfo() {
		if ( PocetBodu >= BodyZapocet) {
			System.out.println("Z pøedmìtu "+getJmeno()+ " máte zápoèet ");
		}
		else {
			System.out.println("Z pøedmìtu " +getJmeno()+ " nemáte zápoèet");
		}
	}
	
	public void setPocetBodu(int Body){
		if (PocetBodu + Body < 101) {
			PocetBodu += Body;
		}
		else {
			System.out.println("pøekroèil jste maximální možný poèet bodù 100! ");
		}
	}
	
}


