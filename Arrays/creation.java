package Arrays;

public class creation {
	
	public static void update(int marks[]){
		
		for(int i=0;i<marks.length;i++){
			marks[i] = marks[i]+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[] = {33,56,78};
		update(marks);

		for(int i=0;i<marks.length;i++){
		
		System.out.println(marks[i]);
		}
		System.out.println();

	}

}
