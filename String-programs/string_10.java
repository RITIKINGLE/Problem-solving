//wap to sort sentence lexicpgraphycally.
import java.util.Arrays;

public class string_10{
	public static void main(String args[]){
		
		String s1 = "I am a java developer";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();
		Arrays.sort(s2);
		
		for(int i=0; i<s2.length; i++){
			sb.append(s2[i]);
			if(i < s2.length-1)
				sb.append(" ");
		}
		System.out.print(sb);

	}
}

/*
String s1 = "Welcome to international airport";
		String s2[] = s1.split(" ");
		StringBuilder large = new StringBuilder(s2[0]);
		int n = s2[0].length();
		for(int i=0; i<s2.length; i++){
			if(s2[i].length() > n){
				large.append(s2[i]);	
			}
			
		}
		System.out.print(large);
*/