package ukol3;

public class BPC1 implements Pøedmìt{
	private int CviceniBody,ZkouskaBody;
	
	public String getJmeno() {
		return "BPC1";
	}
	
	public int getBody() {
		return CviceniBody + ZkouskaBody;
	}
	
	public void setCviceniBody(int Body){
		if (CviceniBody + Body < 21){
			CviceniBody += Body;
		} 
		else {
			System.out.println("Maximální hodnocení aktivity  ve cvièeních je 20 bodù.");
		}	
	}
	
	public void setZkouskaBody(int Body){
		if (ZkouskaBody + Body <81) {
			ZkouskaBody += Body;
		}
		else {
		System.out.println("Maximální poèet bodù za zkoušku je 80!");	
		}
	}
	
	public void getInfo() {
		if (CviceniBody >= BodyZapocet) {
			System.out.println("Z pøedmìtu " +getJmeno()+ " máte zápoèet.");
		}
		else {
			System.out.println("Z pøedmìtu " +getJmeno()+ " nemáte zápoèet.");
		}
		
	}
	
	
}


