package task_2;
public class Staff extends Employee
{
 String title;
 public Staff(String title, int office, double salary, MyDate datehired, String name, String address, String phoneNumber, String email) {
 super(office, salary, datehired, name, address, phoneNumber, email);
 this.title = title;
}
 @Override
 public String toString()
 {
 message ="It's The Staff Class \nThe Name Is:"+name+"\nHis Adress Is:"+address+
 "\nHis Phone Numbers Is:"+phoneNumber+"\nHis E-mail Is:"+email+"\nMy Title Is "+title+
 "\nMy Office In The: "+office+" Floor"+
 "\nMy Salary Is:"+salary+"\nMy Date Hired: "+datehired.day+"/"+datehired.month+"/"+datehired.year;     
 return message;
 
    }
 
}
