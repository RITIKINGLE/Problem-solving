public class array_7{
	public static void main(String args[]){
	int a[] ={121,31,144,523,572,354,876,742,192,432,4567,873};
	int b[] = new int[a.length];
		int temp=0;
		for(int i=0; i<a.length; i++)
		{
			int count=0, sum=0;
			int digit1 = a[i]/100;
			int digit2 = (a[i]/10) % 10;
			int digit3 = a[i]%10;
	
			temp = a[i];
			while(temp != 0){
				sum*=10;
				sum += temp%10;
				temp/=10;
				count++;
			} 
			
			if(a[i] != sum){
				for(int j=1; j<count; j++)
					digit3*=10;
		
				b[i] = digit3 + digit1 * 10 + digit2;
			}else{
				b[i] = a[i];
			}
		} 
		for(int i=0; i<b.length; i++)
			System.out.print(a	[i]+" ");
		System.out.println();
		for(int i=0; i<b.length; i++)
			System.out.print(b[i]+" ");
	}
}