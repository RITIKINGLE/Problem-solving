//WAP to shift the first character of the string to last.

public class string_3{
	public static void main(String args[]){
		StringBuilder str = new StringBuilder("Programing");
		StringBuilder s1 = new StringBuilder();
		for(int i=1; i<str.length(); i++)
			s1.append(str.charAt(i));
		s1.append(str.charAt(0));

		System.out.print(s1);
	}
}

