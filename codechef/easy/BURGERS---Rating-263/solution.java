
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int i=0;i<t;i++)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            System.out.println(Math.min(a,b));
        }
        scanner.close();
	}
}
