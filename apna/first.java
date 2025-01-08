package apna;

import java.util.Scanner;

public class first{
		public static void main(String []args){
			int[] marks={11,23,45};
            System.out.println(marks[0]); 
            
            int[][] finalmarks = {{11,23,45},{56,78,45}};
            System.out.println(finalmarks[0][2]);
            
            double price = 100;
            double fprice = price + 18.0;
            System.out.println(fprice);
            
            int pr = 100;
            int fpr = (int) (price + 18.0);
            System.out.println(fpr);
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount you have : " );
            int cash = sc.nextInt();
            
            if(cash>40){
            	 System.out.println("Can not buy anything");
            	 System.out.println("Get more cash");
            }
            else if(cash > 10 && cash<50){
            	 System.out.println("Get one thing");
            }
            
            		
			}
		}
