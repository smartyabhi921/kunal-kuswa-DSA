# kunal-kuswa-DSA
kunan kuswa questions
import java.util.*;

class Q1{
   public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int  a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.close();

    method1(a, b, c);
    method2(a, b, c);

   }

   static void method1( int a , int b , int c )
   {
     
    if(a>b && a>c){

      System.out.println(a + " is max");
     }
    else if(b>a && b>c) {

      System.out.println(b + "is max ");
    }
    else {

      System.out.println(c + "is max");
    }

   }

  static void method2(int a, int b, int c)
  {

    if(a<b && a<c){

      System.out.println(a + " is min");
     }
    else if(b<a && b<c) {

      System.out.println(b + "is min ");
    }
    else {

      System.out.println(c + "is min");
    }


  } 


  
}




Q2 find odd evv




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
