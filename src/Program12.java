

/*12)Add elements of digits:9999 
    output:9+9+9+9=3+6=9;
 */
public class Program12 {
	public static void main(String[] args) 
	{
		   int n = 9999;
           while(n > 10){// 9999 > 10, 999 > 10.... 
                 int l = 0,m = 0;
                 
                 while(n != 0)// true
                 {
                       m = n%10;// remaining 9 == 36 = 6,3 
                       l = l+m;//0+9 9+9 18+9 27+9 36 == 9 , 18 , 27 , 36
                       n = n/10;//999 99 9
                 }
                 n = l;// 36 assign
                 continue;
           }System.out.println(n);
     }
}