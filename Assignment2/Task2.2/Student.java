package studenttask;
public class Student 
{
 String name;
 private int id;
 private double gpa;
 public Subject sub1,sub2,sub3;
 public Address ad1;
    public Student(String name, int id, double gpa, Subject sub1, Subject sub2, Subject sub3,Address ad1) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.ad1=ad1;
    }
  
    public int getId() {
     return id;
    }
    public double getGpa() {
     return gpa;
    }
    public void setName(String name) {
     this.name = name;
    }
    public void setId(int id) {
     this.id = id;
    }
    public void setGpa(double gpa) {
     this.gpa = gpa;
    }
    public void whichDepartment(double gpa)
    {/*This Method determines which department the student should join based on his GPA*/
    if (gpa>=1.5&&gpa<=2.0)
        System.out.println("Your Depratemnt is: IS Departemnt");
    else if (gpa>=2.1&&gpa<=2.6)
        System.out.println("Your Depratemnt is: CS Departemnt");
    else if (gpa>=2.7)
        System.out.println("Your Depratemnt is: AI Departemnt");
    else 
        System.out.println("Sorry,You Must Increase Your GPA To Be more Than 1.5 At least ");    
    }
    public double Average(int id){
    //calculate the Average Of three Subjects
    return (sub1.subgrade+sub2.subgrade+sub3.subgrade)/3;
    }
    public int howManyHours(int id){
    //Calculate How many hours have been recorded
    return (sub1.subHours+sub2.subHours+sub3.subHours);
    }

    @Override
    public String toString() {
        String m="The Name Of Student: "+name+"\nHis ID:"+id+"\nHIs GPA:"+gpa+"\nHis Address: "+ad1.st+","+ad1.city+","+ad1.country;
        return m;
    }
 
}
