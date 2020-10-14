
public class Program09 {
	
	/*9)Find the Maximum span of the given array.
    span is the number of elements between the duplicate element
    including those 2 repeated numbers.
    if the array as only one elemnt,then the span is 1.
	input[]={1,2,1,1,3}
	output1=4
	input[]={1,2,3,4,1,1,5} //span
	output1=6
	 */
public static void main(String[] args) {
	int[] arr ={1,2,1,1,3};
	//int[] arr = {1,2,3,4,1,1,5};
	//int[] arr ={1,2,1,1,3,2,1,4,5,6};// for example
	int index = 0;
	int max = 0;
	int pos1 = 0 , pos2 = 0;

     for(int i=0; i<arr.length-1; i++)//1 traverse array
     {
         for(int j=i+1; j<arr.length; j++)//1,2,3,4,1,1 =  span=5 
        	 
               if(arr[i] == arr[j])//index = 4 / 5
                     index = j;//4 / 5
               if(index-i > max)//1,2,3,4,1,1,5
               {
                     max = index-i;//5-0 = 5
                     pos1 = i;//0
                     pos2 = index;//5
               }
   }
         System.out.println("largest span: "+(pos2-pos1+1));// +1 because we start from 0 	
}
}
