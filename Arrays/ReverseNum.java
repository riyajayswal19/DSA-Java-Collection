package Arrays;

public class ReverseNum {
	
	public static void reverseNum(int num[]) {
		// TODO Auto-generated method stub
		
		int start=0;
		int end=num.length-1;
		
		while(start<end){
			
			int temp=num[end];
			num[end]=num[start];
			num[start]=temp;
			
			start++;
			end--;
				}

	}
	public static void main(String[] args) {


		int num[]={2,3,6,7,9};
		
		System.out.print("Original Array : ");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		reverseNum(num);
		System.out.print("Reverse Array : ");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		System.out.println();

	}
	
	//swap two numbers
	
//	int a =10;
//	int b =5;
//	
//	int temp = b;
//	b=a;
//	a=temp;
//	
//	System.out.println("a : "+a);
//	System.out.println("b : "+b);
//	
//	

}
