
public class Vyjimky extends java.lang.Exception{
	public Vyjimky()  //vyjimka bez vstupu
	{
		super("Nezadan zadny prumer"); //vypise nezad�n� pr�meru
	}
	public Vyjimky(float prumer) //vyjimka pro setter prumeru, kter� �e�� nezad�n� prum�ru mezi 1 a 5
	{
		super("Prumer nebyl zadan v intervalu 1 az 5. Zadali jste: " + prumer);
	}

}