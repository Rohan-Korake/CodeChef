import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int t= scanner.nextInt();
		int points,testPassed;
		
		for(int i=0;i<t;i++)
		{
		    points=scanner.nextInt();
		    testPassed=scanner.nextInt();
		    if(points!=0 || testPassed!=0)
		    {
		        
		   System.out.println((points*testPassed)/10);
		    }
		}
	}
}
