import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = buffer.readLine().split(" ");

        int num1 = Integer.parseInt(inputs[0]); 
        int num2 = Integer.parseInt(inputs[1]);
        System.out.println(num1 - num2);
    }
}