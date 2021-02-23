package ukol3;

public class BPC2 implements Pøedmìt{
	private int ProjektBody,SemestralkaBody,ZkouskaBody;
	
	public String getJmeno() {
		return "BPC2";
	}
		
	public int getBody() {
		return ProjektBody + ZkouskaBody + SemestralkaBody;
	}
	
	public void setProjektBody(int Body){
		if (ProjektBody + Body < 31){
			ProjektBody += Body;
		} 
		else {
			System.out.println("Maximální hodnocení projektu je 20 bodù .");
		}	
	}
	
	public void setSemestralkaBody(int Body){
		if (SemestralkaBody + Body <21) {
			SemestralkaBody += Body;
		}
		else {
		System.out.println("Maximální poèet bodù za pùlsemestrální test je 20!");	
		}
	}
	
	public void setZkouskaBody(int Body){
		if (ZkouskaBody + Body <51) {
			ZkouskaBody += Body;
		}
		else {
		System.out.println("Maximální poèet bodù za závìreènou zkoušku je 50!");	
		}
	}
	
	public void getInfo() {
		if ((ProjektBody + SemestralkaBody) >= BodyZapocet) {
			System.out.println("Z pøedmìtu " +getJmeno()+ " máte zápoèet");
		}
		else {
			System.out.println("Z pøedmìtu " +getJmeno()+ " nemáte zápoèet");
		}
		
	}
}
