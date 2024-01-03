package conditional_statements;

public class gfd3
{

	public static void main(String[] args)
	{
		int a=0;
		if(a>0) {
			if(a%2==0) {
				System.out.println("Even Number");
			}
			else {
				System.out.println("Odd Number");
			}
		}
		else if(a<0){
			System.out.println("Negative Number");
		}
		else if(a==0){
			System.out.println("It is Zero");
		}
	}

}
