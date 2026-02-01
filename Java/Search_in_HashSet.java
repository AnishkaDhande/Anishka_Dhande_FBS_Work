import java.util.HashSet;

class Students{
    int rollno;
    String name;
    @Override
    public String toString() {
        return "Students [rollno=" + rollno + ", name=" + name + "]";
    }
    public Students(int id, String name) {
        this.rollno = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        System.out.println("inside equals");
        Students s1=(Students)obj;
        if(this.rollno==s1.rollno)
        return true;
    else return false;
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        System.out.println("Inside hashcode");
        return this.rollno;
    }
    
    
}
public class Search_in_HashSet {
    public static void main(String[] args) {
        HashSet<Students> st=new HashSet<Students>();
        st.add(new Students(3,"Sanu"));
        st.add(new Students(3,"harsnu"));
        st.add(new Students(5,"minu"));
        st.add(new Students(3,"ridhnu"));
 

        //only equals function use data exist krte ki nahi sathi
if(st.contains(new Students(3,"minu")))
{
    System.out.println("found");
    }
else{
    System.out.println("not Found");}

//ya comment cha vrcha part work for equals or searching only
        /*for (Students students : st) {
            System.out.println(students);
        }
            //ya vr cha part work for checking duplicate 
        //HashSet= ithe duplicate value double passs keli tri te 1ch veda print hote  for this boyh hashset() and equals() used*///ithe pryat end
        //jevha aapn new key word ne object create krun 2 veda same value pathavto tr navin hash code tyar hote tya value vegdya consider hote but using HashSet value 1ch veda accept hoyil
        //functions must override hashcode() and equals()
    }
}
