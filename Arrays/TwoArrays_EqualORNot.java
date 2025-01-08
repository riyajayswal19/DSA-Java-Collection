package Arrays;

import java.util.Arrays;

public class TwoArrays_EqualORNot {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,231,4,5};
		int b[]={1,2,31,4,5};
		
		//Approach 1
		
		/*	
			  boolean res = Arrays.equals(a,b);
			
			if(res == true){
				System.out.print("Arrays are equal");
			}else{
				System.out.print("Arrays are NOT equal");
			} 
		
		*/
		
		//Approach 2
		
		boolean res = true;
		
		if(a.length == b.length)
		{
					
						for(int i=0;i<a.length;i++)
						{
							if(a[i]!=b[i])
							{
								res=false;
							}
						}
					
					
				}else{
					res=false;
		}
		
		
		
		if(res == true){
			System.out.print("Arrays are equal");
		}else{
			System.out.print("Arrays are NOT equal");
		} 
		
	
		}

	}


