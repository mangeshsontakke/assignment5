
public class Program05 {
	/*5)input1="the sun raises in the east";
    output1=raises;
    count no vowels in each word and print the word which has max
    no of vowels if two word has max no of vowel print the first one
 */
	public static void main(String[] args) {
		String str="the sun raisseeee aeiou in the aaiou east";
		int count =0 , max = 0 ;
		String ans = "";
		String[] arr = str.split(" ");
		
		for(int i=0;i<arr.length;i++)// length = 8
		{	count = 0;
			char[] words = arr[i].toCharArray();
			for(int j = 0; j < words.length; j++)
			{
				if(words[j] == 'a' || words[j] == 'e' || words[j] == 'i' || words[j] == 'o' || words[j] == 'u')
				{
					count ++;
				}else{
					
				}
				
			}if(max < count)
			{
				max = count;
				ans = arr[i];
			}
		}System.out.println("No of Vowels is: "+max);
		System.out.println("Max Vowel Present in: "+ans);
	}
}