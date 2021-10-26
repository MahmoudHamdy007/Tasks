package task_2;
public class Student extends Person 
{
 final String fresh = "Freshman" ;
 final String sopho = "Sophomore";
 final String jun   = "Junior"   ;
 final String sen   = "Senior"   ; 
 public Student(String statues, String name, String address, String phoneNumber, String email) 
{
    super(name, address, phoneNumber, email);
}
@Override
public String toString() 
{
 message = "It's The Student Class \nThe Name Is:"+name+"\nHis Adress Is:"+address+"\nHis Phone Numbers Is:"+phoneNumber+"\nHis E-mail Is:"+email+"\nHis Status Is :"+sen;
 return message;
}
 
}
