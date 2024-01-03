package conditional_statements;

public class RRR_practiced2
{

	public static void main(String[] args) 
	{
		int x=5;
		int y=20;
		int z=5;
		
		if(z>y)
		{
			System.out.println("Checking 1nd condition");

			if(x<z)
			{
				System.out.println("it is even numbers");
			}
			else if(y>x)
			{
				System.out.println("it is a ood number");
			}
			else if(x>=y)
			{
				System.out.println("it is right a number");
			}
			else
			{
				System.out.println("it is not number ");
			}
		}
	    else if(x<y)
	    {
			System.out.println("Checking 2nd condition");
	
			if(x<z)
			{
				System.out.println("it is bhanu");
			}
			else if(z>=x)
			{
				System.out.println("it is a hari");
			}
			else
			{
				System.out.println("it is not a name");
			}
		}
		else if(z<=y)
		{ 
			System.out.println("Checking 3nd condition");
	
			if(x==z)
			{
				System.out.println("it is joney");
			}
			else if(y<=z)
			{
				System.out.println("it is anushka");
			}
			else
			{
				System.out.println("it is a prabas");
			}
		}				
	}
}



