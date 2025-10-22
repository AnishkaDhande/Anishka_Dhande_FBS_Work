
 class  BankAccount
 {
    int AccountNo;
    String Name;
    double balance;
    static double interestRate;
     //static double interestRate=8.5;// We can write like this and code runs but the most recommended method is given below

    static{
        interestRate=8.7;//recommended
    }

     BankAccount()
     {
        this.AccountNo=100;
        this.Name="Not Given";
        this. balance=0;
        

     }
     BankAccount(int AccountNo,String Name,double balance)
     {
        this.AccountNo=AccountNo;
        this.Name=Name;
        this.balance=balance;
        
     }

     
     public int getAccountNo() {
         return AccountNo;
     }
     public void setAccountNo(int accountNo) {
         AccountNo = accountNo;
     }
     public String getName() {
         return Name;
     }
     public void setName(String name) {
         Name = name;
     }
     public double getBalance() {
         return balance;
     }
     public void setBalance(double balance) {
         this.balance = balance;
     }
     public static double getInterestRate() {
         return interestRate;
     }
     public static void setInterest(double interest) {
         BankAccount.interestRate = interestRate;
     }

     void display()
     {
        System.out.println("Account Number is "+this.AccountNo);
        System.out.println("Name is "+this.Name);
        System.out.println("Account Balance is "+balance);
        System.out.println("Interest Rate is "+this.interestRate);
     }

 }
 public class Static {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        BankAccount b2=new BankAccount(123,"Radha",67309);
        BankAccount b3=new BankAccount(125,"Kirshna",62309);
        b1.display();
        b2.display();
        b3.display();

        
    }
    
}
