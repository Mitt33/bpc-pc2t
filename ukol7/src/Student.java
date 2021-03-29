
public class Student {
	public Student(String jmeno, int rocnik)
	{
		this.jmeno=jmeno;
		this.rocnik=rocnik;
	}
	
	public String getJmeno()
	{
		return jmeno;
	}
	
	public int getRocnik()
	{
		return rocnik;
	}
	
	public float getStudijniPrumer(){
		return studijniPrumer;
	}

	public boolean setStudijniPrumer(float studijniPrumer) {
		if (1 <= studijniPrumer || 5 >= studijniPrumer ) 
		{
			this.studijniPrumer = studijniPrumer;
			return true;
			
		}
		else {
			System.out.println("Prumer musi lezet mezi 1 a 5");
			return false;
		}
	}

	private String jmeno;
	private int rocnik;
	private float studijniPrumer;
}