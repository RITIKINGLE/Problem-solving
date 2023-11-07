//WAP to capitalize each vowels from given string;
//Input : Microsoft Corporation. All rights reserved
//Output: MIcrOsOft COrpOrAtIOn. All rIghts rEsErvEd

public class string_13{
	public static void main(String args[]){
		String s1 ="Microsoft Corporation. All rights reserved";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();
		String v = "aeiouAEIOU";
		for(int i=0; i<s2.length;  i++){
			for(int j =0; j<s2[i].length(); j++){
				if(v.contains(String.valueOf(s2[i].charAt(j)))){
					sb.append(Character.toUpperCase(s2[i].charAt(j)));
				}
				else{
					sb.append(s2[i].charAt(j));		
				}
			}	
			if(i<s2.length-1)
				sb.append(" ");	
		}
		System.out.print(sb);
		   
	}
}