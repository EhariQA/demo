package conditional_statements;

public class Nested_if 
{

	public static void main(String[] args)
	{
		int a=5;
		if(a<1)
		{
			if (a%2==0)
			{
			System.out.println("it is even number");
		}
			else 
			{
				System.out.println("it is odd number");
			}
		}
			

			else if(a<1)
			{
				System.out.println("it is negetive number");
			}
			else if(a<4)
			{
				System.out.println("it is a worng number");
			}
			else 
			{
				System.out.println("it is invalied");
			}
			

   }
  }



