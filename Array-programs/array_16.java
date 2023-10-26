//WAP to find 38th prime and twist number.

public class array_16{
	public static void main(String args[]){
		int start=0, end=9, count=0,sum=0,count2=0,count3=0;
		int n=1,n1=n;
		while(true){
		n1=n;
		count=0;
		count2=0;
		sum=0;
			for(int i=2; i<=n/2; i++){
				if(n%i == 0){
					count2++;
				}
			}
			if(count2 == 0){
				System.out.println(n1);
				while(n1!=0){
					sum *= 10;
					sum += n1%10;
					n1/=10;	
				}
				for(int j=2; j<=sum/2; j++){
					if(sum%j == 0){
						count++;
					}
				}
				if(count == 0){
					count3++;	
				}
			
			}
			
			
			if(count3 == end){
	System.out.println(n+ " is " +end+ "th prime and twist number.");
				break;
			}
		n++;
		}
	}
}