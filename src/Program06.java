import java.util.StringTokenizer;
public class Program06 {
	/*6)String format : CTS-LLL-XXXX
    ip1: CTS-hyd-1234
    ip2: hyderabad
    -> LLL must be first 3 letters of ip2.
    -> XXXX must be a 4-digit number */
		
		public static void main(String[] args) {
			 String s1="CTS-hyd-1234";
			 String s2="hyderabad";			
			 String s3=s2.substring(0, 3);//hyd
			 boolean b = false;	
			 StringTokenizer st=new StringTokenizer(s1,"-");
			 String s4=st.nextToken();
			 String s5=st.nextToken();
			 String s6=st.nextToken();
			 
			 if(s4.equals("CTS") && s5.equals(s3) && s6.length()==4)
			  for(int i=0;i<s6.length();i++){
			   if(Character.isDigit(s6.charAt(i)))
			    b=true;
			   else{
			    b=false;}}
			
			 if(b==true)
				  System.out.println("CTS-LLL-XXXX format: is Correct");
				 else
				  System.out.println("not in required format");
			 
			}
}