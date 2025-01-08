package OOPS;

public class Contructor {

	 public static void main(String[] args) {
	        
		 Stu s1 = new Stu();    //  Stu s1 = new Stu("Riya");
	        //System.out.println(s1.name);
	    }

	}

	class Stu {
	    String name;
	    int roll;
	    
	    Stu() {    //  Stu(String name)
	        //this.name = name;
	    	System.out.println("Constructor is called.. ");
	    }
	}