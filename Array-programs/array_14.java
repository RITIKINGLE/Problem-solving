//WAP to check the given number is circular prime or not.

public class array_14{
	public static void main(String args[]){
		int n = 19937;
		int temp=n, count=0,sum=0;
		while(temp!=0){
			temp/=10;
			count++;
		}
		System.out.print(temp);

		for(int i=0; i<count; i++){
			temp = n;
			sum = temp/10;
		}
		
		System.out.print()
	}
}