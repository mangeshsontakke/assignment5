
import java.util.Scanner;

public class Program01 {
	
	/*1)i/p: bengal
    	o/p: ceogbl
    	if z is there replace with a
	 */
	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");	
		str = sc.next();
		char[] word = str.toCharArray();// convert string into array format
		for(int i = 0; i < word.length; i++)
		{
			if(i%2==0)//0,2,4
				word[i]++;
				System.out.print(" "+word[i]);
		}
	}

}
