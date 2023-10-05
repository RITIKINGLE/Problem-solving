//WAP to find the number of count of vowels in the given string.
//diffrent method using contains() method;

public class string_6{
	public static void main(String args[]){
		String str = "The quick brown fox jumps over the lazy dog";
		int count=0;
		String s1 = "aieouAEIOU";
		for(int i=0; i<str.length(); i++){
			if(s1.contains(String.valueOf(str.charAt(i)))){
				count++;
			}
		}
		System.out.println(count);
	}
}