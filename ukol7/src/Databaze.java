import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Databaze {
	
	private Map<String,Student>  prvkyDatabaze;
	
	Databaze()   //nahrazení metody s polem Prvkydatabaze typem hashmap
	{
		prvkyDatabaze=new HashMap<String,Student>(); //klièem je jmeno studenta
	}
	
	public boolean setStudent(String jmeno,int rok)  //upraveni metody setStudent, typboolean = vrací true když je student nalezen a použije jeho jmeno a rok a flase když neexistuje
	{
		if (prvkyDatabaze.put(jmeno,new Student(jmeno,rok))==null)
			return true;
		else
			return false;
	}
	
	public Student getStudent(String jmeno) //upraveni metody get student aby bylo použito jeho jmeno
	{
		return prvkyDatabaze.get(jmeno);
	}
	
	public boolean setPrumer(String jmeno,float prumer) //uprava metody setPrumer,
	{
			if (prvkyDatabaze.get(jmeno)==null) //když jmeno není nalezeno - je navratová hodnota false
				return false;
			return prvkyDatabaze.get(jmeno).setStudijniPrumer(prumer); //když je nalezeno - je navratem zavolani metody setStudijniPrumer podle jmena studenta
	}
	
	public void vypisDatabaze() //metoda pro vypis vsech studentu
	{
		Set<String> seznamJmen= prvkyDatabaze.keySet(); //set seznamu jmen
		
		for(String jmeno:seznamJmen)  //cyklus na vypis jmen ze seznamu jmen
			System.out.println(jmeno);
		
	}
	public boolean odstranStudenta(String jmeno)  //metoda pro odstraneni studenta
	{
		if (prvkyDatabaze.remove(jmeno)!=null)  
			return true; //kladna navratova hodnota když došlo k odstraneni
		return false; 
	}
}