package designpattern;
import java.util.Scanner;
public class DesignPattern 
{
 public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Your Job:");
        String job=in.nextLine();
        memberFactory mefac= new memberFactory();
        Staff st= mefac.getJob(job);
        st.getSalary();
        st.getYearsOfWork();
    }
    
}
