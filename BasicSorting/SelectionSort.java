package BasicSorting;

public class SelectionSort {
	
	public static void selectionSort(int arr[]) {
		
		for(int i=0;i<arr.length;i++){
			int minPos=i;
			
			for(int j=i+1 ; j<arr.length ; j++){
				if(arr[minPos] > arr[j]){
					minPos = j;
				}
			}
			
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
			
		}
		
		
	}

	public static void main(String[] args) {
		
		int arr[] = {5, 4, 1, 3, 2};
		System.out.println( "UNSorted array :  " );
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " " );
		}
		
		selectionSort(arr);
		System.out.println(  );
		System.out.println( "Sorted array :  " );
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " " );
		}



	}

}
