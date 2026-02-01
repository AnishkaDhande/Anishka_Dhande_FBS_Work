import java.util.ArrayList;

class Employee
{
int id;
String name;
double salary;
@Override
public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;

}
@Override
public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    Employee e1=(Employee)obj;
    if(this.id==e1.id || this.name==e1.name)//search by id or nmae both
    return true;
else return false;
}


}//class employee ends here
public class Emp {
    public static void main(String[] args) {
        ArrayList<Employee> emp=new ArrayList<Employee>();
        emp.add(new Employee(2,"Ram",9800));
        emp.add(new Employee(45,"Shyam",23000));
        emp.add(new Employee(32,"Radha",54200));
        emp.add(new Employee(91,"Krishna",12300));
    
for(Employee e:emp)
{
    System.out.println(e);
}
if(emp.contains(new Employee(3,"Ram",9800)))
{
    System.out.println("Found");
}
else {
    System.out.println("Not found");
}
}
}
