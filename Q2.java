import java.util.Scanner;

import javafx.scene.transform.Scale;

class Q2{
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long  a = sc.nextInt();

        oddev(a);

    }

    static void oddev(long a ){
        
      if(a%2==0){

        System.out.println("even numrr ");
      }
      else{

        System.out.println("odd");
      }
    }
}