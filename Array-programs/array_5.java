//WAP to merge two array

public class array_5{
	public static void main(String args[]){
		int a1[] = {1,2,3,4,5,0,0};
		int a2[] = {6,7,8,9,10};
		int a[] = new int[a1.length + a2.length];

		for(int i=0; i<a1.length; i++)	
			a[i] = a1[i];

		for(int j=0; j<a2.length; j++)
			a[a1.length + j] = a2[j]; 

		for(int j=0; j<a.length; j++)
			System.out.print(a[j]+" ");
	}
}