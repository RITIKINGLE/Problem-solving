public class array_11{
	public static void main(String args[]){
		int n = 1,count=0, end=0;
		while(true){
		count=0;
			for(int i=1; i<=n; i++)
			{
				if(n%i == 0)
					count++;
					
			}		
			if(count == 2){
				end++;
			}
			

			if(end == 63){
				System.out.println(end+ "st Prime number is " +n);
				break;
			}
			n++;
		}
	}
}