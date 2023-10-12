//WAP to find first 25 in reverse order

public class array_12{
	public static void main(String args[]){
		int n=1, count=0, end=0,count2=0;
		int arr[] = new int[25];
		
		while(true){
			count2 = 0;
			for(int i=1; i<=n; i++){
				if(n%i == 0){
					count2++;
				}
			}	


			if(count2 == 2){
				arr[count++] = n;
				end++;
			}
			
			if(end == 25){
				break;
			}
		n++;
		}
		for(int j=arr.length-1; j>=0; j--){
			System.out.print(arr[j]+" ");
		}
	} 
}