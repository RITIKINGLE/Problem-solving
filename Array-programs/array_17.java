//WAP to find 18th armstrong number.
//Output = 92727;

public class array_17{
	public static void main(String args[]){
		int end=18, start=0,count=0;
		int n=1,n1=n, num=0, sum=0,count2=1;
	while(true){
		n1=n;	
		count=0;
		num=0;
		while(n1!=0){
			n1/=10;
			count++;	
		}
		n1=n;
		while(n1!=0){
			count2=1;
			sum = n1%10;
			for(int i=1; i<=count; i++){
				count2 *= sum;
			}
			n1/=10;
			num += count2;
		}
		
		if(num == n){
			start++;
		}
		if(start == end){
			System.out.println(num);
			break;
		}
	 n++;		
	}
	}
}
