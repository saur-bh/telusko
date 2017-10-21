/* 
 * Bubble sort works while comparing index with index+1 and swap if the value is lesser 
 * in the first pass the largest value is at last 
 * 
 */


public class BubbleSort {
	
	public static void main(String arg[]) {
		
		//Declare an array 
		
		int arr[] = { 3,2 ,1,8,7};
		
		//Initialize the loop outer 
		
		for( int i=0;i<arr.length;i++) {
			
			// inner loop from 0 index to length of array - 1 
			for ( int j=0;j<arr.length-i-1;j++) {
				
				//Swap the variable 
				if(arr[j]>arr[j+1]) {
					
					 int tmp = arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=tmp;
				}
			}
			
		}
		
		//enhanced for loop 
		System.out.println("Sorted Array: ");
		for (int item : arr) {
			System.out.print(item);
		    System.out.print("\t");
		}
		
		
		
		
		
		
	}

}
