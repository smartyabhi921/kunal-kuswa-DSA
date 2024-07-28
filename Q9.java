import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        int fact = 0;
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++)
        {
            fact = i*n*(n-1);
            n = n/2;
        }
       
        System.out.println(fact);

    
   } 
}
