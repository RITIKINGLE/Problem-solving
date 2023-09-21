// WAP to print given string and in reverse order.

public class string_2{
	public static void main(String args[]){
		String str = new String("JAVA");
		for(int i=0; i<str.length(); i++)
			System.out.println(str.charAt(i));
	
		System.out.println("--------");
		
		for(int i=str.length()-1; i>=0; i--)
			System.out.println(str.charAt(i));
	}
}