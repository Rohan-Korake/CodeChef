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
            int chefSalary = scanner.nextInt();
            int chefinaSalary = scanner.nextInt();

            System.out.println(chefinaSalary - chefSalary);

        }

    }
}