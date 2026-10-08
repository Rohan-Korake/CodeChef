import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner= new Scanner(System.in);
		int t=scanner.nextInt();
		
		for(int i=0;i<t;i++)
		{
		    int money=scanner.nextInt();
		    int bill=scanner.nextInt();
		    
		    if(money>=bill)
		    {
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}

	}
}
