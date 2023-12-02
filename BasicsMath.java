package Day3;
import java.util.*;
public class BasicsMath 
{
    //Count Digits using Function.
    public static int countdigit(int n)
    {
       int x = n; int count =0;
       while( x!=0 ) 
      {
          x = x / 10;
          count++;
      }
       return count;
    } 
    public static void main(String args[]) 
    { 
        int n = 789065433;
        System.out.println(countdigit(n));
    } 

    //Print Divisors using Function
    static public void divisors(int n)
	{
		for(int i=1;i<=n;i++)		
		if(n%i==0)
		System.out.println(i);
	}
	public static void main1(String[]args)
	{
		int n=18;
		divisors(n);
	}

    //palindrome Num

    public static void  palinadrome(String[]args)
	{
		int rev=0;
		int temp;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		temp=n;;
		while(n>0)
		{
			int ld=n%10;
			n=n/10;
			rev=rev*10+ld;
		}
		if(rev==temp)
		{
			System.out.println("its a palinadrome");
		}
		else
		{
			System.out.println("Its not palinadrome");
		}
	}

    //Armstrong num
    public static void Armstrong(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c,sum=0;
		int temp=n;
		while(n>0)
		{
			int ld=n%10;
			n=n/10;
			sum=sum+(ld*ld*ld);
		}
		if(sum==temp)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

    //
}
