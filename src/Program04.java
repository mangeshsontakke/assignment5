
public class Program04 {	
/*4)input1={2,4,3,5,6};
    if odd  find square 
    if even find cube
    finally add it
    output1=208(4+16+27+125+36)
 */
	public static void main(String[] args) {
		int[] arr = {2,4,3,5,6};
		int add = 0;
		int temp = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2 != 0)
			{
				add = (arr[i] * arr[i] * arr[i]);// 3,5
				temp = temp + add;

			}else if(arr[i]%2 == 0)// 2,4,6
			{
				add = (arr[i] * arr[i]);
				temp = temp + add;
			}
		}System.out.println(temp);
	}
}