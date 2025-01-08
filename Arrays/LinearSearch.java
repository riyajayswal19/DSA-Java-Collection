package Arrays;

public class LinearSearch {
	
	public static int linsearch(int num[], int key) {
		for(int i=0;i<num.length;i++){
		if(num[i] == key){
			return i;
		}
	  }
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]={2,4,6,8,3,13,10};
		int key=10;
		
		int index=linsearch(num,key);
		System.out.println("key is at :"+index);
//		if(index==-1){
//			System.out.println("NOT FOUND");
//		}else{
//			System.out.println("key is at "+index);
//		}
	}

}
