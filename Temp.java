import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter");

        int c = sc.nextInt();

        tempp(c);

        
    }

   static float tempp(int t){

    float f  = (t * 9/5) + 32;

          System.out.println(f);
    
    return f;
   }


}
