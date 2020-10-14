
import java.util.StringTokenizer;

/*15)Input1=845.69, output=3:2;
    Input1=20.789; output=2:3;
    Input1=20.0; output=2:1;  
    output is in Hashmap format.
    Hint: count the no of digits.
 */
public class Program15 {
	
		  public static void main(String[] args) {
	            double d = 845.69;//3.2

        int num1 = 0,num2 = 0;
        String s = String.valueOf(d);// convert d into string "845.69"
        StringTokenizer t = new StringTokenizer(s,".");
        String s1 = t.nextToken();//"845"
        String s2 = t.nextToken();//"69"
        num1 = s1.length();// length = 3
        num2 = s2.length();// length = 2
        
        String s3 = String.valueOf(num1)+":"+String.valueOf(num2);// 3:2
           System.out.println(s3);
	     } 
	}







/*double d = 845.69;

int num1 = 0,num2 = 0;
String s = String.valueOf(d);// convert d into string "845.69"
StringTokenizer t = new StringTokenizer(s,".");
String s1 = t.nextToken();//"845"
String s2 = t.nextToken();//"69"
num1 = s1.length();// length = 3
num2 = s2.length();// length = 2
 if(s1.charAt(0) == '0')// if 0 at first position
    num1 = s1.length()-1;// then length-1
 if(num2 != 1)
    if(s2.charAt(s2.length()-1) == '0')// 
       num2 = s2.length()-1;
String s3 = String.valueOf(num1)+":"+String.valueOf(num2);// 3:2
   System.out.println(s3);*/