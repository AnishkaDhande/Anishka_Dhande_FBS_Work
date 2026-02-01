import java.util.TreeSet;

class Employee1 implements Comparable
{
int id ;
String name;
double Salary;
@Override
public String toString() {
    return "Employee1 [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
}
public Employee1(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    Salary = salary;
}
//code to search data or row using **id 
//@Override
/*public int compareTo(Object o) {
    // TODO Auto-generated method stub
    Employee1 e1=(Employee1 )o;
    return this.id-e1.id ;
}*/

//code to search data or row using **name
@Override
 public int compareTo(Object o) {
    // TODO Auto-generated method stub
    Employee1 e1=(Employee1 )o;
    return this.name.compareTo(e1.name) ;
}

}
public class In_TreeSet {
    public static void main(String[] args) {
        TreeSet<Employee1> tr=new TreeSet<Employee1>();
        tr.add(new Employee1(34,"Prial",4500));
        tr.add(new Employee1(9,"Priya",23400));
        tr.add(new Employee1(21,"siya",34500));
         tr.add(new Employee1(8,"Riya",47500));
 for(  Employee1 k:tr )
 {
    System.out.println(k);
 }
 if(tr.contains(new Employee1 (9,"Riya",8900)))
 {
    System.out.println("Found");
 }
 else
 {System.out.println("Not Found");}
    }
}
