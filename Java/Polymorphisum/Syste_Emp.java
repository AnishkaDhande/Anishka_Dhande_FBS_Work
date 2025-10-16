

import java.util.Scanner;

class Employee
{
    int employee_id;
    String employee_name;
    double salary;
    Employee(int employee_id,String employee_name,double salary)
    {
    this.employee_id=employee_id;
    this.employee_name =employee_name;
    this.salary=salary;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getEmployee_id() {
        return employee_id;
    }
    public String getEmployee_name() {
        return employee_name;
    }
    public double getSalary() {
        return salary;
    }
     void display()
     {
        System.out.println("Employee ID is "+this.employee_id);
        System.out.println("Employee Name is "+this.employee_name);
        System.out.println("Employee Basic Salary is "+this.salary);
     }
     double calculateSalary()
     {
        return salary;
     }
     
}

class HR extends Employee
{
    double commision;
     HR(int employee_id,String employee_name,double salary,double commision)
     {
         super(employee_id,employee_name,salary);
         this.commision=commision;
     }
     public void setCommision(double commision) {
         this.commision = commision;
     }
     public double getCommision() {
         return commision;
     }
     void display()
     {
        super.display();
        System.out.println("Commision is "+this.commision);
        System.out.println("The Total  salary is "+calculateSalary());
     } 
     double calculateSalary()
     {
         salary=salary+(salary*commision/100);
         return salary;
     }
     
}
class SalesManager extends Employee
{
    int target;
    double incentive;
    SalesManager(int employee_id,String employee_name,double salary,int target,double incentive)
    {
    super(employee_id, employee_name, salary);
    this.target=target;
    this.incentive=incentive;
    }
    public void setTarget(int target) {
        this.target = target;
    }
    public int getTarget() {
        return target;
    }
    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }
    public double getIncentive() {
        return incentive;
    }
    void display()
    {
        super.display();
        System.out.println("Target is "+this.target);
        System.out.println("Incentive Amount is "+this.incentive);
        System.out.println("The Total  salary is "+calculateSalary());
    }
    double calculateSalary()
     {
        return salary+incentive;
     }
    

}

class Admin extends Employee
{
    double allowance;
    Admin( int employee_id,String employee_name,double salary, double allowance)
    {
     super(employee_id, employee_name,salary);
     this.allowance=allowance;
    }
    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    public double getAllowance() {
        return allowance;
    }
    void display()
    {
        super.display();
        System.out.println("Allowance amount is "+this.allowance);
        System.out.println("The Total  salary is "+calculateSalary());
    }
      double calculateSalary()
     {
        return salary+allowance;
     }
      


     

}

public class Syste_Emp{
    public static void main(String args[])
    {
        Employee e1;//Reference created or called as generic refernce
        e1=new HR(123,"Rohit",23000,5600);//Obeject of HR is created using new keyword

       e1.display();   //function called for HR by using super class

        e1=new SalesManager(141,"Rishiak",26000,70,550);
        e1.display();
        

        e1=new Admin(321,"Anishka",35000,3600);
        
        
    }
}

/*public class Syste {
    public static void main(String args[])
    {
       HR h1=new HR(67,"Ritik",56000,12000);
       SalesManager s1=new SalesManager(89,"Anishka",45000,34,34000);
       Admin a1=new Admin(54,"Aditya",46000,2300);
       h1.display();
       a1.display();
       s1.display();
         a1.setSalary(86000);
         a1.display();
    
    }
    
}

    
}*/
