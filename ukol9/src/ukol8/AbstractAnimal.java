package ukol8;

public abstract class AbstractAnimal { 
	public AbstractAnimal(byte age) {
		// TODO Auto-generated constructor stub
		super();
		this.age=age;
	}
	public void sound() //abstaktni metoda sound
	{
		
	}
	
	private byte age; //byte age a jeho gettery a settery
	
	public byte getAge() {
			return age;
		}
	public void setAge(byte age) {
			this.age = age;
		}

}