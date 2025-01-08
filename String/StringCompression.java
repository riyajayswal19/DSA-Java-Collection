package String;

public class StringCompression {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "aaabbcd";
//		String newstr ="";
//		
//		for(int i=0;i<str.length();i++){
//			Integer count =1;
//			while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//				count++;
//				i++;
//			}
//			newstr += str.charAt(i);
//			if(count > 1){
//				newstr += count.toString() ;
//			}
//		}
//		
//		System.out.println(newstr);
		
///////////////////////////////////////////////////////////////////////////////////////////////////		
		
		//Using StringBuilder
		
		String str = "aaabbcd";
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0; i<str.length();i++){
			Integer count =1;
			while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
				count++;
				i++;
		  }
			sb.append(str.charAt(i));
			if(count>1){
				sb.append(count.toString());
			}
		}
		System.out.println(sb);

	}

}
