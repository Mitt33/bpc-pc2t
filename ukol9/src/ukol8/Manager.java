package ukol8;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
		public Manager(String nickname, String email, char[] password) {
		super(nickname, email, password);  //employee se stejnymi atrubuty 
	}
		
		private List<Employee> listOfEmployees = new ArrayList<Employee>();  //listy emplyees a secretarian
		private List<Employee> listOfRelationships = new ArrayList<Employee>();  //generictký list of relations
		
		public List<Employee> getListOfEmployees() {  //getery a setery
			return listOfEmployees;
		}
		public void setListOfEmployees(List<Employee> listOfEmployees) {
			this.listOfEmployees = listOfEmployees;
		}
		public List<Employee> getListOfRelationships() {
			return listOfRelationships;
		}
		public void setListOfRelationships(List<Employee> listOfRelationships) {
			this.listOfRelationships = listOfRelationships;
		}
		public void addEmploye(Employee employee) {
			listOfEmployees.add(employee);
			
		}
		public void addRelation(Employee secretary) {
			listOfRelationships.add(secretary);
			
		}
		
		public void vypisZamestnancu() {  //cyklus pro vypis zamestnancu
			System.out.println("Zamestnanci manazera jsou: ");
			for (int i = 0; i < listOfEmployees.size(); i++) {
				System.out.println(listOfEmployees.get(i));
			}
		}
		public void vypisVztahu() { //cyklus pro vypis vztahu
			System.out.println("\nManazer ma pomer se sekretarkou: ");
			for (int i = 0; i < listOfRelationships.size(); i++) {
				System.out.println(listOfRelationships.get(i));
			}
		}
		

		
}