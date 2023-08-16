/*
Ak
Fl	Bg
Jm	Gh	Cd
Mn	Ki	He	Db
Oo	Nj	Lf	Ic	Ea
*/

public class Mix_pattern1{
	public static void main(String args[]){
		int n=5;
		int count1= 1;
		int count2 = (n*(n-1)/2)+1;
		
		for(int i=n; i>=1; i--)
		{
			int c1  = count1;
			int c2  = count2;
			for(int j1=i,j2=n; j1<=n|| j2>=i; j1++,j2--)
			{
				System.out.print((char)(c1+64)+""+ (char)(c2+96) + " ");
				c1 -= j1;
				c2 -= j2;
			}
			System.out.println();
			count1+=i;
			count2++;
		}
	}
}