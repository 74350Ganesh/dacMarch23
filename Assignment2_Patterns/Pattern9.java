class Pattern9
{
	public static void main(String args[])
	{   System.out.println("Pattern 9:");
		int alph = 64;
	
		for(int i=1; i<=5; i++)
		{
			for (int k=4; k>=i; k--)
			System.out.print(" ");
		
			for (int j=1; j<=i; j++)
			System.out.print((char)(alph+j)+" ");
			System.out.println();
		}
	
	
	}
}