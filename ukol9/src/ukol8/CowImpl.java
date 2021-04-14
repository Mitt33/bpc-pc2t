package ukol8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CowImpl implements Animal {
	public CowImpl(byte age) {
		super();
		this.age = age;
	}

	private byte age;

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	@Override
	public void sound() {
		System.out.println("bשששש");

	}

	@Override
	public String toString() {
		return "CowImpl age=" + age;
	}

	@Override
	public void save() {
		try {
			FileWriter fileWriter = new FileWriter("zvukyZvirat.txt", true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("bשששש");
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}