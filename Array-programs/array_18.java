//WAP to find 78th perfect square.
//Output = 5929;

public class array_18{
	public static void main(String args[]){
		
		int n=0,n1=n, count=0, start=0, end=78;
		while(true){
			n1=n;
			if(Math.sqrt(n) %1  == 0)	
				start++;
			
			if(start == end){
				System.out.print(n1);
				break;
			}
		n++;
		}
		
	}
}