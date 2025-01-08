package String;

public class PalindrimeString {

	public static void main(String[] args) {
		String str = "noon";
		
		for(int i=0;i<str.length();i++){
			int n = str.length();
			if(str.charAt(i) != str.charAt(n-1-i) ){
				System.out.println("false");
			}
		}
		System.out.println("true");
	}

}
