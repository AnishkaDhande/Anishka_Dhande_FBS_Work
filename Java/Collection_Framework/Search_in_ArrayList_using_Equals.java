package collection;

import java.util.ArrayList;

public class Stud1 {
	int rollno;
	String Name;

	public Stud1(int rollno, String name) {
		super();
		this.rollno = rollno;
		Name = name;
	}

	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", Name=" + Name + "]";
	}
      public boolean equals(Object obj)
      {
    	  Stud1 s4=(Stud1)obj;
    	  if(s4.rollno==this.rollno)//Array set mdhye comparision nahi hot direct valu aahe ka check hote
		   return true;
    	  else
    		return  false;
    	  
      }
	
	
	
}
//class Student1 ends Here

class Test {
	public static void main(String args[]) {
		ArrayList<Stud1> stud = new ArrayList<Stud1>();
		stud.add(new Stud1(42, "Anu"));
		stud.add(new Stud1(2, "Madhu"));
		stud.add(new Stud1(8, "Ranu"));
		stud.add(new Stud1(7, "Pinky"));
		for (Stud1 st : stud) {
			System.out.println(st);
		}
               
		if(stud.contains(new Stud1(2, "Madhu")))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}
}
