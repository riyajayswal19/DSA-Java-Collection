package apna;

import java.util.Scanner;

public class mini_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner (System.in);
		int myNum =(int)(Math.random()*100);
        
		int user = 0;
		do{
				System.out.println("Guess my number : ");
				 user = sc.nextInt();
				if(user == myNum){
				   System.out.println("WOOHOO....Correct answer");
				   break;
				}
				else if(user > myNum){
					System.out.println("your number is greater");
				}
				else {
					System.out.println("too small answer");
				}
				
		}while(user >=0);
			
			System.out.println("My number was : ");
			System.out.println(myNum);
			
		
		
		
	}

}
