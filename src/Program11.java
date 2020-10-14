
/*11)input1="aBrd";
    input2="aqrbA";
    input3=2;
    output1=boolean true;
    2nd char of ip1 and last 2nd char of ip2 show be equal
 */
public class Program11 {
	public static void main(String[] args) {
		String str1="aBrd";
	    String str2="aqrbA";
	    int input = 2;
	    int count=0;
	    boolean b = false;
	    
	    for(int i=0; i<str1.length(); i++)// traverse str1
	    {
	    	for (int j = 0; j < str2.length(); j++) {// traverse str2
				if(str1.charAt(i) == str2.charAt(j))// compare both string character
				{
					count ++;// if available same char into both string
				} //2
			}
	    }if(count == input)// if count is as per user input then true otherwise false
	    {
	    	b = true;
	    }else{
	    	b = false;
	    }
	    System.out.println(b);
	    
	    
	    
	}
}
