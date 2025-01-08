package Arrays;

import java.util.Arrays;

public class Merge2Array {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int a[]={1,2,3};
//		Arrays.sort(a);
//		int b[]={4,7,6};
//		Arrays.sort(a);
//		
//		int a1 = a.length;
//		int b1= b.length;
//		
//		int c1= a1+b1;
//		
//		int c[]= new int[c1];
//		
//		System.arraycopy(a, 0, c, 0, a1);
//		System.arraycopy(b, 0, c, a1, b1);
//		
//		String merge = Arrays.toString(c);
//		
//		//System.out.print(Arrays.toString(c));
//		
//		
//		
//	}


    public String findMedianSortedArrays(int[] nums1, int[] nums2) {

        int a=nums1.length;
        int b=nums2.length;

        int c1= a+b;

        int c[]=new int[c1];

        System.arraycopy(nums1,0,c,0,a);
        System.arraycopy(nums2,0,c,a,b);
        String merge = Arrays.toString(c);
        
		return merge;
      
    }
}


