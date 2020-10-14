import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Program07 {
	
/*7) ip: "this is sample test case"
    op: "this amplec"
    remove the duplicates in the given string */
	
	public static void main(String[] args) {
		
		String s= "this is sample test case";
		StringBuffer sb=new StringBuffer(s);
		for(int i=0;i<sb.length();i++){
			for(int j=i+1;j<sb.length();j++)
			if(sb.charAt(i)==sb.charAt(j))
				sb.deleteCharAt(j); //this amplec
	      }
		System.out.println(sb);
					
	}
}		
		
		



