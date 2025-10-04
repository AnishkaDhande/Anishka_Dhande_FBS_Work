class Student{
    int fid;
    String name;
    double dist;
    public int getFid() {
        return fid;
    }
    public void setFid(int fid) {
        this.fid = fid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getDist() {
        return dist;
    }
    public void setDist(double dist) {
        this.dist = dist;
    }

    public Student(int fid, String name, double dist) {
        this.fid = fid;
        this.name = name;
        this.dist = dist;
    }
    
    void display()
    {
        System.out.println("The Fid id "+this.fid);
        System.out.println("The Name of Student is "+this.name);
        System.out.println("The distance traveled is "+this.dist);
    }

}
class Placedstudent extends Student
{
     String Company_name;
     String Designation;
     public String getCompany_name() {
         return Company_name;
     }
     public void setCompany_name(String company_name) {
         Company_name = company_name;
     }
     public String getDesignation() {
         return Designation;
     }
     public void setDesignation(String designation) {
         Designation = designation;
     }
     public Placedstudent(int fid, String name, double dist, String company_name, String designation) {
        super(fid, name, dist);
        Company_name = company_name;
        Designation = designation;
     }
     void display()
     {
        super.display();
        System.out.println("Company name is "+this.Company_name);
        System.out.println("Designamation is "+this.Designation);
     }
     
}
class FbsStud{

    public static void main(String args[])
    {
        Placedstudent s1=new Placedstudent(56,"Anupma",600,"HCL","Manager");
        s1.display();
    }
}