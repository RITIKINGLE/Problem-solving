public class swap_without_using_third_variable{
	public static void main(String args[]){
		int a=10, b=20;
		a +=b;
		b = a-b;
		a-=b;
		System.out.println("a=" +a);
		System.out.println("b=" +b); 
	}
}