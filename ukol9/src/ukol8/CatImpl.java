package ukol8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CatImpl implements Animal { //vsehcny zvirata impl budou opet stejná
	public CatImpl(byte age) { //obsahuji atribut age
		super();
		this.age = age;
	}

	private byte age;

	public byte getAge() { //getter a setter age
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	@Override  //prepisuji metodu sound
	public void sound() {
		System.out.println("mnau");

	}

	@Override  //implementace metody to string pro jednotlive tridy
	public String toString() {
		return "CatImpl age=" + age;
	}

	@Override //implementace ulozeni do souboru
	public void save() {
		try {
			FileWriter fileWriter = new FileWriter("zvukyZvirat.txt", true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("mnau");
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}