//WAP to find longest eord in a string.

public class string_9{
	public static void main(String args[]){
		
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
		

	}
}

/*
	int max =0;
	String s2[]= s1.split(" ");
	for(int i=0; i<s2.length; i++){
		if(max<s2[i].length()){
			max = s2[i].length();
		}
	}
	for(int i=0; i<s2.length; i++){
		if(max == s2[i].length())
			System.out.println(s2[i]);
	}	
*/
