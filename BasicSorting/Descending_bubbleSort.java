package BasicSorting;

public class Descending_bubbleSort {
	
	public static void desc(int arr[]) {
		
		//Descending_bubbleSort
		
	/*	for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i ;j++){
				if(arr[j]<arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		
	}   */
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		//Descending_SelectionSort
		
/*		for(int i=0;i<arr.length; i++){
			int minPos = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[minPos] < arr[j]){
					minPos =j;
				}
			}
			
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
		}   */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
			//Descending_InsertionSort	
		
		for(int i=1;i<arr.length;i++){
			int curr =i;
			int prev = i-1;
			while(prev >=0 && arr[prev] < curr ){
				arr[prev+1] = arr[prev];
				prev --;
				
			} arr[prev+1] = curr;
			
		}
		
		
	}
		
		
		

	public static void main(String[] args) {

		int arr[] = {3, 6, 2, 1,8, 7, 4, 5, 3, 1};
		desc(arr);
		System.out.println(  );
		System.out.println( "Sorted array :  " );
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " " );
		}
	}

}
