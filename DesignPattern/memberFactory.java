package designpattern;
public class memberFactory 
{
 public Staff getJob(String memberJob)
 {
  String s= memberJob.toLowerCase();
    if(s==null)
        return null;
    if(s.equals("doctor"))
        return new Dr();
    else if(s.equals("teacher"))
        return new TeachAssistant();
     return null;
 }
}