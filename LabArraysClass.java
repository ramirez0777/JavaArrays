import java.util.Arrays;

public class LabArraysClass 
{
	public static void main(String[] args)
	{
		int[] iArray1 = {6, 12, 3, 9};
		int[] iArray2 = new int[5];
		
		// fill iArray2 with 7	
      Arrays.fill(iArray2, 7);   
		
		// print iArray1 and iArray2 (toString)
		System.out.printf("iArray1: %s\n", Arrays.toString(iArray1));   
      System.out.printf("iArray2: %s\n", Arrays.toString(iArray2));   
      
		// search for number 9 in iArray1 and print the value returned:
      System.out.printf("9 in iArray1: %d\n", Arrays.binarySearch(iArray1, 9));
      
		// sort iArray1 and print it
      Arrays.sort(iArray1);
      System.out.printf("iArray1 sorted: %s\n", Arrays.toString(iArray1));

		// search for number 9 in iArray1 and print the value returned:
		System.out.printf("9 in iArray1: %d\n", Arrays.binarySearch(iArray1, 9));
      
		// create iArray3 and assign it the first 3 elements of iArray1; print it
      int[] iArray3 =       iArray3 = Arrays.copyOf(iArray1, 3);
      System.out.printf("iArray3: %s\n", Arrays.toString(iArray3));
				
		// test equality of new int[] {3, 6, 9} and iArray3; print result
      String answer;
      int[] test = {3, 6, 9};
      if(Arrays.equals(test, iArray3))
      {
         answer = "True";
      }
      else
      {
         answer = "False";
      }
      System.out.printf("iArray3 equals [3, 6, 9]: %s\n", answer);
      
      // reason
      System.out.println("Reason: The Array must be sorted or else the results are undefined");
	}
}