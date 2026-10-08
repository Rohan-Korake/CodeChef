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
            int income = scanner.nextInt();
            if (income > 100)
            {
                System.out.println(income - 10);
            } else {
                System.out.println(income);
            }
        }

    }
}