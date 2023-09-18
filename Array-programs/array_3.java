//Find the second highest element in the array.
public class array_3{
	public static void main(String args[]){
		int a[] = {54,34,65,87,89,9,56,34,23,22};
		//int a[] = {5,4,3,2,1};
		int temp =0;
		for(int i=0; i<a.length-1; i++){
			for(int j=0; j<a.length-1; j++){
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		
		System.out.println(a[a.length-2]+" ");
	}
}