package task1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
    Tv tv1=new Tv();
    tv1.turnOn();
    tv1.turnOff();
    tv1.setChannel(120);//There's Special Cases when The Channel will be 1 or 120 or >120 || <1 
    tv1.setVolume(7);//There's Special Cases when the Volume level will be 1 or 7 or >7 || <1
 //________________________________Testeing The Methods____________________________________________
    tv1.channelUp();System.out.println("The Current Channel Is "+tv1.Channel);
    tv1.volUp();System.out.println("The Volume Level now is "+tv1.volumeLevel);
    tv1.volDown();System.out.println("The Volume Level now is "+tv1.volumeLevel);
    tv1.channelDown();System.out.println("The Current Channel Is "+tv1.Channel);

    }
    
}
