package ukol8;

public class Secretarian extends Employee{

	public Secretarian(String nickname, String email, char[] password, int age) {
		super(nickname, email, password); //stejne atributy
		}
	private int age;  //privatni vek
	public int getAge() {//getter a settr veku
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
