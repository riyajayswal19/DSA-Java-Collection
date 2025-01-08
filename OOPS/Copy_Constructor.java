package OOPS;

public class Copy_Constructor {

	public static void main(String[] args) {
		
		Stude s1 = new Stude();

		s1.name = "Riya";
		s1.roll = 123;
		s1.pass= "abc";
		s1.marks[0] = 100;
		s1.marks[1] = 90;
		s1.marks[2] = 80;
		
		Stude s2 = new Stude(s1);//copy
		s2.pass = "xyz";
		s1.marks[2] = 70;
		
		for(int i=0;i<3;i++){
			System.out.println(s2.marks[i]);
		}
		
		System.out.println(s2.pass);
		
		
	}
}

class Stude{
	
	String name;
	int roll;
	String pass;
	int marks[];
	
	
	// Shallow copy Constructor
//	Stude(Stude s1){
//		marks =new int[3];
//		this.name = s1.name;
//		this.roll = s1.roll;
//		this.marks = s1.marks;
//	}
	
	
	// Deep Copy constructor
	
	Stude(Stude s1){
		marks =new int[3];
		this.name = s1.name;
		this.roll = s1.roll;
		for(int i=0;i<3;i++){
			this.marks[i] = s1.marks[i];
		}
	}
	
	
	Stude(){
		marks =new int[3];
		System.out.println("Constructor is called ");
	}
	
    Stude(String name){
    	marks =new int[3];
		this.name = name;
	}
    
	Stude(int roll){
		marks =new int[3];
		this.roll = roll;	
	}
	
}
