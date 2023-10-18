//WAP to fin 58th palindromic prime 
public class array_15{
	public static void main(String args[]){
		int n=1, n1=n, start=0, end=58;
		int sum=0;
			
		while(true){
			
			sum=0;
			n1 = n;	

			while(n1!=0){
				sum *= 10;
				sum += n1%10;
				n1/=10;
			}
			
			if(sum == n){
				for(int i=2; i<=sum/2; i++){
					if(sum%i == 0){
						start++;
						break;	
					}
				}
			}	
		
			if(start == end){
				System.out.print(sum);
				break;
			}
		n++;	
		}
	}
}