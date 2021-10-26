package task_2;
public class Faculty extends Employee
{
 int officeHours;
 char rank;
  public Faculty(int officeHours, char rank, int office, double salary, MyDate datehired, String name, String address, String phoneNumber, String email) {
  super(office, salary, datehired, name, address, phoneNumber, email);
  this.officeHours = officeHours;
  this.rank = rank;
}
 @Override
 public String toString()
 {
 message = "It's The Faculty Class \nThe Name Is:"+name+"\nHis Adress Is:"+address+"\nHis Phone Numbers Is:"+phoneNumber+
 "\nHis E-mail Is:"+email+"\nMy Office Hours Are: "+officeHours+"\nMy Rank Is "+rank+
 "\nMy Office In The: "+office+" Floor"+"\nMy Salary Is:"+salary+"\nMy Date Hired: "+datehired.day+"/"+datehired.month+"/"+datehired.year;
 return message;
 }
  
}
