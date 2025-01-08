package BasicSorting;

import java.util.*;

public class BubbleSort {
    
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swapped = false;        // Optimize bubble sort having TC =O(n)

            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped in the inner loop, break out
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
    	
    	//taking input from user 
    	Scanner sc = new Scanner(System.in);
    	System.out.print( " Enter size : ");
    	int size = sc.nextInt();
    	int arr[] = new int[size];
    	System.out.print("Enter elements :  ");
    	for(int i=0;i<size ;i++){
    		arr[i] = sc.nextInt();
    	}
 //////////////////////////////////////////////////////////
        //int arr[] = {5, 4, 1, 3, 2};
    	//////////////////////////////////
    	
    	
        bubbleSort(arr);
        System.out.println("Sorted array :  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
