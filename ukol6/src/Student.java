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
	
	public float getStudijniPrumer() throws Vyjimky { // getter studijniho prumeru kter� p�ed� vyjimku kdy� pr�m�r nen� zad�n
		if (studijniPrumer==0)
			throw new Vyjimky();
		return studijniPrumer;
	}

	public void setStudijniPrumer(float studijniPrumer) throws Vyjimky {  //setter kter� p�ed� v�jimku kdy� pr�m�r nen� mezi 1 a 5
		if (studijniPrumer<1||studijniPrumer>5)
			throw new Vyjimky(studijniPrumer);
		this.studijniPrumer = studijniPrumer;
	}

	private String jmeno;
	private int rocnik;
	private float studijniPrumer;
}