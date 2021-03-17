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
	
	public float getStudijniPrumer() throws Vyjimky { // getter studijniho prumeru který pøedá vyjimku když prùmìr není zadán
		if (studijniPrumer==0)
			throw new Vyjimky();
		return studijniPrumer;
	}

	public void setStudijniPrumer(float studijniPrumer) throws Vyjimky {  //setter který pøedá výjimku když prùmìr není mezi 1 a 5
		if (studijniPrumer<1||studijniPrumer>5)
			throw new Vyjimky(studijniPrumer);
		this.studijniPrumer = studijniPrumer;
	}

	private String jmeno;
	private int rocnik;
	private float studijniPrumer;
}