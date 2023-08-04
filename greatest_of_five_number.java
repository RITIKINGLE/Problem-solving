
public class greatest_of_five_number{
	public static void main(String args[]){
		int a=210, b=50, c=20, d=70, e=10;

		if(a>b && a>c && a>d && a>e){
			System.out.print("a is greater");
		}
		else if(b>c && b>d && b>e){
			System.out.print("b is greater");
		}
		else if(c>d && c>e){
			System.out.print("c is greater");
		}
		else if(d>e){
			System.out.print("d is greater");
		}
		else{
			System.out.print("e is greater");
		}


	}
}