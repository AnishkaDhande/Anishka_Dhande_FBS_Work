public class Animal {
    int age;
    String color;
    Animal(int age,String color)
    {
        this.age=age;
        this.color=color;
    }
    void eat()
    {
        System.out.println("eat food");
    }
    void sleep()
    {
        System.out.println("take sleep for Rest body");
    }
    void display()
    {
        System.out.println("Age is "+age);
        System.out.println("Color is "+color);
    }
}
class Dog extends Animal
{
     String isTrained,species;
     Dog(int age,String color,String isTrained, String species){
        super(age,color);
        this.isTrained=isTrained;
        this.species=species;
     }
    void bark()
    {
      System.out.println("Dog Bark Bow-Bow");
    }
    void display()
    {    super.display();
        System.out.println("Dog is Trained : "+isTrained);
        System.out.println("Species of dog  is "+species);
    }
}
class Cow extends Animal
{
  double milkLiters,hornSize;
   Cow(int age,String color,double milkLiters,double hornSize)
   {
    super(age,color);
    this.milkLiters=milkLiters;
    this.hornSize=hornSize;
   }
  void Moo()
  {
    System.out.println("Sounds mOoo-Mooo");
  }
  void display()
  {  System.out.println("This is cow info");
    System.out.println("The Liter of milk Gives cow in a day is "+milkLiters);
    System.out.println("HornSize is "+hornSize);
    super.display();
  }

}

class Testing
{
    public static void main(String args[])
    {
        Dog d=new Dog(12,"White","Yes","labra");
        d.bark();
        d.eat();
        d.sleep();
        d.display();
        Cow c= new Cow(5,"Brown",15.2,1.2);
        c.display();
        c.Moo();
    }
}