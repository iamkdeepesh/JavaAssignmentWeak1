package Precourse;

public class GretestAmongThree {
	public static void main(String args[])
	{
		int a=0;
		int b=30;
		int c=80;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c+" Is Gretest");
			}
		}
		else {
			if(b>c)
			{
				System.out.println(b+" Is Gretest");
			}
			else
			{
				System.out.println(c+" Is Gretest");
			}
		}
	}

}
