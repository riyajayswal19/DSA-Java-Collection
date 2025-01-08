package BasicSorting;

import java.util.Scanner;

public class CountSort {
	
	public static void countingSort(int arr[]) {
		
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			largest = Math.max(largest, arr[i]);
		}
		
		int count[] = new int[largest+1];
		for(int i=0;i<arr.length;i++){
			count[arr[i]]++;
		}
		
		//sorting
		int j=0;
		for(int i=0;i<count.length; i++){
			while(count[i] > 0){
				arr[j] =i;
				j++;
				count[i]--;
			}
		}


		

	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Taking input from user 
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter size of array :  " );
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println( "Enter elements :  " );
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
	////////////////////////////////////////////////////////
		countingSort(arr);
		System.out.println(  );
		System.out.println( "Sorted array :  " );
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " " );
		}

	}

}
