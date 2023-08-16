/*
Ka
Gc	Lb
Df	He	Md
Bj	Ei	Ih	Ng
Ao	Cn	Fm	Jl	Ok
*/

public class Mix_pattern2{
	public static void main(String args[]){
		int n=5;
		int count1= (n*(n-1)/2)+1;
		int count2 = 1;
		
		for(int i1=n, i2=1; i1>=1||i2<=n; i1--, i2++)
		{
			int c1  = count1;
			int c2  = count2;
			for(int j1=i1; j1<=n; j1++)
			{
				System.out.print((char)(c1+64)+""+ (char)(c2+96) + " ");
				c1 += j1+1;
				c2--;
			}
			System.out.println();
			count1-=i1-1;
			count2+=i2+1;
		}
	}
}