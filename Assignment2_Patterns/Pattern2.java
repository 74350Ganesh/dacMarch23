class Pattern2{
	public static void main(String args[])
	{
		int alph = 65;
		for( int i=0 ;i<=4;i++)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print((char)(alph+j)+" ");
			}
			System.out.println();
		}
		
	}
}