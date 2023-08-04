
public class greatest_of_four_number{
	public static void main(String args[]){
		int a=210, b=550, c=20, d=70;

		if(a>b && a>c && a>d){
			System.out.print("a is greater");
		}
		else if(b>c && b>d){
			System.out.print("b is greater");
		}
		else if(c>d){
			System.out.print("c is greater");
		}
		else{
			System.out.print("d is greater");
		}
		
	}
}