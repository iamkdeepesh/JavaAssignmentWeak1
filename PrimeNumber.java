package Precourse;

public class PrimeNumber {
public static void main(String args[])
{
	for(int i=2;i<100;i++)
	{
		int a=i/2;
		int b=0;
		for(int j=2;j<=a;j++)
		{
			if(i%j==0)
			{
				b=b+1;
			}
		}
		if(b==0)
		{
			System.out.println(i+" is a Prime Number");
		}
	}
}
}
