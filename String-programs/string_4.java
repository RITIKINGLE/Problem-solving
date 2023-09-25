//WAP to shift last char of string to first place.
/*
public class string_4{
	public static void main(String args[]){
		
		StringBuilder str = new StringBuilder("Programing");
		StringBuilder s1  = new StringBuilder();
		
		s1.append(str.charAt(str.length()-1));
	
		for(int i=0; i<str.length()-1; i++)
			s1.append(str.charAt(i));
		System.out.print(s1);
	}
}
*/


//using substring() method.
public class string_4{
	public static void main(String args[]){
		StringBuilder str = new StringBuilder("Genesis");
		StringBuilder s1 = new StringBuilder();
		s1.append(str.charAt(str.length()-1));
		s1.append(str.substring(0,str.length()-1));
	
		System.out.print(s1);		
			
	}
}