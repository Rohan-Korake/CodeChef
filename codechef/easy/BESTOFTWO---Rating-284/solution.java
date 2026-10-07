import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scanner=new Scanner(System.in);
	int t=scanner.nextInt();
	
	for(int i=0;i<t;i++)
	{
	    int firstAttempt=scanner.nextInt();
        int secondAttempt=scanner.nextInt();

        if(firstAttempt>secondAttempt)
        {
            System.out.println(firstAttempt);
        }
        else
        {
            System.out.println(secondAttempt);
        }
	}

	}
}
