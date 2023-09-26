//WAP to find the count of vowels in given String.
//output = 11;

public class string_5{
	public static void main(String args[]){
		StringBuilder str = new StringBuilder("The quick brown fox jumps over the lazy dog");
		int count=0;	
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' ){
				count++;
			}
		}
		System.out.print(count);
	}
}