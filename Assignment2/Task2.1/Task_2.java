package task_2;
public class Task_2 {
public static void main(String[] args) 
{    
//Date Hired initial
MyDate dE=new MyDate("2020","12","20");
MyDate dF=new MyDate("2012","12","12");
MyDate dS=new MyDate("2011","11","11");
//_______________________________________________________________________________________________________________
Person p1 = new Person("Mahmoud","El-Minya","0114062008-","mahmoud.hm114@gmail.com");
System.out.println(p1.toString());
//_______________________________________________________________________________________________________________
Student stu= new Student("Senior"," Ahmed"," Marsa matrouh","01150200---","Ahmed.hamdy797@yahoo.com");
System.out.println("_________________________________________\n"+stu.toString());
//_______________________________________________________________________________________________________________
Employee E =new Employee(5,3500.75,dE," Khaled"," Alex","01120050---","Khaled.hamdy@yahoo.com");
System.out.println("_________________________________________\n"+E.toString());
//_______________________________________________________________________________________________________________
Faculty f=new Faculty(8,'B',8,5000.0,dF,"Nour","El-Minya","010134646--","Nour.Elsonny@gmail.com");
System.out.println("_________________________________________\n"+f.toString());
//_______________________________________________________________________________________________________________
Staff s=new Staff("THE Officer",4,2500.0,dS,"Ibrahim","Assuit","0120120128","Ibra1@yahoo.com");
System.out.println("_________________________________________\n"+s.toString());



}}
