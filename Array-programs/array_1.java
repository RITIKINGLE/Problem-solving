//WAP to find average of odd and even numbers in an array;
public class array_1{
	public static void main(String args[]){
		int a[] = {12,54,21,89,21,32,45,14};	
		double avg1=0, avg2=0;
		int count1=0, count2=0;
		for(int i=0; i<a.length; i++){
			if(a[i]%2!=0){
				avg1 += a[i];
				count1++;
			}
			else{
				avg2 += a[i];
				count2++;
			}
		}
		avg1/=count1;
		avg2/=count2;
		System.out.println(avg1+ " is average of odd numbers");
		System.out.println(avg2+ " is average of even numbers");
	}
}