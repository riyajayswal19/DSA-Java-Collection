package BasicSorting;

public class InsertionSort {
	
	public static void InserSort(int arr[]) {
		
		for(int i=1;i<arr.length;i++){
			
			int curr = i;
			int prev = i-1;
			while(prev >= 0 && arr[prev]>curr ){
				arr[prev+1] = arr[prev];
				prev--;
			}
			
			arr[prev+1] = curr;
		}
	}

		public static void main(String[] args) {
				
				int arr[] = {5, 4, 1, 3, 2};
				System.out.println( "UNSorted array :  " );
				for(int i=0;i<arr.length;i++){
					System.out.print(arr[i]+ " " );
				}
				
				InserSort(arr);
				System.out.println(  );
				System.out.println( "Sorted array :  " );
				for(int i=0;i<arr.length;i++){
					System.out.print(arr[i]+ " " );
				}
		
		}
}