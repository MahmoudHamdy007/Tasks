package task_2;
public class Employee extends Person
{
 int office;// Office Floor 
 double salary;
 MyDate datehired;
 public Employee(int office, double salary, MyDate datehired, String name, String address, String phoneNumber, String email)
 {
  super(name, address, phoneNumber, email);
  this.office = office;
  this.salary = salary;
  this.datehired=datehired;
 }
 @Override 
 public String toString()
 {
 message = "It's The Employee Class \nThe Name Is:"+name+"\nHis Adress Is:"+address+
 "\nHis Phone Numbers Is:"+phoneNumber+"\nHis E-mail Is:"+email+
 "\nMy Office In The: "+office+" Floor"+
 "\nMy Salary Is:"+salary+"\nMy Date Hired: "+datehired.day+"/"+datehired.month+"/"+datehired.year;
 return message;
 }
}
