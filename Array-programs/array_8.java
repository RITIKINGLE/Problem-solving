public class array_8{
	public static void main(String args[]){
	int a[] = {121,31,144,523,572,354,876,742,192,432,4567,873};
	int b[] = new int[a.length];
 	for(int i=0; i<a.length; i++)
	{	
		int temp=0, count=0;
		temp = a[i];
		int digit1=0, digit2=0;

			while(temp != 0){
				temp/=10;
				count++;
			}	

		digit1 = a[i];
		for(int j=1; j<count; j++){
			digit1/=10;
		}
		digit2 = a[i]%10;

		b[i] = digit1 * 10 + digit2; 	
	}

		for(int i=0; i<b.length; i++)
			System.out.print(b[i]+" ");
	}
}