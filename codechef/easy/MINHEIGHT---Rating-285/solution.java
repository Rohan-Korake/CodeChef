import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++)
        {
            int sonHeight = scanner.nextInt();
            int requiredHeight = scanner.nextInt();

            if (sonHeight >= requiredHeight)
            {
                System.out.println("YES");
            } else{
                System.out.println("NO");

            }
        }
    }
}