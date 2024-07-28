
import java.util.Scanner;

public class Random {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter marcs");

         int a = sc.nextInt();
       result(a);
        
    }

    static int result(int m){

     
        if(m<=45){
            System.out.println("fail");

        }
       else if(m<=50 && m>=41){

        System.out.println("grade is DD");
       }
       else if(m<=60 && m>=51){

        System.out.println("grade is cD");
       }
       else if(m<=70 && m>=61){

        System.out.println("grade is BC");
       }
       else{

        System.out.println("grade is AA");
       }

       return m;

    } 
    
    }    

