import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            int totalDistance=0;
            
            for(int i=0;i<5;i++)
            {
                totalDistance+=x+x;
            }
            System.out.println(totalDistance);
        }
        
        
        scanner.close();
    }
}
