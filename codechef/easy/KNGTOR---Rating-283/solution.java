import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++)
        {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            int M_CarPassenger = 0, N_CarPassenger = 0;
            N_CarPassenger = N * 5;
            M_CarPassenger = M * 7;
            System.out.println(N_CarPassenger + M_CarPassenger);
        }
        scanner.close();
    }
}