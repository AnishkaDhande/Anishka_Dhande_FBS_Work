import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class Student{
    int rollno;
    String name;
double marks;
public int getRollno() {
    return rollno;
}
public void setRollno(int rollno) {
    this.rollno = rollno;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getMarks() {
    return marks;
}
public void setMarks(double marks) {
    this.marks = marks;
}
public Student(int rollno, String name, double marks) {
    this.rollno = rollno;
    this.name = name;
    this.marks = marks;
}
@Override
public String toString() {
    return "\nStudent [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
}

}
class MarksComparator implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        Student s1=(Student)o1;
        Student s2=(Student)o2;
        return Double.compare(s1.marks,s2.marks);
    }

}
    public class Comparator2  {
    public static void main(String[] args) {
        List<Student> l1=new ArrayList<Student>();
        l1.add(new Student(34,"Radha" , 87));
        l1.add(new Student(4,"Anishka" , 77));
        l1.add(new Student(9,"Rani" , 52));
        l1.add(new Student(13,"Tanu" , 83));
        l1.add(new Student(65,"Aditya" , 37));
         
        System.out.println("Before Sorting ");
          for(Student s1:l1){
        System.out.println(s1);
          }

          Collections.sort(l1,new MarksComparator());

           System.out.println("After Sorting ");
          for(Student s1:l1){
        System.out.println(s1);
          }

          Collections.sort(l1,new MarksComparator());
    }
    
    
}

