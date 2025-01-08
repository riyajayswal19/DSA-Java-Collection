package apna;

import java.util.Scanner;

public class Oswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter day :");
//		int day = sc.nextInt();
// 
//	
//		switch(day){
//		case 1: 
//			System.out.println("Sunday");
//			break;
//		case 2: 
//			System.out.println("Monday");
//			break;
//		default: 
//			System.out.println("Kuchbhi");
//			break;	
		////////////////////////////////////////////////////////////////////////
		
		
		// for loop
		
//		for(int i =1; i<=100;i++){
//			System.out.println(i);
//		}
		
//		int j = 0;
//		while(j<=100){
//			System.out.println(j);
//			j++;
//		}
		
//		int k = 0;
//		do{
//			System.out.println(k);
//			k++;
//		}while(k<=100);
		
		////////////////////////////////////////////////////////////////////////////
		
//		Scanner sc = new Scanner(System.in);
//		int i = 0;
//		
//		while(true){
//			System.out.println(i);
//			i++;
//			
//			if(i>5){
//				System.out.println("Stop here");
//				break;
//			}
//			
//		}
//		//////////////////////////////////////////////////////////////////////////////////
		
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while(true){
			if(i==3){
				i = i+1;
				continue;
			}
		
			
			
				System.out.println(i);
				i++;
				
				if(i>5){
					break;
				}
			
			
		}
		
		
		
	}

}
