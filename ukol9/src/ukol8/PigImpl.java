package ukol8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PigImpl implements Animal {
	public PigImpl(byte age) {
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
		System.out.println("chro chro");

	}

	@Override
	public String toString() {
		return "PigImpl [age=" + age;
	}

	@Override
	public void save() {
		try {
			FileWriter fileWriter = new FileWriter("zvukyZvirat.txt", true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("chro chro");
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}