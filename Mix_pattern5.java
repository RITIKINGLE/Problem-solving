/*
oA jF fJ cM aO
   nB iG eK bN
      mC hH dL
         lD gI
            kE

*/

public class Mix_pattern5{
	public static void main(String args[]){
		int n=5;
		int count1= (n*(n+1)/2);
		int count2 = 1;
		
		for(int i1=1; i1<=n; i1++)
		{
			int c1  = count1;
			int c2  = count2;
			for(int j=i1; j>1; j--)
			{
				System.out.print("   ");
			}
			for(int j1=n; j1>=i1; j1--)
			{
				System.out.print((char)(c1+96)+""+ (char)(c2+64) + " ");
				c1 -=j1 ;
				c2 +=j1;
			}
			System.out.println();
			count1--;
			count2++;
		}
	}
}