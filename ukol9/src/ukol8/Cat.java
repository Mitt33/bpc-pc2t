package ukol8;

public class Cat extends AbstractAnimal { //nebudu popisovat vsechna zvirata - jsou v principu stejna
	public Cat(byte age){  //trida dedici z abstraktni metody 
		super(age);
	}
	@Override //prepis metody sound na konretni zvuk zvirete
	public void sound(){
	System.out.println("mnau");
	}
}
