//WAP to find prime number.

public class array_10{
	public static void main(String args[]){
		int n=121;
		int count=0;
		for(int i = 1; i<=n; i++){
			if(n%i == 0){
				count++;	
			}
		}
		
		if(count ==2){
			System.out.print(n+ " prime");
		}else{	
			System.out.print(n+ " not a prime");
		}
	}
}