package patterns;

public class First1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int Line=1;Line<=4;Line++){                    //    ****
//			for(int star=4;star>=Line;star--){             //    ***  
//				System.out.print("*");                     //    ** 
//			}                                              //    *
//			System.out.println();
//		}
//////////////////////////////////////////////////////////////////////////////////////////////////
		
//		for(int Line=1;Line<=4;Line++){                   // *
//		for(int star=1;star<=Line;star++){                // ** 
//			System.out.print("*");                        // *** 
//		}                                                 // **** 
//		System.out.println();
//	}
//
		
//////////////////////////////////////////////////////////////////////////////////////////////////

//		int numb = 1;
//		for(int Line=1;Line<=4;Line++){                   //1
//		   for(int num=1;num<=Line;num++){                //12                    
//			   System.out.print(numb); 
//			   numb++;                                    //123                     
//		   }                                              //1234                          
//		   System.out.println();                                   
//		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////
//		1 2 3 4 5 
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1 
//		
		
//		
//		for(int Line=5;Line>=1;Line--){                       //1
//			   for(int num=1;num<=Line;num++){                //12                    
//				   System.out.print(num);                     //123                     
//			   }                                              //1234                          
//			   System.out.println();                                   
//			}
//		
//		
		
		
		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////
		
//		char ch ='A';
//		
//		for(int Line=1;Line<=4;Line++){                   //A
//	       for(int chara=1;chara<=Line;chara++){          //BC                    
//			   System.out.print(ch);                      //DEF                    
//		        ch++;                                     //GHIJ   
//	       }                                                                     
//		   System.out.println();                                   
//		}
//////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print("*");
			}System.out.println();
		}
		
	}

}
