package cleancode;
import java.util.*;
class Home
{
  int e;
     static void price(String s,int a)
    {
      if(s=="standard")
       System.out.println(1200*a);
      else if(s=="above standard")
    	       System.out.println(1500*a);
      else if(s=="high standard")
    	  System.out.println(1800*a);
      else
    	  System.out.println(2500*a);
    }
    
}
public class Main
{
  static
  {
    Scanner s=new Scanner(System.in);
    int i=s.nextInt();
    String n=s.next();
    Home ob=new Home();
    ob.price(n,i);
  }
public static void main (String[] args) 
  {
  }
  
}
