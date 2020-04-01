package qa.com.main;

import java.util.*;

public class Runner {
	public static void main(String[] args) {
		
		
		Person pers1 = new Person("John", 25, "Architect");
		Person pers2 = new Person("James", 20, "Builder");
		Person pers3 = new Person("Jane", 24, "Electrician");
		Person pers4 = new Person("Judy", 23, "Actor");
//		pers.setName("John");
//		pers.setAge(25);
//		pers.setJobTitle("Architect");
//		System.out.println(pers.toString());
		
		List<Person> listOfPeople = new ArrayList<>();
		listOfPeople.add(pers1);
		listOfPeople.add(pers2);
		listOfPeople.add(pers3);
		listOfPeople.add(pers4);
		
		System.out.println(listOfPeople);
	}
}