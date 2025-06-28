package binarySearch;

public class findX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;                  // Declaration
		arr = new int[] {-1, 0, 3, 5, 9, 12, 23, 45, 78, 100}; // Assignment
		
		int target = 5;
		System.out.print(binaryX(arr,target));
		
	}
	
	public static int binaryX(int[]arr, int target) {
		int start = 0, end = arr.length-1;
		
		while(end>start) {
			int mid = start +(end-start)/2;
			
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]> target)
				end = mid-1;
			else
				start = mid+1;
		}
		
		return start;
		
	}

}
