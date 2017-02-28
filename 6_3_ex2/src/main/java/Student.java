import java.util.ArrayList;

import lombok.Data;

@Data
public class Student {
	
	private String name;
	private int age;
	private ArrayList<String> hobbys;
	private double height;
	private double weight;
	
	public Student(String name, int age, ArrayList<String> hobbys) {
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}	
}
