package Arrays;

public class BinarySearch {
	
	public static int binary(int num[],int key) {
		int start=0;
		int end=num.length-1;
		
		while(start<=end){
			int mid=(start+end)/2;
			
			if(num[mid]==key){
				return mid;
			}
			if(num[mid]<key){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		return -1;	
	}
	
	

	public static void main(String[] args) {
		 
		int num[]={3,7,9,11,54,88,200};
		int key =90;
		
		System.out.println("index for key : "+binary(num,key));
		
		

	}

}
