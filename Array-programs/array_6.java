public class array_6{
	public static void main(String args[]){
	int a[] = {121,31,144,523,572,354,876,742,192,432,4567,873};
	int temp =0;
	int b[] = new int[a.length];
        
       	for(int i=0; i<a.length; i++){
       		int digit3 = a[i] % 10;
		int digit2 = (a[i] / 10) % 10;
	       	int digit1 = a[i] / 100;
		
		int count = 0;
		temp = a[i];
		while(temp != 0){

			temp/=10;
			count++;
		}
		
		for(int j=1; j<count; j++)
			digit3*=10;

		for(int k=0; k<b.length; k++)
			b[i] = digit3 + digit1 *10 + digit2;
		

	}      
		for(int i=0; i<a.length; i++)		
			System.out.print(a[i]+" ");
		System.out.println();
		for(int i=0; i<b.length; i++)		
			System.out.print(b[i]+" ");
	
	}

	
}