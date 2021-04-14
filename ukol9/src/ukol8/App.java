package ukol8;
/** abstrktni trida: trida ktera nema definovane nektere metody - tridy z ni dedi a tridy si prepisou. nemuze se primo z abstraktni tridy tvorit objekty
 * vs
 * rozhrani- poze seznam metod, ktere dalsi tridy musi obsahovat, odvozene tridy musi definovat vsechny metody. Objekt taktez nemuze byt vytvoren primo v teto tride
 * 
 * enumerace: je k nim lepsi pristup, vyplati se kdyz je predem znamy a omezeny pocet hodnot ze ketrho budeme vybirat
 * vs
 * String: vhodny kdyz nezname celkovy pocet hodnot
 * 
@author Martin Svoboda
*/


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub", n);
		char[] heslo ={ 'a', 'b', 'c', 'd', 'e' }; //heslo jsou tyto chary, jinak je nebudu vypisovat ani zverejnovat
		Employee e1= new Employee("e1", "zamestnanec1@vutbr.cz", heslo);  //vytvoreni instatni 5 emplyee, 1 manager a 2 secretarian
		Employee e2= new Employee("e2", "zamestnanec2@vutbr.cz", heslo);
		Employee e3= new Employee("e3", "zamestnanec3@vutbr.cz", heslo);
		Employee e4= new Employee("e4", "zamestnanec4@vutbr.cz", heslo);
		Employee e5= new Employee("e5", "zamestnanec5@vutbr.cz", heslo);
		Manager m1 = new Manager("m1", "manazer@vutbr.cz", heslo);
		Secretarian s1= new Secretarian("s1", "sekretarka1@vutbr.cz,", heslo, 164);
		Secretarian s2= new Secretarian("s2", "sekretarka2@vutbr.cz", heslo, 798);

		m1.addEmploye(e1); //pridani zamestnancu manazerovi
		m1.addEmploye(e2);
		m1.addEmploye(e3);
		m1.addEmploye(e4);
		m1.addEmploye(e5);
		m1.addRelation(s2); //pridani vztahu do listo of realtions
		
		m1.vypisZamestnancu(); //zavolani metody na vypis zamestnancu a vztahu
		m1.vypisVztahu();
		
		byte age = 3; //nahrani cisla to byte hodnoty
		
		Cat c = new Cat(age);  //vytvoreni instanci zvirat
		Dog d = new Dog(age);
		Pig p = new Pig(age);
		Cow cw = new Cow(age);
		Goat g = new Goat(age);
		
		System.out.println("\nzvuky zvirat u abstraktni tridy jsou: ");
		
		c.sound(); //zavolani metody sound
		d.sound();
		p.sound();
		cw.sound();
		g.sound();
		
		CatImpl cat = new CatImpl(age);
		DogImpl dog = new DogImpl(age);
		PigImpl pig = new PigImpl(age);
		CowImpl cow = new CowImpl(age);
		GoatImpl goat = new GoatImpl(age);
		
		System.out.println("\nZvuky zvirat ktere jsou implementovany z interface a ulozeny v textovem souboru: ");
		
		cat.save();
		cat.sound();
		dog.save();
		dog.sound();
		pig.save();
		pig.sound();
		cow.save();
		cow.sound();
		goat.save();
		goat.sound();
		
	}

}
