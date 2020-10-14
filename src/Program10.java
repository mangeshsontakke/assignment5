
import java.util.Scanner;
public class Program10 {
	/*10)Getting the first and last n letters from a word where wordlength > 2n.
    	Ex: Input: california,3.
        output: calnia.
	 */
public static void main(String[] args) {

	String input="california";
	int n=3;
	StringBuffer sb=new StringBuffer();
	sb.append(input.substring(0, n)).append(input.substring(input.length()-n, input.length()));
	System.out.println(sb);//calnia
	
	
	}
}



/*	//String str = "california";
String str;
//int input = 3;
int input;
Scanner sc = new Scanner(System.in); 
System.out.println("Enter String: ");
str = sc.next();
System.out.println("Enter input in number: ");
input = sc.nextInt();
String s1 = str.substring(0,input);
String s2 = str.substring(str.length()-input,str.length());
System.out.println(s1.concat(s2));*/
