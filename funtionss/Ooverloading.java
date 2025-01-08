package funtionss;

public class Ooverloading {
	
	public static int sum(int a, int b ){
		return a+b;
	}
	
	public static int sum(int a, int b,int c ){
		return a+b+c;
	}
	
	public static double sum(float a, int b,int c ){
		return a+b+c;
	}
	
	

	public static void main(String[] args) {
		System.out.println(sum(3,5));
		System.out.println(sum(3,5,2));
		System.out.println(sum( 3.3f,5,2));
    }

}
