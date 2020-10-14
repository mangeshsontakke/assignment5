
//14)perfect no or not?
//1+2+3=6
//6,28,427 perfect numbers
public class Program14 {
	public static void main(String[] args) 
	{
         
		int num = 28;// divisible from 1,2,4,7,14 = sum = 28
          int num1 = 0;
          boolean b = false;

          for(int i = 1;i < num;i++)// traverse loop till nth position i.e 28
                if(num%i == 0)
                   num1 += i;//1+2+3
          if(num1 == num)// 6 == 6 true
             b = true;
          else
        	  b=false;
          
          System.out.println(b);
	}
}