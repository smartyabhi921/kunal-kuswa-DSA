import java.util.*;
public class Q8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
     
        
        System.out.println(Prime(n));
        
        
        sc.close();
 
    }

    static boolean Prime(int n){

        int c = 2;

        if (n<=1){

        return false;
        }
        while(c<n){

            if(n%c==0){

                return false;
            }
            c++; 
        }
        return c * c  > n;   
        
    }
}