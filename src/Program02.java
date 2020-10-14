
public class Program02 {

	/*2)find the maximum chunk of a given string
    	i/p: this isssss soooo good
    	o/p=5 */

	public static void main(String[] args) {
		//
		String str = "this isssss sooooo good";
		int count = 0 , max = 0;
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length-1;i++)// length = 8
		{
			char[] words = arr[i].toCharArray();
			for(int j = 0; j < words.length-1; j++)
				if(words[j] == words[j+1])//
				count ++;
			else
				count = 0;
			
			if(max <= count)// if count = 2 then execute if part
				max = count+1;
			}
		System.out.println(max);
	}
}

