
package collection;

import java.util.ArrayList;
import java.util.TreeSet;
//import java.util.TreeSet;

public class Student implements Comparable
{
	int rollno;
	String name;

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		System.out.println("Inside compare to");
		Student s2=(Student) o;//downcasting
				 return this.rollno-s2.rollno;//treeset mdhye value ch comparison hote 0=equal,-ve=less,+ve=greater
	}
	
	

}

//class student ends here
class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Code of ArrayList element finding
		// in ArrayList We use equals() function of object class
		TreeSet<Student> studentlist = new TreeSet<>();
		studentlist.add(new Student(15, "Anishka"));
		studentlist.add(new Student(7, "Truptika"));
		studentlist.add(new Student(4, "Jayesh"));
		studentlist.add(new Student(8, "Prachi"));
            
		for (Student s : studentlist) {
			System.out.println(s);
		}
		if(studentlist.contains(new Student(4, "Jayesh")))
		{
			System.out.println("Found");
			
		}
		else {
			System.out.println("Not Found");
			
		}

	}

	
}