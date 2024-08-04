package pattern;
import java.util.*;

public class pattern 
{

	public static void main(String[] args) 
	{
		int i,j;
		int n,cnt=-1;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number to see a magic:");
		n=obj.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(i==0)
			{
				for(j=0;j<(n*2)+1;j++)
				{
					System.out.print("#");
				}
			}
			else
			{
				for(j=n;j>=i;j--)
				{
					System.out.print("#");
				}
				for(j=0;j<cnt;j++)
				{
					System.out.print(" ");
				}
				for(j=n;j>=i;j--)
				{
					System.out.print("#");
				}
			}
			cnt+=2;
			System.out.println("");
		}
		for(i=0;i<n+1;i++)
		{
			if(i==n)
			{
				for(j=0;j<(n*2)+1;j++)
				{
					System.out.print("#");
				}
			}
			else
			{
				for(j=0;j<=i;j++)
				{
					System.out.print("#");
				}
				for(j=cnt;j>0;j--)
				{
					System.out.print(" ");
				}
				for(j=0;j<=i;j++)
				{
					System.out.print("#");
				}
			}
			cnt-=2;
			System.out.println("");
		}
	}

}