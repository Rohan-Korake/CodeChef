import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	 Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int i=0;i<t;i++)
        {
            int weekCount=scanner.nextInt();
            int weekFees=scanner.nextInt();
            
            System.out.println(weekCount*weekFees);
        }
            scanner.close();
	}
}
