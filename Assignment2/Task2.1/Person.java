package task_2;
public class Person
{
 String name,address,phoneNumber,email,message;
 public Person(String name, String address, String phoneNumber, String email)
{
  this.name = name;
  this.address = address;
  this.phoneNumber = phoneNumber;
  this.email = email;
}

    @Override
    public String toString() 
    {
        message = "It's The Person Class \nThe Name Is:"+name+"\nHis Adress Is:"+address+"\nHis Phone Numbers Is:"+phoneNumber+"\nHis E-mail Is:"+email; 
        return message;
    }


}
