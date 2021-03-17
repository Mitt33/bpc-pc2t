
public class Vyjimky extends java.lang.Exception{
	public Vyjimky()  //vyjimka bez vstupu
	{
		super("Nezadan zadny prumer"); //vypise nezadání prùmeru
	}
	public Vyjimky(float prumer) //vyjimka pro setter prumeru, která øeší nezadání prumìru mezi 1 a 5
	{
		super("Prumer nebyl zadan v intervalu 1 az 5. Zadali jste: " + prumer);
	}

}