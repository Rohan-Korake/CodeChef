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
            int totalStudent = scanner.nextInt();
            int totalChair = scanner.nextInt();
            if (totalStudent <= totalChair)
            {
                System.out.println("0");
            } else
            {
                System.out.println(totalStudent - totalChair);
            }

        }

    }
}