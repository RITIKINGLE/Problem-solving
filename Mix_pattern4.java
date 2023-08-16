/*
AE CI FL JN OO
BD EH IK NM
DC HG MJ
GB LF
KA

*/

public class Mix_pattern4{
	public static void main(String args[]){
		int n=5;
		int count1= 1;
		int count2 = n;
		
		for(int i1=1; i1<=n; i1++)
		{
			int c1  = count1;
			int c2  = count2;
			for(int j1=i1, j2=n; j1<=n || j2>=i1; j1++,j2--)
			{
				System.out.print((char)(c1+64)+""+ (char)(c2+64) + " ");
				c1 +=j1+1 ;
				c2 +=j2-1;
			}
			System.out.println();
			count1+=i1;
			count2--;
		}
	}
}