package task1;
public class Tv {
int Channel ,volumeLevel;
boolean on;
public Tv(){
Channel=1;
volumeLevel=2;
on= true;
}
public void turnOn(){
if (on==true)
 System.out.println("The TV Is On");
}
public void turnOff(){
if(on==false)
 System.out.println("The TV Is Off");
}
public void setChannel(int ch){
if(ch<=120&&ch!=0){
Channel=ch;
System.out.println("The Current Channel Is: "+Channel);
}
else 
    System.out.println("There\'s No " + ch + " Channel");
}
public void setVolume(int vl){
if(vl<=7&&vl!=0){
volumeLevel=vl;
System.out.println("The Current Volume Is: "+ volumeLevel);
}
else{ 
    System.out.println("The Volume Level Should be Between 1:7");
}
}
public void channelUp(){
if(Channel<120)
Channel++;
else
{
    System.out.println("\"There\'s Only 120 Channel\"");
}
}
public void channelDown(){
if(Channel<=120 && Channel!=1)
{
Channel--;
}
else
System.out.println("\"Channel 0 Not Found!\"");
}
public void volUp(){
if(volumeLevel<7)
volumeLevel++;
else 
    System.out.println("\"The Maximum Volume Is 7\"");
}
public void volDown(){
if(volumeLevel<=7&&volumeLevel!=1)
volumeLevel--;
else 
    System.out.println("\"The Minimum Volume Is 1\"");
}
}
