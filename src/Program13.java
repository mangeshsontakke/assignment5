
import java.util.GregorianCalendar;

//13)leap year or not using API?

public class Program13 {
	 public static void main(String[] args) {
		 
         String s = "2012";
         System.out.println(leapYear(s));
   }
   public static boolean leapYear(String s) {
         int n=Integer.parseInt(s);
         GregorianCalendar c=new GregorianCalendar();
         boolean b = c.isLeapYear(n);
         return b;
   }
}
/*		 String s = "2016";
int num = Integer.parseInt(s);
if(num%4 == 0)
	 System.out.println("Leap Year");
else
	 System.out.println("Not Leap Year");
*/