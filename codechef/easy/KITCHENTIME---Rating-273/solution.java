import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(buffer.readLine());
        int[] startTime = new int[n];
        int[] endTime = new int[n];

        for (int i = 0; i < n; i++)
        {
            String[] parts = buffer.readLine().split("\\s+");
            startTime[i] = Integer.parseInt(parts[0]);
            endTime[i] = Integer.parseInt(parts[1]);
        }

        for (int i = 0; i < n; i++)
        {
            System.out.println(endTime[i] - startTime[i]);
        }
    }
}