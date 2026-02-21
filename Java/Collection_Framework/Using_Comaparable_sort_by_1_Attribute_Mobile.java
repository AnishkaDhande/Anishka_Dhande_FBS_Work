import java.util.ArrayList;
import java.util.Collections;
class  Mobile implements Comparable<Mobile>
{
    public int compareTo(Mobile o) {
        return this.imei-o.imei;
    }


    int imei;
    String brand;
    //String la compare krnya sathi compareto() vapartat
    double price;
    public int getImei() {
        return imei;
    }
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return "\nMobile [imei=" + imei + ", brand=" + brand + ", price=" + price + "]";
    }
    public void setImei(int imei) {
        this.imei = imei;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Mobile(int imei, String brand, double price) {
        this.imei = imei;
        this.brand = brand;
        this.price = price;
    }

}
public class Using_more_than_1_attribute_use_Comparator {
    public static void main(String args[])
    {
        ArrayList<Mobile> m1= new ArrayList<Mobile>();
        m1.add(new Mobile(23,"Samsung",23000));
        m1.add(new Mobile(27,"Motorola",16000));
        m1.add(new Mobile(12,"Lenvo",29000));
        m1.add(new Mobile(17,"realme",53000));
        m1.add(new Mobile(22,"Apple",73000));

System.out.println(m1);
Collections.sort(m1);//class aahe Collections ya class mdhye sort navachi static method aahe
   System.out.println(m1);
}
}
