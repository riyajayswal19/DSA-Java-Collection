package Arrays;

public class Find_Common_Elements_Between_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,3,4,55,67,23};
		int b[]={11,44,555,230};
		
		
		
		for(int i=0;i<a.length;i++){
			
			int start=i;
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.print(a[i]+" ");
				}
			}
		}
		System.out.print("No common element");
	}

}
