class Star_pattern16{
	public static void main(String[] arg)
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=5;k>=i;k--)
				System.out.print(" ");
			
			for(int j=1; j<=i; j++)
			{
				if(i<5)
				{
				    if(j==1 || j==i)
				        {System.out.print("*");} 
					else{System.out.print(" ");}
				}
				else{System.out.print("*");}
			}
			System.out.println();
		}
	}
}