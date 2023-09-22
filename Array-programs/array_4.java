//Seprate array on basic on Odd and Even numbers.
 
public class array_4{
	public static void main(String args[]){
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int arr1[] = new int[a.length];
		int arr2[] =  new int[a.length];

		int count1 =0, count2=0; 

		for(int i=0; i<a.length; i++){
			if(a[i]%2!=0)		
				arr1[count1++] = a[i];
			else
				arr2[count2++] = a[i];
		}	
		
		for(int j=0, k=0; j<count1 || k<count2; j++, k++ )
			System.out.println(arr1[j]+" "+arr2[k]);
	}
}