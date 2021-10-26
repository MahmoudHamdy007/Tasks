package studenttask;
public class StudentTask {
   public static void main(String[] args) 
   {
    //Initial Some Subjects And Addresses:
    Subject sub1=new Subject(1,3,"PH101",60.0);
    Subject sub2=new Subject(2,3,"PH102",70.0);
    Subject sub3=new Subject(3,3,"PH103",69.0);
    Subject sub4=new Subject(4,3,"Math101",55.0);
    Subject sub5=new Subject(5,3,"Math102",54.0);
    Subject sub6=new Subject(6,3,"Math103",80.0);
    Address ad1= new Address(15,"Minya","Egypt");
    Address ad2= new Address(12,"Giza","Egypt");
//_______________________________________________________________________________________
    Student s1= new Student("Mahmoud",1,3.4,sub1,sub2,sub3,ad1); 
    Student s2= new Student("Ashraf",2,2.5,sub4,sub5,sub6,ad2); 
    System.out.println(s1.toString());
    System.out.println("The Average For Your 3 Subjects Is: "+s1.Average(s1.getId()));
    System.out.println("The Total Of Hours Are: "+s1.howManyHours(s1.getId()));
    s1.whichDepartment(s1.getGpa());
    System.out.println("________________________________");
//__________________________________________________________________________________________
    System.out.println(s2.toString());
    System.out.println("The Average For His 3 Subjects Is: "+s2.Average(s2.getId()));
    System.out.println("The Total Of Hours Are: "+s2.howManyHours(s2.getId()));
        s2.whichDepartment(s2.getGpa());

   }
    
}
