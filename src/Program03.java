
public class Program03 {
	/*3)i/p1: new york
    	i/p2: new jersey
    	o/p: new y+r+
	 */

	public static void main(String[] args) 
	{
		String str1="new york";
		String str2="new jersey";
		int flag;
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str1.length();i++)//str1.length = 8
		{
			flag=0;// flag reset everytime
			char ch=str1.charAt(i);// new york
		for(int j=0;j<str2.length();j++)// str2.length = 10
			if(ch==str2.charAt(j))// new y r
				flag=1;
			if(flag!=0)sb.append(ch);
			else
			sb.append('+');//new y+r+
		}
		System.out.println(sb.toString());
}
}