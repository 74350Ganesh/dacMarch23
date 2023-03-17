class Star_pattern7
{
	public static void main(String args[])
	{   			
		for(int i=1; i<=5; i++)
		{
			for (int k=4; k>=i; k--)
			System.out.print(" ");
		
			for (int j=1; j<=i; j++)
			System.out.print("*");
		
			for (int j1=2; j1<=i; j1++)
			System.out.print("*");
		
			System.out.println();
		}
		for(int i=1; i<=4; i++)
		{
			for (int k=1; k<=i; k++)
			System.out.print(" ");
		
			for (int j=4; j>=i; j--)
			System.out.print("*");
		
			for (int j=3;j>=i;j--)
			System.out.print("*");
		
			System.out.println();
		}
	
	
	}
}