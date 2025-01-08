package Arrays;

public class value_appears_atleast_twice {
	
	public static boolean twice(int num[]) {
		
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
			
				if(num[i] == num[j]){
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int num[]={1,2,3,12,5};
		System.out.println(twice(num));

	}


}
