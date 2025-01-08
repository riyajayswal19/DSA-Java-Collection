package patterns;
import java.util.Arrays;
public class rough {
	
	//public static void mm(int num[],int target) {


//		for(int i=0;i<num.length;i++){
//			
//			for(int j=i+1;j<num.length;j++){
//				//System.out.print("("+num[i]+","+num[j]+") ");
//				
//				int sum=num[i]+num[j];
//				
//				if(sum==target){
//					System.out.print("["+i+","+j+"] ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		    public static int findDuplicate(int[] nums) {

		        for(int i=0;i<nums.length;i++){
		            int start =i;
		            for(int j=i+1;j<nums.length;j++){
		                    if(nums[i]==nums[j]){
		                        return nums[i];
		                    }
		            }

		            
		        }
		        
		        throw new IllegalArgumentException("No solution");
		    }

		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num[]={1,7,7,11,2,15};
		 
		 findDuplicate(num);
		 
//		 int target = 9;
//
//		 mm(num,target);
	}
}
	
//	
	
//	//////////////Merge two arrays////////////////
//	public static void main(String[] args) {
//	
////	int a1[]={1,2,3};
////	int a2[]={4,5,6};
////	
////	int b1 =a1.length ;
////	int b2 =a2.length;
////	
////	int c1=b1+b2;
////	
////	int c[]= new int[c1];
////	
////	System.arraycopy(a1,0,c,0,b1);
////	System.arraycopy(a2,0,c,b1,b2);
////	
////	System.out.println(Arrays.toString(c));
//		///////////////////////////////////////////////////////////////////////////
//		
//        // first array
//        int a[] = { 30, 25, 40 };
//        // second array
//        int b[] = { 45, 50, 55, 60, 65 };
//
//        // determining length of first array
//        int a1 = a.length;
//        // determining length of second array
//        int b1 = b.length;
//
//        // resultant array size
//        int c1 = a1 + b1;
//
//        // Creating a new array
//        int[] c = new int[c1];
//
//        // Loop to store the elements of first
//        // array into resultant array
//        for (int i = 0; i < a1; i = i + 1) {
//            // Storing the elements in 
//            // the resultant array
//            c[i] = a[i];
//        }
//
//        // Loop to concat the elements of second 
//        // array into resultant array
//        for (int i = 0; i < b1; i = i + 1) {
//
//            // Storing the elements in the 
//            // resultant array
//            c[a1 + i] = b[i];
//        }
//
//        // Loop to print the elements of 
//        // resultant array after merging
//        for (int i = 0; i < c1; i = i + 1) {
//            
//            // print the element
//            System.out.print(c[i]+" ");
//        }
//    }
//}
//	
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


