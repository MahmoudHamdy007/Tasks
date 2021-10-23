package accounttask;
import java.util.Date;
public class Account 
{
private int id=0;
private double balance=0,annualInterestRate=0;
private Date dateCreated ;
public Account()
{
}

public Account(int id,double balance){
dateCreated = new Date();
this.id=id;
this.balance=balance;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
      public String getDateCreated() {
        return this.dateCreated.toString();
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
   
    public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }
     public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    public double deposit(double amt)
    {
      return this.balance+=amt;
    }
    public void withdraw(double amt){
    if (balance>=amt){
    this.balance-=amt; 
    }
    else 
    System.out.println("Insufficient Balance");
    }
}
