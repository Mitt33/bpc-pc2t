package ukol8;

public class Employee implements Comparable<Employee> { 
	private String nickname;    //trida employee s privatnimi atrubuty nickname, email a password (char)
	private String email;
	private char[] password;
	enum EmployeeType {ACTIVE, INACTIVE, DELETED}  //enumerace employee type
	
	public Employee(String nickname, String email, char[] password) {
		this.nickname = nickname;
		this.email = email;
		this.password = password;
	}
	public String getNickname() { //gettery a settery
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	};
	@Override
	public int compareTo(Employee employee) {  //metoda na porovnani mailu
        return this.getEmail().compareTo(employee.getEmail());
    }
	@Override
	public String toString() {  //metoda to string
		return "nickname: " + nickname + ", email: " + email;
	}
	

	
}
