class Pattern18
{
	public static void main(String args[])
	{
		int alph=64;
		
		for(int a=5;a>=1;a--)
	{
		for(int b=1;b<=a;b++)
		{
			System.out.print((char)(alph+b)+" ");
		}
		System.out.println();
	}
	}
}