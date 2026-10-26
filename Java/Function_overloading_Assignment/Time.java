public class Time {
    int hr;
    int min;
    int sec;
    Time(int hr,int min,int sec)
    {
        this.hr=hr;
        this.min=min;
        this.sec=sec;
        normalize();
    }
    void normalize()
    {
        if(sec>=60)
        {
            min+=sec/60;
            sec%=60;
        }
        if(min >=60)
        {
            hr+=min/60;
            min %=60;
        }
    }
    public Time add(Time t)
    {
        int totalHr=this.hr+t.hr;
        int totalMin=this.min+t.min;
        int totalSec=this.sec+t.sec;
        return new Time(totalHr,totalMin,totalSec);
    }
    public Time add(int seconds)
    {
        int totalSec=this.sec+seconds;
        return new Time(this.hr,this.min,this.sec);
    }
    void display()
    {
        System.out.printf("%02d:%02d:%02d\n",hr,min,sec);
    }
    public static void main(String[] args) {
     Time t1=new Time(5,45,30);
    Time t2=new Time(3,20,61);
    Time sum1=t1.add(t2);
    System.out.println("Adding Two Time Objects(t1+t2): ");
    sum1.display();
     
    Time sum2=t1.add(34);
    System.out.println("Adding Time Object and Integer Seconds (t1+34): ");
     sum2.display();
    }
}
