package conditional_statements;

public class For_loop
{

	public static void main(String[] args) 
	{
		int n=500;
		int i=1;
		for(i=1; i<=n;i++)
		{
			if(i%2==0 && i%3==0)
			{
				System.out.println("divisible by 2&3:"+i);
			}
			 else{
				System.out.println("not divisible by 2&3:"+i);
			}
		 
		}
	}
}
		
		
		

	 
	


