package Firstbit.Assignments.Class_Task;

class Ti{
	int hour,min,sec;

	void setHour(int hour) {
		this.hour = hour;
	}

	void setMin(int min) {
		this.min = min;
	}

	void setSec(int sec) {
		this.sec = sec;
	}
	void display()
	{
		System.out.printf("The Time is %d:%d:%d ",this.hour,this.min,this.sec);
	}
}
class Task2{
	public static void main(String args[])
	{
		Ti t1=new Ti();
		t1.setHour(3);
		t1.setMin(23);
		t1.setSec(27);
		t1.display();
	}
	
}