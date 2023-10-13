//WAP to find given number is palimdromic prime or not.

public class array_13{
	public static void main(String args[]){
		int n=6;
		int count=0, sum=0;
		for(int i=1; i<=n; i++){
			if(n%i == 0){
				count++;
			}
		}
		int temp = n;	
		while(temp!=0){
			sum *= 10;
			sum += temp%10;
			temp/=10;
		}
		System.out.println(sum);
		
		if(count == 2 && n == sum){
			System.out.print(n+ " is palindromic prime");
		}
		else{
			System.out.print(n+ " is not palindromic prime");
		}
			
		
	} 
}