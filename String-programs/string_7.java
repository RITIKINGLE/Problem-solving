//WAP to count number of word in a string

public class string_7{
	public static void main(String args[]){
		String s1 = "I am a java developer";
		
		System.out.print(s1.split(" ").length);
	}
}

/*
public class string_7{
	public static void main(String args[]){
		String s1 = "I am a java developer";
		int count=0;
		String s2[] = s1.split(" ");
		for(int i=0; i<s2.length; i++){
			if(s2[i].length()!=0)
				count++;
		}
		System.out.println(count);
	}
}
*/