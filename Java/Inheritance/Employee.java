public class Employee {
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary)
    {
        this.id =id;
        this.name=name;
        this.salary=salary;
    }
    void display()
    {
        System.out.println("Employee id is "+this.id);
        System.out.println("Employee Name is "+this.name);
        System.out.println("Employee Salary is "+this.salary);
    }
    
    
}
class SalesManager extends Employee
{
    double incentive;
    int target;
    SalesManager(int id,String name,double salary ,double incentive,int target)
    {
        super(id,name,salary);
        this.incentive=incentive;
        this.target=target;
    }
    void display()
    {  
        System.out.println("Data of SalesManager Department");
        super.display();
        System.out.println("The incentive is "+incentive);
        System.out.println("The target is "+target);
    }
   



}
class HR extends Employee{
    double commision;
    HR(int id,String name,double salary,double commision)
    {   super(id,name,salary);
        this.commision=commision;

    }
    void display()
    { 
        System.out.println("Data of HR Department");
        super.display();
        System.out.println("Commision amount is "+commision);
    }
    
    
}
class Test{
    public static void main(String args[])
    {    
        SalesManager s=new SalesManager(12,"Sumit",12000,2400,23);
        s.display();

        HR h=new HR(13,"Anishka",13000,4000);
        h.display();

    }
}
