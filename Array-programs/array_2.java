//Highest number in an array.

public class array_2{
	public static void main(String args[]){
		int a[] = {110,45,34,67,34,56,21,11,55,87};
		int high = a[0];
	
		for(int i=0; i<a.length; i++){
			if(a[i] > high){
				high = a[i];
			}
		}
		System.out.println(high);
	}
}