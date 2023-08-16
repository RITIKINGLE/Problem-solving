/*
AO
FJ	BN
JF	GI	CM
MC	KE	HH	DL	
OA	NB	LD	IG	EK

*/

public class Mix_pattern3{
	public static void main(String args[]){
		int n=5;
		int count1= 1;
		int count2 = (n*(n+1)/2);
		
		for(int i1=n; i1>=1; i1--)
		{
			int c1  = count1;
			int c2  = count2;
			for(int j1=i1; j1<=n; j1++)
			{
				System.out.print((char)(c1+64)+""+ (char)(c2+64) + " ");
				c1 -=j1 ;
				c2+=j1;
			}
			System.out.println();
			count1+=i1;
			count2-=i1;
		}
	}
}