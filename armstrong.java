import java.util.Scanner;

import javafx.scene.transform.Scale;

public class armstrong {

    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);

     System.out.println("enter number");

     int n = sc.nextInt();
     int sum = 0;
     int original=0;
     original =n;
     sc.close();
    

     while (n>0){
         
        int rem = n%10; 

        n = n/10;
        System.out.println(""+ n + " rem"+ rem);
        
        sum +=(rem*rem*rem );
        System.out.println("sum"+ sum);
    }
    System.out.println("sum"+ sum +" n value"+n);
    if (sum==original) {

        System.out.println("true");
        
    }else{

        System.out.println("false");
    }
    }
    
}
