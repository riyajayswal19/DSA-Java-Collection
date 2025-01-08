package String;

public class StringFunctions {
	

	public static void main(String[] args) {
		
		String str = "Tony";
		String str2 = "Tony";
		
		if(str.equals(str2)){
		System.out.println("Strings are equal");
		}else{
			System.out.println("Strings are NOT equal");
		}
//////////////////////////////////////////////////////////////////////////
		
		String s1[] = {"Apple","Mango","Banana"};
		String largest = s1[0];
		for(int i=0;i<s1.length;i++){
			if(largest.compareTo(s1[i]) < 0){
			largest = s1[i];
			} 
		}
		System.out.println(largest);

/////////////////////////////////////////////////////////////////////
		
		StringBuilder sb = new StringBuilder("");
		for(char ch ='a';ch<='z';ch++){
			sb.append(ch);
		}
		System.out.println(sb);
		
///////////////////////////////////////////////////////////////////////
		//UpperCase 
		
		String name ="hi i am riya";
		StringBuilder sb1 = new StringBuilder("");
		char ch = Character.toUpperCase(name.charAt(0));
		sb1.append(ch);
		
		for(int i=1 ;i<name.length();i++){
			if(name.charAt(i) == ' ' && i<name.length()-1){
				sb1.append(name.charAt(i));
				i++;
				sb1.append(Character.toUpperCase(name.charAt(i)));
			}else{
				sb1.append(name.charAt(i));
			}
		}
		
		System.out.println(sb1);
		
	}
	
	
	

}
