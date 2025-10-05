public class Vehical {
    int licenceid;
    String color;
    int wheel;
    Vehical( int licenceid,String color,int wheel)
    {
        this.licenceid=licenceid;
        this.color=color;
        this.wheel=wheel;
    }
    void display()
    {
        System.out.println("Vehical id is "+this.licenceid);
        System.out.println("Vehical color is "+this.color);
        System.out.println("Vehical has Number of wheels is "+this.wheel);
    }
    
}
class Car extends Vehical
{
   String brand;
    String Model;
    Car( int licenceid,String color,int wheel,String brand,String Model)
    {  super(licenceid,color,wheel);
        this.brand=brand;
        this.Model=Model;
    }
     void display()

     {  
        System.out.println("This is Car information ");
        super.display();
        System.out.println("Car Model is "+Model);
        System.out.println("Car Brand is "+brand);
     }
}
class bike extends Vehical
{ 
      String Company_name;
      bike(int licenceid,String color,int wheel, String Company_name)
    {
    super(licenceid,color,wheel);
    this.Company_name=Company_name;
    }
    void display()
    {   
         System.out.println("This is Bike information ");
        super.display();
        System.out.println("The bike company is "+this.Company_name);

    }
}
class Test1
{
    public static void main(String args[])
    {
       bike b=new bike(2077,"Blue",2,"Honda");
       b.display();
       Car c=new Car(4387,"Grey",4,"Honda","Creta");
       c.display();
    }
}